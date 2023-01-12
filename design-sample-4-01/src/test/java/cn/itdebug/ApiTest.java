package cn.itdebug;

import org.junit.Test;

public class ApiTest {

    @Test
    public void test_QuestionBankService() {
        QuestionBankService questionBankService = new QuestionBankService();
        System.out.println(questionBankService.createPaper("张三", "100001"));
        System.out.println(questionBankService.createPaper("李四", "100002"));
        System.out.println(questionBankService.createPaper("王五", "100003"));
    }
}
