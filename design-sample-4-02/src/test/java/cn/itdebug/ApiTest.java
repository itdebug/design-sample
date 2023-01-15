package cn.itdebug;

import cn.itdebug.util.Topic;
import cn.itdebug.util.TopicRandomUtil;
import org.junit.Test;

import java.util.*;

public class ApiTest {

    @Test
    public void test_QuestionBankService() throws CloneNotSupportedException {
        QuestionBankService questionBankService = new QuestionBankService();
        System.out.println(questionBankService.createPaper("张三", "100001"));
        System.out.println(questionBankService.createPaper("李四", "100002"));
        System.out.println(questionBankService.createPaper("王五", "100003"));
    }

    @Test
    public void test_shuffle() {
        List<String> keyList = new ArrayList<>();
        keyList.add("A");
        keyList.add("B");
        keyList.add("C");
        keyList.add("D");
        Collections.shuffle(keyList);
        System.out.println(keyList);
    }

    @Test
    public void test_random() {
        Map<String, String> map01 = new HashMap<String, String>();
        map01.put("A", "JAVA2 EE");
        map01.put("B", "JAVA2 Card");
        map01.put("C", "JAVA2 ME");
        map01.put("D", "JAVA2 HE");
        map01.put("E", "JAVA2 SE");

        Topic topic = TopicRandomUtil.random(map01, "B");
        System.out.println(topic.getOption());
        System.out.println("正确答案：" + topic.getKey());
    }
}
