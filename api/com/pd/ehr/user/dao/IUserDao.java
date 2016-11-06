package com.pd.ehr.user.dao;

import com.pd.api.IDao;
import com.pd.api.annotation.Dao;
import com.pd.ehr.user.vo.User;
import com.pd.ehr.user.vo.UserFo;

@Dao(apis = {""})
public interface IUserDao extends IDao<User, UserFo>
{
    
}
