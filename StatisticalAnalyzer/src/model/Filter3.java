package model;

import javafx.scene.chart.XYChart;

import java.util.ArrayList;

public abstract class Filter3 implements Step<ArrayList<Double>, XYChart.Series<String, Double>> {

    private Filter3 processor;
    protected int shift = 0;

    public Filter3(Filter3 processor) {
        this.processor = processor;
    }

    public void setParameter(String in) {
        shift = in.length();
    }
}