package org.example.dialog;

import org.example.button.Button;

public abstract class Dialog {

    public abstract Button createButton();

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }
}
