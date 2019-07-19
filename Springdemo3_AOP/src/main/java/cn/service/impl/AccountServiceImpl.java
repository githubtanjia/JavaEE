package cn.service.impl;

import cn.service.AccountService;
import org.springframework.stereotype.Repository;

/**
 * @Author: tanjia
 * @Date: 2019/7/19 4:17
 */
@Repository("accountService")
public class AccountServiceImpl implements AccountService {
    public void saveAccount() {
        System.out.println("执行了保存操作...");
    }
}
