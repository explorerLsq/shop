package com.itheima.shop.service.impl;

import com.itheima.api.IUserService;
import com.itheima.shop.UserServiceApplication;
import com.itheima.shop.pojo.TradeUserMoneyLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserServiceApplication.class)
public class IUserServiceImplTest {

    @Autowired
    private IUserService iUserService;



    @Test
    public void chackMoney(){
        Long userId = 345963634385633280L;
        Long orderId = 450022585678303232L;

        TradeUserMoneyLog userMoneyLog = new TradeUserMoneyLog();
        userMoneyLog.setOrderId(orderId);
        userMoneyLog.setUserId(userId);
        userMoneyLog.setMoneyLogType(1);
        userMoneyLog.setUseMoney(new BigDecimal(100));

        iUserService.updateMoneyPaid(userMoneyLog);

    }
}