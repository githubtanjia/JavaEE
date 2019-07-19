package cn.service.impl;

import cn.dao.AccountDao;
import cn.dao.impl.AccountDaoImpl;
import cn.service.AccountService;

/**
 * @Author: tanjia
 * @Date: 2019/7/19 1:12
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao = new AccountDaoImpl();//此处依赖关系有待解决
    //private AccountDao accountDao;
    public void saveAccount() {
        System.out.println("service...");
        accountDao.saveAccount();
    }
    public void init(){
        System.out.println("init....");
    }
    public void destroy(){
        System.out.println("destroy....");
    }
}
