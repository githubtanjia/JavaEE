package cn;

import cn.dao.AccountDao;
import cn.dao.impl.AccountDaoImpl;
import cn.service.AccountService;
import cn.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: tanjia
 * @Date: 2019/7/19 1:16
 *
 *
 * 获取spring的Ioc核心容器，并根据id获取对象
 * 核心容器的两个接口引发出的问题：
 *  ApplicationContext:     单例对象适用              采用此接口
 *      它在构建核心容器时，创建对象采取的策略是采用立即加载的方式。也就是说，只要一读取完配置文件马上就创建配置文件中配置的对象。
 *
 *  BeanFactory:            多例对象使用
 *      它在构建核心容器时，创建对象采取的策略是采用延迟加载的方式。也就是说，什么时候根据id获取对象了，什么时候才真正的创建对象。
 *
 * ApplicationContext的三个常用实现类：
 *      ClassPathXmlApplicationContext：它可以加载类路径下的配置文件，要求配置文件必须在类路径下。不在的话，加载不了。(更常用)
 *      FileSystemXmlApplicationContext：它可以加载磁盘任意路径下的配置文件(必须有访问权限）
 *      AnnotationConfigApplicationContext：它是用于读取注解创建容器的，是明天的内容。
 *
 *
 *
 */
public class TestDemo {



    @Test
    public void TestIOC(){
        //1.获取核心容器对象
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //ApplicationContext ac = new FileSystemXmlApplicationContext("D:\workspace\Git_javabase\Springdemo1\src\main\resources\bean.xml");
        //2.根据id获取bean对象
        //AccountDao accountDao = (AccountDao) ac.getBean("accountDao");
        AccountService accountService = ac.getBean("accountService", AccountService.class);

        //accountDao.saveAccount();
        accountService.saveAccount();

    }

}
