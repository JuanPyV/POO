public class Kangaroo {

  private String name;
  private int age;
  private int jump;
  private String fight;

  public String getName(){ return name;}
  private void setName(String name){ this.name = name;}

  public int getAge(){ return age;}
  private void setAge(int age){ this.age = age;}

  public int getJump(){ return jump;}
  private void setJump(int jump){ this.jump = jump;}

  public String getFight(){ return fight;}
  private void setFight(String fight){ this.fight = fight;}

  public Kangaroo(){
    System.out.println("Default constructor");
    name = "Rocko";
    age = 8;
    jump = 2;
    fight = "si";
  }

  public Kangaroo(String name, int age, int jump, String fight){
    setName(name);
    setAge(age);
    setJump(jump);
    setFight(fight);
  }
}
