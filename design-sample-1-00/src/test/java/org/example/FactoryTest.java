package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.itdebug.ui.dialog.Dialog;
import org.itdebug.ui.factory.DialogFactory;

/**
 * Unit test for simple App.
 */
public class FactoryTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FactoryTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FactoryTest.class );
    }

    /**
     * 测试浏览器效果
     */
    public void testWeb()
    {
        try {
            Dialog dialog = DialogFactory.createDialog("Web");
            dialog.renderWindow();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 测试Windows效果
     */
    public void testWindows()
    {
        try {
            Dialog dialog = DialogFactory.createDialog("Windows");
            dialog.renderWindow();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
