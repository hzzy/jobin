package com.rocketmq.zy;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.util.Random;

public class Producer {
    public static void main(String[] args) {
        DefaultMQProducer producer = new DefaultMQProducer("pg1");
        producer.setNamesrvAddr("192.168.172.112:9876");
        try {
            producer.start();
            for (int i = 0; i < 100000000; i++) {
                Thread.sleep(new Random().nextInt(100) + 1);
                String message =  "{\"title\":\"X市2021年度第四季度税务汇总数据\"}";
                SendResult result = producer.send(new Message("sample-data", "tag1", message.getBytes()));
                System.out.println("消息已发送：" + result.getMsgId() + " , status= " + result.getSendStatus());
            }
        } catch (MQClientException | RemotingException | MQBrokerException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            producer.shutdown();
        }
    }
}
