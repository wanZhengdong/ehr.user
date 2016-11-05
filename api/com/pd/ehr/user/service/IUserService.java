package com.pd.ehr.user.service;

import javax.inject.Named;

import com.pd.api.IDatabaseService;
import com.pd.ehr.user.dao.IUserDao;
import com.pd.ehr.user.vo.User;
import com.pd.ehr.user.vo.UserFilter;

@Named
public interface IUserService extends IDatabaseService<User, UserFilter, IUserDao>
{
    
}
