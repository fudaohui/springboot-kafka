package com.fdh.kafka.lisener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * kafka消费者测试
 */
@Component
public class KafkaLisener {

    @KafkaListener(topics = "test")
    public void listen (ConsumerRecord<?, ?> record) throws Exception {
        System.out.printf("------>partion = %s,topic = %s, offset = %d, value = %s \n", record.partition(),record.topic(), record.offset(), record.value());
    }
}
