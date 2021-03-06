package com.gary.ecommercewebsite.dao;

import com.gary.ecommercewebsite.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    private Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

    @Autowired
    UserMapper userMapper;

    @Test
    public void selectByPrimaryKey() {

        User user = userMapper.selectByPrimaryKey(13);
        assertEquals("geely", user.getUsername());
    }
}