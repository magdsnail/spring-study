import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: MyTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Date: 2023-03-21 021 17:13
 * @Author: wangkejing
 */
public class MyTest {

    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//
//        userService.setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();
        //获取applicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl)context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
