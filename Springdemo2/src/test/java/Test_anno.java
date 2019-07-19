import cn.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: tanjia
 * @Date: 2019/7/19 3:02
 */
public class Test_anno {
    public static void main(String[] args) {
        //1.获取核心容器对象
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
        AccountService as  = (AccountService)ac.getBean("accountService");
//        AccountService as2  = (AccountService)ac.getBean("accountService");
//        System.out.println(as);
//        AccountDao adao = ac.getBean("accountDao",AccountDao.class);
//        System.out.println(adao);
//        System.out.println(as == as2);
        as.saveAccount();
        ac.close();
    }




}
