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

        String prof1 = "名前：ナマエタロウ\n(なまえたろう)";
        String prof2 = """
                        名前：二ホンハナコ
                        (にほんはなこ)
                        """;
        System.out.println(prof1);
        System.out.println(prof2);

        int a = 10;
        int b = 10;
        System.out.println(a++ + 50);
        System.out.println(++b + 50);

        int age2 = (int)5.5;
        System.out.println(age2);

        int a2 = 15;
        int b2 = 20;
        int m = Math.max(a2, b2);
        System.out.println("比較実験：" + a2 + "と" + b2 + "で大きい方は…" + m + "です");
        int n = Math.min(a2, b2);
        System.out.println("比較実験：" + a2 + "と" + b2 + "で小さい方は…" + n + "です");
    }
}
