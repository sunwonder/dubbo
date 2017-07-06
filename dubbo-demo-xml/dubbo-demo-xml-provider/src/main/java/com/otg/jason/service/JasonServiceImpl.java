package com.otg.jason.service;

/**
 * Created by jason.guan on 2017/7/3.
 */
public class JasonServiceImpl implements  JasonService{

    @Override
    public String getUserInfo() {
        System.out.println("当这句话打印了，说明你成功了。");
        return "谢谢你访问了我的服务！";
    }
}
