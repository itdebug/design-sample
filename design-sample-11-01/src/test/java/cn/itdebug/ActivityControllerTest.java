package cn.itdebug;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ActivityController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @createTime: 02/17/2023
 */
public class ActivityControllerTest {

    private Logger logger = LoggerFactory.getLogger(ActivityControllerTest.class);

    private ActivityController activityController = new ActivityController();

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: queryActivityInfo(Long id)
     */
    @Test
    public void testQueryActivityInfo() throws Exception {
        //TODO: Test goes here...
        for(int idx =0; idx < 10; idx ++) {
            Long req = 10001L;
            Activity activity = activityController.queryActivityInfo(req);
            logger.info("测试结果：{} {}", req, JSON.toJSONString(activity));
            Thread.sleep(1000);
        }
    }


} 
