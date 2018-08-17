// Juan Pablo Velazco Velasquez

public class Computer {

  private int memory;
  private float cpu;
  private String boot;
  private String compile;

  public int getMemory(){ return memory;}
  private void setMemory(int memory){ this.memory = memory;}

  public float getCpu(){ return cpu;}
  private void setCpu(float cpu){this.cpu = cpu;}

  public String getBoot(){return boot;}
  private void setBoot(String boot){ this.boot = boot;}

  public String getCompile(){return compile;}
  private void setCompile(String compile){this.compile = compile;}

  public Computer(){
    System.out.println("Default constructor");
    memory = 16;
    cpu = 4;
    boot = "si";
    compile = "no";
  }

  public Computer(int memory, float cpu, String boot, String compile){
    setMemory(memory);
    setCpu(cpu);
    setBoot(boot);
    setCompile(compile);
  }
}
