package com.fdh.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.concurrent.FailureCallback;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.SuccessCallback;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaApplicationTests {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Test
    public void contextLoads() {

        ListenableFuture listenableFuture = kafkaTemplate.send("test","77", "hello kafka");
        listenableFuture.addCallback(new SuccessCallback() {
            @Override
            public void onSuccess(Object o) {
                System.out.println("成功！");
            }
        }, new FailureCallback() {
            @Override
            public void onFailure(Throwable throwable) {
                System.out.println("失败！");
            }
        });
    }

}
