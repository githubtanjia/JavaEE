package cn.service.impl;

import cn.dao.AccountDao;
import cn.dao.impl.AccountDaoImpl;
import cn.service.AccountService;

import java.util.Date;

/**
 * @Author: tanjia
 * @Date: 2019/7/19 1:12
 */
public class AccountServiceImplDI1 implements AccountService {

    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImplDI1(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("service的saveAccount方法执行了..."+name+"--"+age+"--"+birthday);
    }

}
