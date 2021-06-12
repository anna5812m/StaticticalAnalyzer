package model;

import java.io.File;
import java.util.ArrayList;

public abstract class Filter1 implements Step<File, ArrayList<Double>> {

    private Filter1 processor;
    protected int shift=0;

    public Filter1(Filter1 processor){
        this.processor = processor;
    }

    public void setParameter(String in) {
        shift=in.length();
    }
}