/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec01;

/**
 *
 * @author Trifonov
 */
public class Lec04part04 {

    public static void main(String[] args) throws Exception {
        System.out.println("Ok");
        System.out.println("2line");
        Lec04part04 ob = new Lec04part04();
        try {
            ob.m1();
            return;

        } catch (IndexOutOfBoundsException ex) {
//            System.out.println(ex);
            System.out.println("Выход за рамки");
        } catch (Exception ex) {
//            System.out.println(ex);
            System.out.println("" + ex.getMessage());
        } finally {
            System.out.println("!!!!!!!!!!!!!!!!!!!!");
        }
    }

    void m1()throws Exception{
        m2();
    }

    void m2() throws Exception  {
        int[] arr = new int[10];
        arr[1000] = 22;
        throw new Exception("Errorrrrrrrrrrrrrr");

    }
}

// простой метод
//        Lec04part04 ob = Lec04part04();
//        int res = ob.m1();
//        if (res == 0) {
//
//        } else {
//            switch (res) {
//                case -1:
////обработка ошибки
//                    break;
//                case -28:
//
//                    break;
//                default:
//                    throw new AssertionError();
//            }
//        }
//    int m1() {
//        //ccccc
//        if (err1) {
//            return -1;
//                
//        }
//        if (err2) {
//            return -28;
//        
//        }
//        if (isOk) {
//            return 0;
//        }
//    }
