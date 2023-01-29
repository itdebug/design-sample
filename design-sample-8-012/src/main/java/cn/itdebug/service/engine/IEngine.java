package cn.itdebug.service.engine;

import cn.itdebug.model.aggregates.TreeRich;
import cn.itdebug.model.vo.EngineResult;

import java.util.Map;

public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);
}
