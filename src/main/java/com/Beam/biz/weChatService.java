package com.Beam.biz;

import java.util.List;
import java.util.Map;

    public interface weChatService {

        //        添加用户信息
        Boolean insertCustomer(Map<String, Object> ParamsMap);

        //    查询商家外卖
        List<Map<String,Object>> findMenu();

        //        添加订单信息
        Boolean insertOrder(Map<String, Object> ParamsMap);

        //        查询商家详情页
        List<Map<String,Object>> findMerchant(Map<String, Object> ParamsMap);

        //    查询滚动页
        List<Map<String,Object>> findScrollBar();

        //   通过keyId查询订单信息
        List<Map<String,Object>> findOrderByKeyId(String keyId);
    
    }
