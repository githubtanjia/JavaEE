package cn.service.impl;

import cn.service.AccountService;

import java.util.Date;

/**
 * @Author: tanjia
 * @Date: 2019/7/19 1:12
 */
public class AccountServiceImplDI2 implements AccountService {

    private String name;
    private Integer age;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("service的saveAccount方法执行了..."+name+"--"+age+"--"+birthday);
    }

}
