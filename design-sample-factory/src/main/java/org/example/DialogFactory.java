package org.example;

import org.example.dialog.WebDialog;
import org.example.dialog.WindowsDialog;

public class DialogFactory {

    public static Dialog createDialog(String os) throws Exception {
        if (os == "Windows")
            return new WindowsDialog();
        else if (os == "Web")
            return new WebDialog();
        else
            throw new Exception("错误！未知的操作系统。");

    }
}
