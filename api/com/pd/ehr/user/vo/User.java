package com.pd.ehr.user.vo;

import com.pd.ehr.vo.DatabaseVO;

public class User extends DatabaseVO
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
