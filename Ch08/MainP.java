public class MainP{
  public static void main(String[] args){
    Cleric C = new Cleric();
    C.name = "聖職者";
    System.out.println("テスト：" + C.name + "," + C.hp + "," + C.mp);
    C.hp--;
    System.out.println("テストHP：" + C.hp);
    C.selfAid();
    System.out.println("テストHP：" + C.hp);
    System.out.println("テストMP：" + C.mp);
    C.pray(4);
    System.out.println("テストMP：" + C.mp);
  }
}