public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // System.out.println(5 + 3);
        // System.out.println("5 + 3");

        // int i = 5;
        // int j = 10;
        // System.out.println(i + j);

        // String m1 = "人間って";
        // String m2 = "いいな";
        // System.out.println(m1 + m2);

        // float f = 11;
        // System.out.println(f);

        // char zodiac = '辰';
        // String name = "すがわら";
        // System.out.println(zodiac);
        // System.out.println(name);

        // int age = 20;
        // System.out.println("私の年齢は、" + age + "歳です。");
        // age = 35;
        // System.out.println("サバを読みました。実は、" + age + "歳です。");

        // final double pi = 3.14;
        // int pie = 5;
        // System.out.println("半径" + pie + "cmの体積は、");
        // System.out.println(pie * pie * pi);

        // String prof1 = "名前：ナマエタロウ\n(なまえたろう)";
        // String prof2 = """
        //                 名前：二ホンハナコ
        //                 (にほんはなこ)
        //                 """;
        // System.out.println(prof1);
        // System.out.println(prof2);

        // int a = 10;
        // int b = 10;
        // System.out.println(a++ + 50);
        // System.out.println(++b + 50);

        // int age2 = (int)5.5;
        // System.out.println(age2);

        // int a2 = 15;
        // int b2 = 20;
        // int m = Math.max(a2, b2);
        // System.out.println("比較実験：" + a2 + "と" + b2 + "で大きい方は…" + m + "です");
        // int n = Math.min(a2, b2);
        // System.out.println("比較実験：" + a2 + "と" + b2 + "で小さい方は…" + n + "です");

        // String Stringage = "20";
        // int Stringage2 =Integer.parseInt(Stringage);
        // System.out.println((Stringage2 + 1) + "歳です");

        // int r = new java.util.Random().nextInt(10);
        // System.out.println("選ばれた数は" + r + "でした");

        // // String Sinput = new java.util.Scanner(System.in).nextLine();
        // // System.out.println(Sinput);
        // // int Iinput = new java.util.Scanner(System.in).nextInt();
        // // System.out.println(Iinput);

        // boolean tenki = true;
        // if (tenki == true) {
        //     System.out.println("洗濯する");
        // } else {
        //     System.out.println("洗濯無理");
        // }
        
        // String str = "すっきり";
        // if(str.equals("すっきり")){
        //     System.out.println("同じ");
        // }

        // System.out.println("あなたの運勢を占います");
        // int fortune = new java.util.Random().nextInt(4) + 1;
        // if (fortune == 1) {
        //   System.out.println("大吉");
        // } else if (fortune == 2) {
        //   System.out.println("中吉");
        // } else if (fortune == 3) {
        //   System.out.println("吉");
        // } else {
        //   System.out.println("凶");
        // }

        // System.out.println("あなたの運勢を占います");
        // int fortune2 = new java.util.Random().nextInt(5) + 1;
        // switch (fortune2) {
        //   case 1, 2 -> {
        //     System.out.println("いいね！");
        //   }
        //   case 3 -> {
        //     System.out.println("普通です");
        //   }
        //   case 4, 5 -> {
        //     System.out.println("うーん...");
        //   }
        // }

        // for(int q = 0; q <= 5; q++){
        //     System.out.println("こんにちは");
        // }

        // for(int i_1 = 1;i_1 < 10;i_1++){
        //     for(int i_2 = 1;i_2 < 10; i_2++){
        //         System.out.println(i_1 * i_2);
        //     }
        // }

        // int sansu = 20;
        // int kokugo = 30;
        // int rika = 40;
        // int eigo = 50;
        // int syakai = 80;
    
        // int sum = sansu + kokugo + rika + syakai + eigo;
    
        // int avg = sum / 5;
        // System.out.println("合計点:" + sum);
        // System.out.println("平均点:" + avg);

        // int[] scores = new int[5];
        // int num = scores.length;
        // System.out.println("要素の数: " + num);

        // scores[1] = 30;
        // System.out.println(scores[1]);

        // int[] seq = new int[10];
        // for (int i = 0; i < seq.length; i++) {
        //   seq[i] = new java.util.Random().nextInt(4);
        // }
        // for (int i = 0; i < seq.length; i++) {
        //   switch (seq[i]) {
        //     case 0 -> {
        //       System.out.print("A ");
        //     }
        //     case 1 -> {
        //       System.out.print("T ");
        //     }
        //     case 2 -> {
        //       System.out.print("G ");
        //     }
        //     case 3 -> {
        //       System.out.print("C ");
        //     }
        //   }
        // }

        // int[][] scores2 = {{40, 50, 60}, {80, 60, 70}};
        // System.out.println(scores2.length);
        // System.out.println(scores2[0].length);
        
        System.out.println("メソッドを呼び出します");
        hello();
        System.out.println("メソッドの呼び出しが終わりました");

        introduceOneself();

        String title = "メールの宛先アドレス";
        String address = "メールのタイトル";
        String text = "メールの本文";
        email(title, address, text);
        email(title, text);
        
        double triangleArea = calcTriangleArea(10.0, 5.0);
        System.out.println("三角形の面積：" + triangleArea + "平方cm");
        double circleArea = calcCircleAria(5.0);
        System.out.println("円の面積：" + circleArea + "平方cm");
      }
      public static void hello() {
        System.out.println("湊さん、こんにちは");
      }

      public static void introduceOneself(){
        String name = "湊雄輔";
        int age = 22;
        double height = 169.9;
        char zodiac = '辰';
        System.out.println("私の名前は" + name + "です");
        System.out.println("歳は" + age + "です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("十二支は" + zodiac + "です");
      }
      public static void email(String title, String address, String text){
        System.out.println(title + "に、以下のメールを送信しました。");
        System.out.println("件名：" + address);
        System.out.println("本文：" + text);
      }
      public static void email(String title, String text){
        System.out.println(title + "に、以下のメールを送信しました。");
        System.out.println("件名：無題");
        System.out.println("本文：" + text);
      }
      public static double calcTriangleArea(double bottom, double height){
        double area = (bottom * height) / 2;
        return area;
      }
      public static double calcCircleAria(double radius){
        double area = radius * radius * 3.14;
        return area;
      }
}
