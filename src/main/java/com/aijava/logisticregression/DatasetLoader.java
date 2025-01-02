package com.aijava.logisticregression;

import java.util.ArrayList;
import java.util.List;

public class DatasetLoader {
    public static List<DataPoint> loadData() {
        List<DataPoint> data = new ArrayList<>();
        data.add(new DataPoint(new double[]{2.0, 5.0}, 1));
        data.add(new DataPoint(new double[]{1.0, 2.0}, 0));
        data.add(new DataPoint(new double[]{3.0, 6.0}, 1));
        data.add(new DataPoint(new double[]{1.5, 2.5}, 0));
        return data;
    }
}
