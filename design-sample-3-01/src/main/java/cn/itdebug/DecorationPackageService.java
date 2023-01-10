package cn.itdebug;

import cn.itdebug.ceiling.LevelOneCeiling;
import cn.itdebug.ceiling.LevelTwoCeiling;
import cn.itdebug.coat.DuluxCoat;
import cn.itdebug.coat.LiBangCoat;
import cn.itdebug.floor.ShengXiangFloor;
import cn.itdebug.tile.DongPengTile;
import cn.itdebug.tile.MarcoPoloTile;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DecorationPackageService {

    public String getMatterList(BigDecimal area, Integer level) {
        List<Matter> list = new ArrayList<>();//装修清单
        BigDecimal price = BigDecimal.ZERO; //装修价格

        //豪华欧式
        if(1 == level) {
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();
            DuluxCoat duluxCoat = new DuluxCoat();
            ShengXiangFloor shengXiangFloor = new ShengXiangFloor();

            list.add(levelTwoCeiling);
            list.add(duluxCoat);
            list.add(shengXiangFloor);

            price = price.add(area.multiply(new BigDecimal(0.2))).multiply(levelTwoCeiling.price());
            price = price.add(area.multiply(new BigDecimal(1.4))).multiply(duluxCoat.price());
            price = price.add(area.multiply(shengXiangFloor.price()));
        }

        // 轻奢田园
        if(2 == level) {
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();
            LiBangCoat liBangCoat = new LiBangCoat();
            MarcoPoloTile marcoPoloTile = new MarcoPoloTile();

            list.add(levelTwoCeiling);
            list.add(liBangCoat);
            list.add(marcoPoloTile);

            price = price.add(area.multiply(new BigDecimal(0.2))).multiply(levelTwoCeiling.price());
            price = price.add(area.multiply(new BigDecimal(1.4))).multiply(liBangCoat.price());
            price = price.add(area.multiply(marcoPoloTile.price()));
        }

        // 现代简约
        if(3 == level) {
            LevelOneCeiling levelOneCeiling = new LevelOneCeiling();
            LiBangCoat liBangCoat = new LiBangCoat();
            DongPengTile dongPengTile = new DongPengTile();

            list.add(levelOneCeiling);
            list.add(liBangCoat);
            list.add(dongPengTile);

            price = price.add(area.multiply(new BigDecimal("0.2"))).multiply(levelOneCeiling.price());
            price = price.add(area.multiply(new BigDecimal("1.4"))).multiply(liBangCoat.price());
            price = price.add(area.multiply(dongPengTile.price()));
        }

        StringBuilder detail = new StringBuilder("\r\n---------------------------------------------------------\r\n" +
                "装修清单：" + "\r\n" +
                "套餐等级：" + level + "\r\n" +
                "套餐等级：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) + " 元\r\n" +
                "房屋面积：" + area.doubleValue() + " 元\r\n" +
                "材料清单：\r\n");
        for(Matter matter:list) {
            detail.append(matter.scene()).append("：").append(matter.brand()).append("、").append(matter.model()).append("、平米价格：")
                    .append(matter.price()).append(" 元。\n");
        }

        return detail.toString();
    }
}
