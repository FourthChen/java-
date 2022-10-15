package cn.itcast.day11.demo08;

import cn.itcast.day11.red.OpenMode;

import java.util.ArrayList;

public class NomalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list=new ArrayList<>();
        int avg=totalMoney/totalCount;
        int mod=totalMoney%totalCount;

        for (int i = 0; i < totalCount-1; i++) {
            list.add(avg);
        }
        list.add(avg+mod);
        return list;
    }
}
