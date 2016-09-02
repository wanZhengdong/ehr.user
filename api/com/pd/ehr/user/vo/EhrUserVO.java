package com.pd.ehr.user.vo;

import com.pd.common.vo.EhrLookUpVO;
import com.pd.ehr.core.vo.EhrBaseVO;

public class EhrUserVO extends EhrBaseVO
{
    private EhrLookUpVO sex;
    
    public EhrLookUpVO getSex()
    {
        return sex;
    }
    
    public void setSex(EhrLookUpVO sex)
    {
        this.sex = sex;
    }
}
