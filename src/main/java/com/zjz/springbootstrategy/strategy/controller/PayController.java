package com.zjz.springbootstrategy.strategy.controller;

import com.zjz.springbootstrategy.strategy.context.PayContextStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PayController
 * @Author Junzhou Zhang
 * @Create 2022/6/13 21:15
 */
@RestController
public class PayController {
    @Autowired
    private PayContextStrategy payContextStrategy;

    @RequestMapping("/pay")
    public String toPayHtml(String payCode){
        return payContextStrategy.toPayHtml(payCode);
    }
}
