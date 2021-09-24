package com.yaozhou.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;


/**
 * Created by WXHang on HANG at 2021/9/24 16:42
 * Desc：
 */
@Service
public class UserService {
    @Reference
    TicketService ticketService;
    //远程引用指定的服务，他会按照全类名进行匹配，看谁给注册中心注册了这个全类名
    public void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("消费者拿到"+ticket);
    }
}
