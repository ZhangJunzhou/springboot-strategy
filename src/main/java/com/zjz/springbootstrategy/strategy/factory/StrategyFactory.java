package com.zjz.springbootstrategy.strategy.factory;

import com.zjz.springbootstrategy.strategy.PayStrategy;
import com.zjz.springbootstrategy.strategy.enumStrategy.PayEnumStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

/**
 * @ClassName StrategyFactory
 * @Author Junzhou Zhang
 * @Create 2022/6/13 21:04
 */
@Slf4j
public class StrategyFactory {
    //使用策略工厂获取具体的策略实现

    public static PayStrategy getPayStrategy(String stategyType){
        // 获取具体策略的class地址
        try{
            // 根据枚举类 找到payCode对应的class文件
            String className = PayEnumStrategy.valueOf(stategyType).getClassName();
            // 利用反射机制 查找class文件对应的实例
            return (PayStrategy) Class.forName(className).newInstance();
        }
        catch (Exception exception){
            return null;
        }

        
    }

}
