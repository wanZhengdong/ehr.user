package com.pd.ehr.user.vo;

import com.pd.api.DbVO;
import com.pd.api.annotation.Vo;

@Vo(name = "user", params = {"userId", "userCN", "employeeNumber"})
public class User extends DbVO
{
}
