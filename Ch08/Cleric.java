public class Cleric{
  //名前
  String name;
  //HP
  int hp = 50;
  //最大HP
  final int  MAX_HP = 50;
  //MP
  int mp = 10;
  //最大MP
  final int MAX_MP = 10;

  //MPを5消費してHPを全回復
  public void selfAid(){
    System.out.println(this.name + "はセルフエイドを唱えた!");
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println(this.name + "のHPが全回復した");
  }

  //祈った秒数でMP回復
  public int pray(int sec){
    System.out.println(this.name + "は" + sec + "秒祈った");
    int n = new java.util.Random().nextInt(3);
    int sum = n + sec;
    if(this.mp + sum >= this.MAX_MP){
      this.mp = this.MAX_MP;
      System.out.println(this.name + "のMPは全回復した！");
    } else {
      this.mp += sum;
      System.out.println(this.name + "のMPは" + sum + "回復し、" + this.mp + "になった");
    }
    return this.mp;
  }

  //別解
  //int recover = new Random().nextInt(3) + sec;
  //int recoveractual = Math.min(this.MAX_MP - this.mp, recover);
  //this.mp += recoveractual;

}