public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("ミナト");
        // h1.name = "ミナト";
        // h1.hp = 100;
        System.out.println(h1.hp);
        System.out.println(h1.name);

        Hero h2 = new Hero();
        // h2.name = "アサカ";
        // h2.hp = 100;

        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;

        w.heal(h1);
        w.heal(h2);
        w.heal(h2);

        int baseHp = 25;
        Thief t = new Thief("アサカ", baseHp);
        heal(baseHp);
        System.out.println(baseHp + " : " + t.hp);
        heal(t);
        System.out.println(baseHp + " : " + t.hp);

        SuperHero sh = new SuperHero();
        sh.run();
        h1.run();

        // Sword s = new Sword();
        // s.name = "炎の剣";
        // s.damage = 10;
        // Hero h = new Hero();
        // h.name = "ミナト";
        // h.hp = 100;
        // h.sword = s;

        // h.attack();
        // System.out.println("現在の武器は" + h.sword.name);
      }

      public static void heal(int hp) {
        hp += 10;
      }
      public static void heal(Thief thief) {
        thief.hp += 10;
      }
}
