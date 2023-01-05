package org.example;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
        try {
            Dialog dialog = DialogFactory.createDialog("Windows");
            dialog.render();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
