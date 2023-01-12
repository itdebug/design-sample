package cn.itdebug;

import cn.itdebug.util.Topic;
import cn.itdebug.util.TopicRandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class QuestionBank implements Cloneable {

    private String candidate;
    private String number;
    private ArrayList<ChoiceQuestion> choiceQuestionList = new ArrayList<>();
    private ArrayList<AnswerQuestion> answerQuestionList = new ArrayList<>();

    public QuestionBank append(ChoiceQuestion choiceQuestion) {
        choiceQuestionList.add(choiceQuestion);
        return this;
    }

    public QuestionBank append(AnswerQuestion answerQuestion) {
        answerQuestionList.add(answerQuestion);
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank)super.clone();
        questionBank.choiceQuestionList= (ArrayList<ChoiceQuestion>) choiceQuestionList.clone();
        questionBank.answerQuestionList= (ArrayList<AnswerQuestion>) answerQuestionList.clone();

        Collections.shuffle(choiceQuestionList);
        Collections.shuffle(answerQuestionList);

        ArrayList<ChoiceQuestion> choiceQuestionList = questionBank.choiceQuestionList;
        for(ChoiceQuestion choiceQuestion:choiceQuestionList) {
            Topic random = TopicRandomUtil.random(choiceQuestion.getOption(), choiceQuestion.getKey());
            choiceQuestion.setOption(random.getOption());
            choiceQuestion.setKey(random.getKey());
        }
        return questionBank;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder detail = new StringBuilder("考生：" + candidate + "\r\n" +
                "考号：" + number + "\r\n" +
                "------------------------------------------\r\n" +
                "一、选择题" + "\r\n\n"
        );

        for(int idx = 0;idx < choiceQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(choiceQuestionList.get(idx).getName()).append("\r\n");
            Map<String, String> option = choiceQuestionList.get(idx).getOption();
            for(String key : option.keySet()) {
                detail.append(key).append("：").append(option.get(key)).append("\r\n");
            }
            detail.append("答案：").append(choiceQuestionList.get(idx).getKey()).append("\r\n\n");
        }

        detail.append("二、问答题" + "\r\n\n");

        for(int idx = 0; idx < answerQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(answerQuestionList.get(idx).getName()).append("\r\n");
            detail.append("答案：").append(answerQuestionList.get(idx).getKey()).append("\r\n\n");
        }
        return detail.toString();
    }
}
