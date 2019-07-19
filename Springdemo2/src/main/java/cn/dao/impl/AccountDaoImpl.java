package cn.dao.impl;

import cn.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @Author: tanjia
 * @Date: 2019/7/19 2:51
 */
@Repository("accountDao1")
public class AccountDaoImpl implements AccountDao {

    public void saveAccount() {
        System.out.println("1111");
    }
}
