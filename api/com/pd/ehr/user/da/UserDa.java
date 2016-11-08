package com.pd.ehr.user.da;

import com.pd.api.IDa;
import com.pd.api.annotation.Dao;
import com.pd.ehr.user.vo.User;
import com.pd.ehr.user.vo.UserF;

@Dao
public interface UserDa extends IDa<User, UserF>
{
    
}
