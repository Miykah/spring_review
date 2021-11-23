import com.miykah.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author miykah
 * @create 2021-11-23 21:05
 */
public class SpringTest {

    @Test
    public void test1(){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User user = context.getBean("user", User.class);
        user.add();

    }

}
