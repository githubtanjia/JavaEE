package cn.dao;

import cn.domain.Account;
import cn.domain.User;

import java.util.List;

/**
 * @Author: tanjia
 * @Date: 2019/7/18 2:43
 */
public interface AccountDao {

    List<Account> findAll();

    List<Account> findByUid(Integer uid);


}
