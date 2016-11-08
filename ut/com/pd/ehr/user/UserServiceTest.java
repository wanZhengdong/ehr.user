package com.pd.ehr.user;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pd.ehr.service.impl.UserService;
import com.pd.ehr.user.service.IUserService;
import com.pd.ehr.user.vo.User;
import com.pd.ehr.user.vo.UserF;

public class UserServiceTest
{
    
    @Test
    public void testAdd()
    {
        IUserService service = new UserService();
        User user = new User();
        user.setName("test");
        service.c(user);
    }
    
    @Test
    public void testSelect()
    {
        IUserService service = new UserService();
        UserF userF = new UserF();
        userF.setName("test");
        User r = service.r(userF);
        assertEquals("test", r.getName());
    }
    
    @BeforeClass
    public static void setUp()
    {
    }
}
