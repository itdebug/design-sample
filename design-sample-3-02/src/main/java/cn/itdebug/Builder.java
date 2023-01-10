package cn.itdebug;

import cn.itdebug.ceiling.LevelOneCeiling;
import cn.itdebug.ceiling.LevelTwoCeiling;
import cn.itdebug.coat.DuluxCoat;
import cn.itdebug.coat.LiBangCoat;
import cn.itdebug.floor.ShengXiangFloor;
import cn.itdebug.tile.DongPengTile;
import cn.itdebug.tile.MarcoPoloTile;

public class Builder {

    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelOneCeiling())
                .appendCeiling(new DuluxCoat())
                .appendCeiling(new ShengXiangFloor());
    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())
                .appendCeiling(new LiBangCoat())
                .appendCeiling(new MarcoPoloTile());
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())
                .appendCeiling(new LiBangCoat())
                .appendCeiling(new DongPengTile());
    }
}
