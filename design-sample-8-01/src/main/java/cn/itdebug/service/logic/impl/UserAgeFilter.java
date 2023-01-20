package cn.itdebug.service.logic.impl;

import cn.itdebug.service.logic.BasicLogic;

import java.util.Map;

public class UserAgeFilter extends BasicLogic {

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }
}
