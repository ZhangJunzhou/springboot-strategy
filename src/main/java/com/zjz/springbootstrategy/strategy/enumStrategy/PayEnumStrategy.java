package com.zjz.springbootstrategy.strategy.enumStrategy;

/**
 * @ClassName PayEnumStrategy
 * @Author Junzhou Zhang
 * @Create 2022/6/13 20:56
 *
 * 策略枚举类 所有策略的实现
 */
public enum PayEnumStrategy {
    /**
     * 支付宝支付
     */
    ALI_PAY("com.zjz.springbootstrategy.strategy.impl.AliPayStrategy"),

    /**
     * 微信支付
     */
    WE_CHAT_PAY("com.zjz.springbootstrategy.strategy.impl.WeChatPayStrategy");


    private String className;

    PayEnumStrategy(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
