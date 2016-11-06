package com.pd.ehr.user.vo;

import com.pd.api.DatabaseVO;
import com.pd.api.annotation.Vo;

@Vo(name = "user", params = {"userId", "userCN", "employeeNumber"})
public class User extends DatabaseVO
{
}
