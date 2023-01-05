package org.example.button;

public class WindowsButton implements Button {


    @Override
    public void render() {
        System.out.println("根据 Windows 样式渲染按钮。");
    }

    @Override
    public void onClick() {
        System.out.println("绑定本地操作系统点击事件。");
    }


}
