package org.example.factory;

import org.example.dialog.Dialog;
import org.example.dialog.HtmlDialog;
import org.example.dialog.WindowsDialog;

public class DialogFactory {

    /**
     * 利用工厂方法模式创建
     * @param os
     * @return
     * @throws Exception
     */
    public static Dialog createDialog(String os) throws Exception {
        if (os == "Windows")
            return new WindowsDialog();
        else if (os == "Web")
            return new HtmlDialog();
        else
            throw new Exception("错误！未知的操作系统。");
    }
}
