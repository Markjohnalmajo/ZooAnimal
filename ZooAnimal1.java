public class ZooAnimal {
  
  private String name;
  private String type;
  private int age;
  private boolean hungry;

  public ZooAnimal() {
    this.hungry = true;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setAge(int age) {
    this.age = age;
  }
  
//getters

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public int getAge() {
    return age;
  }

  public boolean isHungry() {
    return hungry;    
  }
  
  public static void main(String[]args){	
  	ZooAnimal animal = new ZooAnimal();
  		
  	animal.setName("Zee");
  	animal.setType("Monkey");
  	animal.setAge(2);
  	
  	System.out.println("Name: " + animal.getName());
  	System.out.println("Type: " + animal.getType());
  	System.out.println("Age: " + animal.getAge());
  	
  	System.out.println(animal.isHungry() ? "The animal is hungry." : "The animal is not hungry.");
  	
  }
}