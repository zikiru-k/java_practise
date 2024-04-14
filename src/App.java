public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(5 + 3);
        System.out.println("5 + 3");

        int i = 5;
        int j = 10;
        System.out.println(i + j);

        String m1 = "人間って";
        String m2 = "いいな";
        System.out.println(m1 + m2);

        float f = 11;
        System.out.println(f);

        char zodiac = '辰';
        String name = "すがわら";
        System.out.println(zodiac);
        System.out.println(name);

        int age = 20;
        System.out.println("私の年齢は、" + age + "歳です。");
        age = 35;
        System.out.println("サバを読みました。実は、" + age + "歳です。");

        final double pi = 3.14;
        int pie = 5;
        System.out.println("半径" + pie + "cmの体積は、");
        System.out.println(pie * pie * pi);
    }
}
