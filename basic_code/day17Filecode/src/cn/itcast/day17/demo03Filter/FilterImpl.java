package cn.itcast.day17.demo03Filter;

import java.io.File;
import java.io.FileFilter;

public class FilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return true;
    }
}
