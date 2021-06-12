package model;

import java.util.ArrayList;
import java.util.Collections;

public class Account extends Filter2 implements Step<ArrayList<Double>, ArrayList<Double>>{

    Formulas formula = new Formulas();

    public Account(Filter2 processor) {
        super(processor);
    }

    @Override
    public ArrayList<Double> execute(ArrayList<Double> input) {
        ArrayList<Double> listValue = new ArrayList<>();
        listValue.add(Collections.min(input));
        listValue.add(Collections.max(input));
        listValue.add(formula.average(input));
        listValue.add(formula.variance(input));
        listValue.add(formula.deviation(input));
        return listValue;
    }
}
