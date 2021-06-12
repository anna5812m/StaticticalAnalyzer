package model;

import java.util.ArrayList;

public class Formulas {

    public static double variance(ArrayList<Double> list) {
       double sumDiffsSquared = 0.0;
        double avg = average(list);
        for (Double value : list)
        {
            double diff = value - avg;
            diff *= diff;
            sumDiffsSquared += diff;
        }
        return sumDiffsSquared  / (list.size()-1);
    }

    public static double average(ArrayList<Double> list) {
        return list.stream()
                .mapToInt(Double::intValue)
                .average()
                .orElse(0.00);
    }

    public static double deviation(ArrayList <Double> list){
        double stdDev = Double.NaN;
        if (list.size() > 0) {
          if (list.size() > 1) {
              stdDev = Math.sqrt(variance(list));
          } else {
              stdDev = 0.0;
          }
        }
      return stdDev;
    }
}
