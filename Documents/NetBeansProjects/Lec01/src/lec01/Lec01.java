package lec01;

public class Lec01 {

    public static void main(String[] args) {




        // к статике обращаться не через объект, а через имя класса
    }

}

/*  4 спецификатора доступа:

1. public
2. private
3. protected
4. default
 */
class MyCls {

    private int abc;
    private int def = 10;

    public static int NS;

    public MyCls() {
        this(13, 22);
        System.out.println("bla-blah-balh");
    }

    //конструктор
    public MyCls(int a, int def) {
        abc = a;
        this.def = def;
    }

    public double met01(int a, int b) {
        int x = 0;
        System.out.println("a= " + a + ", b= " + b);
        return a - 10 + b * 0.1;
    }

}

class Child extends MyCls {

    public Child(int a, int def) {
        super(a, def);
    }

}
