package com.pd.ehr.user.service;

import javax.inject.Named;

import com.pd.api.IDatabaseService;
import com.pd.api.annotation.Service;
import com.pd.ehr.user.UserServiceConst;
import com.pd.ehr.user.dao.IUserDao;
import com.pd.ehr.user.vo.User;
import com.pd.ehr.user.vo.UserFo;

@Named
@Service(name = UserServiceConst.USER, apis = {})
public interface IUserService extends IDatabaseService<User, UserFo, IUserDao>
{
    
}
