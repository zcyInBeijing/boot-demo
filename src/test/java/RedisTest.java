import com.xfs.Application;
import com.xfs.util.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TODO
 *
 * @author zhuchunyang
 * @date 2020/10/27 14:19
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
public class RedisTest {

    @Autowired
    RedisUtils redisUtils;

    @Test
    public void setValue(){
        redisUtils.set("myName","zhucy");
    }
    @Test
    public void getValue(){
        log.info("------------------:{}",redisUtils.get("myName"));
    }
}
