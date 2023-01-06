package org.itdebug.ui.dialog;

import org.itdebug.ui.button.Button;
import org.itdebug.ui.button.HTMLButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
