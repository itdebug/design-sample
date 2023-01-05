package org.example;

import org.example.dialog.Dialog;
import org.example.factory.DialogFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Dialog dialog = DialogFactory.createDialog("Web");
            dialog.renderWindow();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
