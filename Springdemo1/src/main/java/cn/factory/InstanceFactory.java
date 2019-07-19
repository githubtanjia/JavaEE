package cn.factory;

import cn.service.AccountService;
import cn.service.impl.AccountServiceImpl;

/**
 * @Author: tanjia
 * @Date: 2019/7/19 1:55
 */
public class InstanceFactory {
    public AccountService getAccountService(){
        return  new AccountServiceImpl();
    }
}
