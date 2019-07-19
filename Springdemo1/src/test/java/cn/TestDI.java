package cn;

import cn.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: tanjia
 * @Date: 2019/7/19 2:26
 */
public class TestDI {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = ac.getBean("accountService_fuza", AccountService.class);
        accountService.saveAccount();
    }

}
