package com.xfs.filter;


import com.xfs.base.ResultVO;
import com.xfs.base.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Path;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ldx
 * @Date 2019-08-15 13:24
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 参数校验异常
     * <p>使用 @Valid 注解，方法上加@RequestBody注解修饰的方法未校验通过会抛MethodArgumentNotValidException，否则抛BindException。
     * <p>使用 @Validated 注解，未校验通过会抛ConstraintViolationException
     * <p>关于 @Valid和@Validated注解的区别:
     * <p> 这两个注解都是实现JSR-303规范，不同的是@Validated是spring的注解支持groups以及可以用在spring mvc处理器的方法级别入参验证 ，@Valid是Javax提供的注解，可以支持多个bean嵌套验证。
     *
     * @param request 请求
     * @param e 异常
     * @return 返回
     */
    @ExceptionHandler({MethodArgumentNotValidException.class, BindException.class, ConstraintViolationException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResultVO<Object> handleValidateException(HttpServletRequest request, Exception e) {
        log.warn("execute method exception error.url is {}", request.getRequestURI(), e);
        BindingResult br = null;
        if (e instanceof BindException) {
            br = ((BindException) e).getBindingResult();
        }
        if (e instanceof MethodArgumentNotValidException) {
            br = ((MethodArgumentNotValidException) e).getBindingResult();
        }
        if (br != null) {
            List<FieldError> fieldErrors = br.getFieldErrors();
            Map<String, String> map = new HashMap<>(fieldErrors.size());
            for (FieldError fieldError : fieldErrors ) {
                map.merge(fieldError.getField(), Objects.requireNonNull(fieldError.getDefaultMessage()), (oldValue, newValue) -> oldValue.concat(",").concat(newValue));
            }
            return ResultVOUtil.paramError(map);
        }
        if (e instanceof ConstraintViolationException) {
            Set<ConstraintViolation<?>> constraintViolations = ((ConstraintViolationException) e).getConstraintViolations();
            Map<Path, String> collect = constraintViolations.stream().collect(Collectors.toMap(ConstraintViolation::getPropertyPath, ConstraintViolation::getMessage));
            return ResultVOUtil.success(collect);
        }
        return ResultVOUtil.paramError(null);
    }


}

