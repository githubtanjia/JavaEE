package cn;

import cn.dao.AccountDao;
import cn.dao.UserDao;
import cn.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: tanjia
 * @Date: 2019/7/18 18:14
 */
public class TestAccount {
    private InputStream in;
    private SqlSession sqlSession;
    private AccountDao accountDao;

    @Before
    public void init() throws IOException {
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        sqlSession = factory.openSession();
        //4.获取dao的代理对象
        accountDao = sqlSession.getMapper(AccountDao.class);
    }

    @After
    public void destory() throws IOException {
        //提交事务
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }

    @Test
    public void test1(){
        List<Account> list = accountDao.findAll();
        /*System.out.println(list);*/
    }

}
