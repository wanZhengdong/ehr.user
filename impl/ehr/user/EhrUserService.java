package ehr.user;

import com.pd.ehr.core.itf.IEhrDatabaseService;
import com.pd.ehr.core.itf.IEhrExcelService;
import com.pd.ehr.core.service.EhrCommonService;
import com.pd.ehr.user.service.impl.EhrUserDatabaseService;

public class EhrUserService extends EhrCommonService
{
    
    @Override
    public IEhrDatabaseService getDataBaseService()
    {
        return new EhrUserDatabaseService();
    }
    
    @Override
    public IEhrExcelService getExcelService()
    {
        return null;
    }
    
}
