package org.example.dialog;

import org.example.button.Button;
import org.example.button.HTMLButton;
import org.example.Dialog;

public class WebDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
