package com.xfs.util;

import cn.hutool.core.util.StrUtil;
import com.xfs.base.ArgsErrorCode;
import com.xfs.base.ServiceException;
import org.hibernate.validator.HibernateValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @Description: 验证
 **/

public class ValidationUtil {

    private static final Logger logger = LoggerFactory.getLogger(ValidationUtil.class);

    private static Validator validator = Validation.byProvider(HibernateValidator.class).configure().failFast(true)
            .buildValidatorFactory().getValidator();

    public static <T> void validate(T obj) throws ServiceException {
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(obj);
        if (constraintViolations.size() > 0) {
            String errorCode = constraintViolations.iterator().next().getMessage();
            if(StrUtil.isBlank(errorCode)){
                logger.info("错误码为空！");
                return ;
            }
            String msg = ArgsErrorCode.errorMsgMap.get(Integer.parseInt(errorCode));
            throw new ServiceException(Integer.parseInt(errorCode),msg);
        }
    }
}
