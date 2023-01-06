package org.itdebug.ui.dialog;

import org.itdebug.ui.button.Button;

public abstract class Dialog {

    public abstract Button createButton();

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }
}
