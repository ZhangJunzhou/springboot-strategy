package com.zjz.springbootstrategy.strategy;

/**
 * @ClassName PayStrategy
 * @Author Junzhou Zhang
 * @Create 2022/6/13 20:47
 */
public interface PayStrategy {
    /**
     * 共同方法的行为
     * @return
     */
    String toPayHtml1();
}
