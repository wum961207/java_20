package com.lemon.easyApiTest.cases;
import com.alibaba.fastjson.JSONPath;
import com.lemon.easyApiTest.Utils.UserData;
import com.lemon.easyApiTest.pojo.CaseInfo;
import com.lemon.easyApiTest.Utils.ExcelUtils;
import com.lemon.easyApiTest.Utils.HttpUtils;
import com.lemon.easyApiTest.pojo.WriteBackData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class RegisterCase extends BaseCase{
    @Test(dataProvider = "datas")
    public void test(CaseInfo caseInfo) {
        //调用注册接口
        String responseBody =  HttpUtils.call(caseInfo,UserData.DEFAUT_HEADERS);
        //断言
        assertFunction(caseInfo.getExpectedResult(), responseBody);
        addWriteBaseData(sheetIndex,caseInfo.getId(),8,responseBody);
    }

    @DataProvider(name = "datas")
    public Object[] datas() {
        List list = ExcelUtils.read(sheetIndex,sheetNum,CaseInfo.class,path);
        return list.toArray();
    }
}
