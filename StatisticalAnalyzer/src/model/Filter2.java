package model;

import java.io.File;
import java.util.ArrayList;

public abstract class Filter2 implements Step<ArrayList<Double>, ArrayList<Double>> {

    private Filter2 processor;
    protected int shift = 0;

    public Filter2(Filter2 processor) {
        this.processor = processor;
    }

    public void setParameter(String in) {
        shift = in.length();
    }
}