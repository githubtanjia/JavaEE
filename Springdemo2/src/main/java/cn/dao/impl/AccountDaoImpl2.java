package cn.dao.impl;

import cn.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @Author: tanjia
 * @Date: 2019/7/19 2:51
 */
@Repository("accountDao2")
public class AccountDaoImpl2 implements AccountDao {

    public void saveAccount() {
        System.out.println("1111");
    }
}
