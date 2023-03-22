import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: MyTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Date: 2023-03-22 022 10:02
 * @Author: wangkejing
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicatioinContext.xml");

        User user = (User) context.getBean("User");
        user.show();
    }
}
