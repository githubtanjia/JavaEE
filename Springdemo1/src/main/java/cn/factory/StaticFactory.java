package cn.factory;

import cn.service.AccountService;
import cn.service.impl.AccountServiceImpl;

/**
 * @Author: tanjia
 * @Date: 2019/7/19 1:56
 */
public class StaticFactory {
    public static AccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
