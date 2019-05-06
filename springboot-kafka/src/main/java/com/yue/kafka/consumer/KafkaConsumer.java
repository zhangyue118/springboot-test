package com.yue.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author: zhangyue
 * @date: 2019/5/6 16:44
 * @description:
 */
@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"app_log"})
    public void receive(String message){
        System.out.println("app_log--消费消息:" + message);
    }

}
