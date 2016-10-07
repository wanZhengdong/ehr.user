package com.pd.ehr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pd.ehr.user.dao.IUserDao;
import com.pd.ehr.user.service.IUserService;

@Service
public class UserService implements IUserService
{
    @Autowired
    private IUserDao userDao;
    
    @Override
    public IUserDao getDao()
    {
        // TODO Auto-generated method stub
        return userDao;
    }
    
}