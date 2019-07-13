package cn.tanjia.web.servlet;

import cn.tanjia.domain.Province;
import cn.tanjia.service.ProvinceService;
import cn.tanjia.service.impl.ProvinceServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: tanjia
 * @Date: 2019/7/14 2:09
 */
@WebServlet("/provinceServlet")
public class ProvinceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProvinceService provinceService = new ProvinceServiceImpl();

        /*List<Province> list = provinceService.findAll();
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(list);//将list转换为json字符串
        //System.out.println(json);
        //响应回前端页面
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);*/

        String listJson = provinceService.findAll2();
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(listJson);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
