package org.example;

import org.example.button.Button;

public abstract class Dialog {

    public abstract Button createButton();

    public void render() {
        // 调用工厂方法创建一个产品对象。
        Button okButton = createButton();
        // 现在使用产品。
        okButton.onClick();
        okButton.render();
    }
}
