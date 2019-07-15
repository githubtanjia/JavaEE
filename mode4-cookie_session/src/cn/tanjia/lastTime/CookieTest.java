package cn.tanjia.lastTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: tanjia
 * @Date: 2019/7/14 16:56
 */
@WebServlet("/t")
public class CookieTest extends HttpServlet {

    private int count = 1;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie[] cookies = req.getCookies();
        boolean flag = false;//用来判断是否有lastTime这个cookie

        if (cookies != null && cookies.length > 0) {    //有cookie
            for (Cookie cookie : cookies) {
                String cookieName = cookie.getName();
                if ("lastTime".equals(cookieName)){ //存在cookie：lastTime
                    flag = true;
                    //获取上次访问时间，返回
                    String lastTime = cookie.getValue();//上次访问时间
                    lastTime = URLDecoder.decode(lastTime,"utf-8");
                    resp.getWriter().write("<h1>欢迎回来，您上次访问时间为:"+ lastTime +"</h1>");
                    //获取此次访问时间，并且替换之前的时间
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_date = dateFormat.format(new Date());//获取当前时间 并且转换为字符串
                    str_date = URLEncoder.encode(str_date,"utf-8");//存在特殊字符，需要编码
                    cookie.setValue(str_date);//当前cookie:lastTime的值设为当前访问时间
                    resp.addCookie(cookie);
                }
                if (cookies == null || cookies.length == 0 || flag == false){
                    //获取此次访问时间，并且替换之前的时间
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_date = dateFormat.format(new Date());//获取当前时间 并且转换为字符串
                    str_date = URLDecoder.decode(str_date,"utf-8");
                    cookie.setValue(str_date);//当前cookie:lastTime的值设为当前访问时间
                    resp.addCookie(cookie);
                    resp.getWriter().write("<h1>第一次访问，此次访问时间为："+ str_date +"</h1>");
                }

            }
        }




    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
