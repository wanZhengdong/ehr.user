
import java.io.File;
import java.util.List;

import org.junit.Test;

import com.pd.ehr.core.itf.IEhrExcelService;
import com.pd.ehr.user.service.impl.EhrUserExcelService;

public class ExcelImportTest
{
    
    @Test
    public void test()
    {
        IEhrExcelService excelImportService = new EhrUserExcelService(new File("E:/daily.xls"));
        List imports = excelImportService.imports();
        System.out.println(imports.size());
    }
    
}
