package com.pd.ehr.service.impl;

import org.springframework.stereotype.Service;

import com.pd.ehr.core.util.EhrContextUtil;
import com.pd.ehr.user.da.UserDa;
import com.pd.ehr.user.service.IUserService;

@Service
public class UserService implements IUserService
{
    private UserDa userDa;
    
    @Override
    public UserDa getDao()
    {
        if (userDa == null)
        {
            userDa = (UserDa)EhrContextUtil.getBean("userDa", UserDa.class);
        }
        return userDa;
    }
    
}
