import com.kuang.config.KuangConfig;
import com.kuang.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: MyTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Date: 2023-03-22 022 22:28
 * @Author: wangkejing
 */
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式去做 我们就只能通过 AnnotationConfig 上下文来获取容器 通过配置类的class对象加载
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KuangConfig.class);
        User getUser = (User)context.getBean("getUser");
        System.out.println(getUser);
    }
}
