package com.fdh.kafka.Partitioner;


/**
 * 分区算法
 * @author lws
 * @version V1.0  
 * @since JDK1.8 2017年10月19日
 */
public interface Partitioner {
	/**
	 * 分区算法
	 * @param key 对象key
	 * @param numPartitions 分区总数
	 * @return
	 */
	public int partition(Object key, int numPartitions);
}
