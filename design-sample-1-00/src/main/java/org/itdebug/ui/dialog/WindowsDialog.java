package org.itdebug.ui.dialog;

import org.itdebug.ui.button.Button;
import org.itdebug.ui.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
