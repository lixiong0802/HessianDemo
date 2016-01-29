import com.service.ISayHelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2016/1/29 9:40
 * Desc:
 */
public class Test {

    public static void main(String[] args) {
        ISayHelloService sayHelloService = getBean(ISayHelloService.class, "sayHelloService");
        System.out.println(sayHelloService.doSayHello("王五"));
        //客户端必须启用重载方法支持  不然会抛出Caused by: com.caucho.hessian.io.HessianProtocolException: '�' is an unknown code异常
        System.out.println(sayHelloService.doSayHello("李四", "welcome"));
    }

    public static <T> T getBean(Class<T> clazs, String beanName) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-hessianClient.xml");
        return clazs.cast(applicationContext.getBean(beanName));
    }

}
