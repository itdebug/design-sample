package cn.itdebug.service.engine;

import cn.itdebug.model.aggregates.TreeRich;
import cn.itdebug.model.vo.EngineResult;

import java.util.Map;

public interface IEngine {

    EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);
}
