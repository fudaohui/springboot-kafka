///*
// * 文件名： VinPartitioner.java
// *
// * 创建日期： 2017年2月24日
// *
// * Copyright(C) 2017, by <a href="mailto:liws@xingyuanauto.com">liws</a>.
// *
// * 原始作者: liws
// *
// */
//package com.fdh.kafka.Partitioner;
//
//
//
//public class VinPartitioner implements Partitioner {
//
//	@Override
//	public int partition(Object key, int numPartitions) {
//		int hCode = key.hashCode();
//		int partitionIndex = Math.abs(hCode)%numPartitions;
//		return partitionIndex;
//	}
//
//}
