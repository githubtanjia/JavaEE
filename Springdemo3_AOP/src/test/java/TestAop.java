import cn.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: tanjia
 * @Date: 2019/7/19 4:21
 */
public class TestAop {
    public static void main(String[] args) {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");
        //2.获取对象
        AccountService as = (AccountService)ac.getBean("accountService");
        //3.执行方法
        as.saveAccount();
    }
}
