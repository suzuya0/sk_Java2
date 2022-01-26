public class Main_08_16 {
  public static void main(String[] args){
    //勇者を生成
    Hero_08_02 h = new Hero_08_02();
    //勇者フィールドに初期値を設定
    h.name = "ミナト";
    h.hp = 100;
    //きのこを生成
    Matango_08_15 m1 = new Matango_08_15();
    Matango_08_15 m2 = new Matango_08_15();
    //きのこフィールドに初期値を設定
    m1.hp = 50;
    m1.suffix = 'A';
    m2.hp = 48;
    m2.suffix = 'B';
    System.out.println("勇者" + h.name + "を生み出しました");
    //勇者のメソッドを呼び出していく
    h.sit(5);
    h.slip();
    m1.run();
    h.sit(25);
    m2.run();
    h.run();
  }
}
