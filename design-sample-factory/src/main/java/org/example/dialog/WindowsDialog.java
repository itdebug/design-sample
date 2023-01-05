package org.example.dialog;

import org.example.button.Button;
import org.example.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
