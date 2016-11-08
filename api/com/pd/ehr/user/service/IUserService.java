package com.pd.ehr.user.service;

import javax.inject.Named;

import com.pd.api.IDbService;
import com.pd.api.annotation.Service;
import com.pd.ehr.user.UserServiceConst;
import com.pd.ehr.user.da.UserDa;
import com.pd.ehr.user.vo.User;
import com.pd.ehr.user.vo.UserF;

@Named
@Service(name = UserServiceConst.USER, apis = {})
public interface IUserService extends IDbService<User, UserF, UserDa>
{
    
}
