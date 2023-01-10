package cn.itdebug;

public interface IMenu {

    IMenu appendCeiling(Matter matter);
    IMenu appendCoat(Matter matter);
    IMenu appendFloor(Matter matter);
    IMenu appendTile(Matter matter);
    String getDetail();
}
