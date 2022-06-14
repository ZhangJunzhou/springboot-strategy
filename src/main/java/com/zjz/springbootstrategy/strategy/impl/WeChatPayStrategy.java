package com.zjz.springbootstrategy.strategy.impl;

import com.zjz.springbootstrategy.strategy.PayStrategy;

/**
 * @ClassName WeChatPayStrategy
 * @Author Junzhou Zhang
 * @Create 2022/6/13 20:50
 */
public class WeChatPayStrategy implements PayStrategy {
    @Override
    public String toPayHtml1() {
        return "调用微信支付接口------WeChatPayStrategy";
    }
}
