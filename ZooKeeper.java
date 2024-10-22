public class ZooKeeper{
	
	private String name;
	private String title;
	private double payRate;
	private boolean degree;
	
	public ZooKeeper() {	
	}
	
	//setter
	public void setName(String name){
		this.name = name;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setPayRate(double playRate){
		this.payRate = playRate;
	}
	//getters 
	public String getName(){
		return name;
	}
	public String getTitle(){
		return title;
	}
	public double getPayRate(){
		return payRate;
	}
	public boolean hasDegree(){
		return degree;
	}
	
	 public static void main(String[]args){	
  	ZooKeeper keeper = new ZooKeeper();
  		
  	keeper.setName("Negro");
  	keeper.setTitle("Manager");
  	keeper.setPayRate(15.00);
  	
  	System.out.println("Name: " + keeper.getName());
  	System.out.println("Title: " + keeper.getTitle());
  	System.out.println("Payrate: " + keeper.getPayRate());

	 }
}