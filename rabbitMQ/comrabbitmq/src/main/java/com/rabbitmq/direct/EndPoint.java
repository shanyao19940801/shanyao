package com.rabbitmq.direct;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class EndPoint {
    protected Channel channel;
    protected Connection connection;
    protected String QueueName;

    public EndPoint(String QueueName) throws Exception {

        this.QueueName = QueueName;

        //创建一个连接工厂 connection factory
        ConnectionFactory factory = new ConnectionFactory();

        //设置rabbitmq-server服务IP地址
        factory.setHost("47.100.211.121");
        factory.setUsername("shanyao");
        factory.setPassword("123456");
        factory.setPort(5672);
        factory.setVirtualHost("/");

        //得到 连接
        connection = factory.newConnection();

        //创建 channel实例
        channel = connection.createChannel();

        //direct模式的exchange
        channel.queueDeclare(QueueName, false, false, false, null);
    }

    /**
     * 关闭channel和connection。并非必须，因为隐含是自动调用的。
     * @throws Exception
     */
    public void close() throws Exception{
        this.channel.close();
        this.connection.close();
    }
}
