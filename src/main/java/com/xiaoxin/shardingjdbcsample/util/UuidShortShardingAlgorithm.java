package com.xiaoxin.shardingjdbcsample.util;

import io.shardingsphere.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;

/**
 * @author zhangyongxin
 * @date 2018/10/19 3:05 PM
 */
public class UuidShortShardingAlgorithm implements PreciseShardingAlgorithm<BigDecimal> {
    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<BigDecimal> preciseShardingValue) {
        BigDecimal idvalue = preciseShardingValue.getValue();
        BigDecimal index = idvalue.remainder(new BigDecimal(availableTargetNames.size()));
        for (String tableName : availableTargetNames) {
            if (tableName.endsWith(index.toString())) {
                return tableName;
            }
        }
        throw new UnsupportedOperationException("未找到相应索引的表");
    }
}
