package com.lemon.easyApiTest.cases;

import com.lemon.easyApiTest.Utils.ExcelUtils;
import com.lemon.easyApiTest.Utils.HttpUtils;
import com.lemon.easyApiTest.pojo.CaseInfo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class RechargeCase extends BaseCase{

    @Test(dataProvider = "datas")
    public void test(CaseInfo caseInfo) {
        HashMap<String, String> headers = getAuthorization();
        String responseBody = HttpUtils.call(caseInfo,headers);
        //断言
        assertFunction(caseInfo.getExpectedResult(), responseBody);
        addWriteBaseData(sheetIndex,caseInfo.getId(),8, responseBody);
    }

    @DataProvider(name = "datas")
    public Object[] datas() {
        List list = ExcelUtils.read(sheetIndex,sheetNum,CaseInfo.class,path);
        return list.toArray();
    }
}
