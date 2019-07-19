package cn;

import cn.dao.UserDao;
import cn.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @Author: tanjia
 * @Date: 2019/7/18 2:59
 *
 * 映射文件和注解
 */
public class TestMybatis {

    private InputStream in;
    private SqlSession sqlSession;
    private SqlSessionFactory factory;
    private UserDao userDao;

    @Before
    public void init() throws IOException {
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取SqlSessionFactory
        factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        sqlSession = factory.openSession();
        //4.获取dao的代理对象
        userDao = sqlSession.getMapper(UserDao.class);
    }

    @After
    public void destory() throws IOException {
        //提交事务
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }

    /*public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        in.close();
    }*/





    @Test
    public void testFindAll(){
        //5.执行查询所有方法
        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }
    }
    @Test
    public void testFindAll2(){
        //5.执行查询所有方法
        List<User> users = userDao.findAll2();
        /*for(User user : users){
            System.out.println(user);
        }*/
    }
    @Test
    public void testFindByUsername(){
        List<User> users = userDao.findByUsername("%谭%");
        for(User user : users){
            System.out.println(user);
        }
    }
    @Test
    public void testFindById(){
        User user = userDao.findById(1);
        System.out.println(user);
    }
    @Test
    public void testCount(){
        int count = userDao.count("男");
        System.out.println(count);
    }
    @Test
    public void findUserByCondition(){
        User user = new User();
        List<User> users = userDao.findUserByCondition(user);
        for(User u : users){
            System.out.println(u);
        }
    }

    /**
     * 一级缓存：默认情况下就是一级缓存
     * 	它指的是Mybatis中SqlSession对象的缓存。
     * 	当我们执行查询之后，查询的结果会同时存入到SqlSession为我们提供一块区域中。
     * 	该区域的结构是一个Map。当我们再次查询同样的数据，mybatis会先去sqlsession中
     * 	查询是否有，有的话直接拿出来用。
     * 	当SqlSession对象消失时，mybatis的一级缓存也就消失了。
     */
    @Test
    public void testCache(){
        User user = userDao.findById(1);
        System.out.println(user);
        //sqlSession.close();
        //sqlSession = factory.openSession();
        //sqlSession.clearCache();
        //userDao = sqlSession.getMapper(UserDao.class);

        User user2 = userDao.findById(1);

        System.out.println(user==user2);

    }


    @Test
    public void testInsert(){
        User user = new User("啊",new Date(),"男");
        userDao.saveUser(user);
    }


    @Test
    public void testDelete(){
        userDao.deleteUser(4);
    }

    @Test
    public void testUpdateUser(){
        User user = new User(4,"啊",new Date(),"女");
        userDao.updateUser(user);
    }

}
