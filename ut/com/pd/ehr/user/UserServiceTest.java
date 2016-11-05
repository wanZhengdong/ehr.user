package com.pd.ehr.user;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pd.ehr.service.impl.UserService;
import com.pd.ehr.user.service.IUserService;
import com.pd.ehr.user.vo.User;

public class UserServiceTest
{
    private static IUserService service;
    
    @Test
    public void testAdd()
    {
        IUserService service = new UserService();
        User user = new User();
        user.setName("test");
        service.add(user);
    }
    
    @Test
    public void test1()
    {
        //
        // service = new UserService();
        // User user = new User();
        // user.setName("test");
        // service.add(user);
    }
    
    @BeforeClass
    public static void setUp()
    {
    }
}
