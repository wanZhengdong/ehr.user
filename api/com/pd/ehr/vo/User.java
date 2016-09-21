package com.pd.ehr.vo;

public class User extends DatabaseVO
{
    private LookUp sex;
    
    public LookUp getSex()
    {
        return sex;
    }
    
    public User setSex(LookUp sex)
    {
        this.sex = sex;
        return this;
    }
}
