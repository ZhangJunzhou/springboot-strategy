package com.zjz.springbootstrategy.strategy.impl;

import com.zjz.springbootstrategy.strategy.PayStrategy;

/**
 * @ClassName AliPayStrategy
 * @Author Junzhou Zhang
 * @Create 2022/6/13 20:48
 */
public class AliPayStrategy implements PayStrategy {
    @Override
    public String toPayHtml1() {
        return "调用支付宝支付接口-------AliPayStrategy";
    }
}
