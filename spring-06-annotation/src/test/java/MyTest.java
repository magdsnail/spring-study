import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: MyTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Date: 2023-03-22 022 16:05
 * @Author: wangkejing
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        String name = user.name;
        System.out.println(name);
    }
}
