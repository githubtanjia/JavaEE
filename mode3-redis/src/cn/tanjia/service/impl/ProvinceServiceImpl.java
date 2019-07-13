package cn.tanjia.service.impl;

import cn.tanjia.dao.ProvinceDao;
import cn.tanjia.dao.impl.ProvinceDaoImpl;
import cn.tanjia.domain.Province;
import cn.tanjia.service.ProvinceService;
import cn.tanjia.util.JedisPoolUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * @Author: tanjia
 * @Date: 2019/7/14 2:06
 */
public class ProvinceServiceImpl implements ProvinceService {

    private ProvinceDao provinceDao = new ProvinceDaoImpl();

    @Override
    public List<Province> findAll() {
        return provinceDao.findAll();
    }

    /**
     * 使用Redis缓存
     * @return
     */
    @Override
    public String findAll2() {

        Jedis jedis  = JedisPoolUtils.getJedis();
        String province = jedis.get("province");//从Redis获取province

        if (province == null || province.length() == 0){
            System.out.println("Redis中没有数据，去数据库查询");
            List<Province> list = provinceDao.findAll();
            System.out.println("将数据序列化为json(作为值)..province作为key..存入Redis");
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                province = objectMapper.writeValueAsString(list);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            jedis.set("province",province);
            jedis.close();
        }else {
            System.out.println("Redis有数据，从Redis查询");
        }

        return province;
    }
}
