package com.yaozhou.server;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created by WXHang on HANG at 2021/9/24 16:40
 * Desc：
 */
@Service //将服务发布出去
@Component //放在容器中
public class TicketServiceImp implements TicketService{
    @Override
    public String getTicket() {

        return "尧神崛起";
    }
}
