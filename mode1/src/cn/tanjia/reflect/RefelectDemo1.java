package cn.tanjia.reflect;

import cn.tanjia.reflect.domain.Person;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author: tanjia
 * @Date: 2019/7/5 3:42
 */
public class RefelectDemo1 {
    public static void main(String[] args) throws Exception {

        //获取class对象的三种方式
       /* Class<?> cls = Class.forName("cn.tanjia.reflect.domain.Person");
        System.out.println(cls +"  类名："+ cls.getName());

        Class<Person> cls2 = Person.class;
        System.out.println(cls2);

        Person p = new Person();
        Class<? extends Person> cls3 = p.getClass();
        System.out.println(cls3);*/

       //获取成员变量们
       /* Class<?> aClass = Class.forName("c");
        Person p = new Person("tanjia",18);
        
        //Field name = aClass.getField("name");//获取指定属性(public修饰)
        Field field = aClass.getDeclaredField("name");
        //System.out.println(name);

        field.setAccessible(true);//暴力反射 由于是private修饰，所以暴力反射获取
        field.set(p,"tj");
        Object name_ = field.get(p);
        System.out.println(name_);

        Field[] fields = aClass.getDeclaredFields();//获取所有成员变量
        for (Field f : fields) {
            f.setAccessible(true);
            Object o = f.get(p);
            System.out.println(o);
        }*/


        //获取构造方法
        /*Class<Person> aClass = Person.class;
        Constructor<Person> dc = aClass.getDeclaredConstructor();//无参构造
        Constructor<Person> dc2 = aClass.getDeclaredConstructor(String.class,int.class);//有参构造

        Person p = dc.newInstance();
        System.out.println(p);
        p = dc2.newInstance("tj2",19);
        System.out.println(p);

        Person person = aClass.newInstance();
        System.out.println("无参构造方法的另外一种简单方式"+p);*/

        /*Person p = new Person("tanjia",18);
        Class<? extends Person> aClass = p.getClass();

        Method eat = aClass.getDeclaredMethod("eat");
        eat.invoke(p);

        Method eat2 = aClass.getDeclaredMethod("eat", String.class);
        eat2.invoke(p,"西瓜");*/

        //可以创建任意类的对象，可以执行任意方法
        /*
            前提：不能改变该类的任何代码。可以创建任意类的对象，可以执行任意方法
         */

        Properties pro = new Properties();
        //获取class目录下的配置文件
        ClassLoader classLoader = RefelectDemo1.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        Class<?> aClass = Class.forName(className);
        Method method = aClass.getMethod(methodName);

        Object o = aClass.newInstance();

        method.invoke(o);


    }
}
