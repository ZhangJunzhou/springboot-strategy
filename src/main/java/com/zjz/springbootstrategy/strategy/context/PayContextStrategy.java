package com.zjz.springbootstrategy.strategy.context;

import com.zjz.springbootstrategy.strategy.PayStrategy;
import com.zjz.springbootstrategy.strategy.factory.StrategyFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @ClassName PayContextStrategy
 * @Author Junzhou Zhang
 * @Create 2022/6/13 20:52
 */
@Component
public class PayContextStrategy {
    /**
     * 使用上下文获取具体的策略实现
     * @param payCode
     * @return
     */
    public String toPayHtml(String payCode){
        if(StringUtils.isEmpty(payCode)){
            return "paycode不能为空";
        }

        // 使用策略工厂获取策略实现
        PayStrategy payStrategy = StrategyFactory.getPayStrategy(payCode);

        if(payStrategy == null){
            return "没有找到具体策略的实现";
        }

        return payStrategy.toPayHtml1();
    }
}
