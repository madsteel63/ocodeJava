package lec01;

/**
 *
 * @author Trifonov
 */
public class Lec03 {

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = new String("abcd");
        String str3 = "abcd";
        str2 = str1.replace('c', 'x');
//        System.out.println("" + str2 + " " + str1);

//        StringBuffer sbuf;
        StringBuilder sbild; //будем использовать чаще - для однопоточных процессов
//        if (str1.equals(str2)) {
//            System.out.println("Строки равны");
//        } else {
//            System.out.println("Строки не равны");
//        }
    }

}
