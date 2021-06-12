package model;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class ReadingData extends Filter1 implements Step <File, ArrayList<Double>> {

    public TextArea textArea;

    public ReadingData(Filter1 processor) {
        super(processor);
    }

  /*  public static ArrayList<Double> createChartData(File file) {
        ArrayList<Double> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            do {
                String s = reader.readLine();
                if (s == null) break;
                String[] s1 = s.split(",");
                for (int i=0; i<s1.length; i++)
                list.add(Double.parseDouble(s1[i]));
            } while (reader.readLine() != null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }*/

    @Override
    public ArrayList<Double> execute(File input) {
        ArrayList<Double> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(input))) {
            do {
                String s = reader.readLine();
                if (s == null) break;
                String[] s1 = s.split(",");
                for (int i=0; i<s1.length; i++)
                    list.add(Double.parseDouble(s1[i]));
            } while (reader.readLine() != null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}




