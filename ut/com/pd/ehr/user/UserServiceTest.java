package com.pd.ehr.user;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pd.ehr.user.service.IUserService;
import com.pd.ehr.vo.User;

public class UserServiceTest
{
    private static IUserService userService;
    
    @Test
    public void testCount()
    {
        System.out.println(1);
        User user = new User();
        userService.getDao().add(user);
    }
    
    @BeforeClass
    public static void setUp()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"spring-autoscan.xml"});
        System.out.println(ctx.containsBean("ehrUserService"));
        System.out.println(ctx.containsBean("iEhrUserService"));
        Object bean = ctx.getBean(IUserService.class);
        userService = ctx.getBean("ehrUserService", IUserService.class);
    }
}
