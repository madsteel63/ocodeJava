package lec01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Lec04part02 {

    //массивы
    public static void main(String[] args) {

//        Vector v;
        ArrayList<String> ar = new ArrayList<>();
        ar.add("aaa");
        ar.add("bbb");
        ar.add("ccc");
        ar.add("ddd");
        for (int i = 0; i < ar.size(); i++) {
            System.out.println("" + ar.get(i));
        }
        
        ArrayList<Double> dArr = new ArrayList<>(Arrays.asList(new Double[]{1.0,2.1,3.3}));
        for (int i = 0; i < 3; i++) {
            System.out.println(""+ dArr.get(i));
        }
        
        

        int a[] = new int[10]; //Можно и так, но лучше после типа
        int[] b = {4, 3, 2, 1};
        a[0] = 22;
        //a[9] = 33;
        a[a.length - 1] = 33; // лучше писать так
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 10;
//            System.out.print(""+a[i]+",");
        }
        System.out.println();

        //РОВНЫЙ МАССИВ
        int[][] a2 = new int[5][10];

        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
//                System.out.print("" + a2[i][j] + " ");
            }
//            System.out.println("");

        }

        //НЕРОВНЫЙ МАССИВ
        int[][] a3 = new int[5][];
        for (int i = 0; i < a3.length; i++) {
            a3[i] = new int[i + 1];
        }

        for (int i = 0; i < a3.length; i++) {
            for (int j = 0; j < a3[i].length; j++) {
                System.out.print("" + a3[i][j] + " ");
            }
            System.out.println("");

        }

    }

}
