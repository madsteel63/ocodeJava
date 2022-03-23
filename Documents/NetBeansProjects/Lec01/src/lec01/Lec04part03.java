package lec01;

import java.util.ArrayList;

public class Lec04part03 {

    public static void main(String[] args) {
        //byte,   short,  int,        long,   boolean,    char,       float,  double
        //обёртки над простыми типами - объёекты
        //Byte,   Short,  Integer,    Long,   Boolean,    Character,  Float,  Double

//        Double d = 3.5;
//        double res= 5.5 + d;
//        System.out.println(""+d+" - "+res);
//        
//        String s = String.valueOf(3.14);
//        double d2 = Double.parseDouble(s);
//        System.out.println(""+(d2+5));
//        ArrayList<Double> a = new ArrayList<>();
        ArrayList ar = new ArrayList();
        ar.add("aaaaaa");
        ar.add(new StringBuilder());
        ar.add(3.14);
        
        System.out.println(""+ar.get(2));

    }

}
