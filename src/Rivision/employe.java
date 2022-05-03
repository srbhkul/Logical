package Rivision;

public class employe {
     	private int id;
		private String name;
		private int age;
		private String dateOfJoining;
		private double salary;
		
		public employe(int id,String name,int age,String dateOfJoining,double salary) {
			super();
			this.id=id;
			this.name=name;
			this.age=age;
			this.dateOfJoining=dateOfJoining;
			this.salary=salary;}
    public int getID() {
    	return id;}
   public void  setID(int id) {
	this.id=id;}
	public String getName() {
		return name;}
	  public void  setName(String name) {
			this.name=name;}
	    public int getAge() {
	    	return age;}
	   public void  setAge(int age) {
		this.age=age;}
		public String getDateOfJoinging() {
			return dateOfJoining;}
		  public void  setDateOfJoining(String dateOfJoining) {
				this.dateOfJoining=dateOfJoining;}	  
		   public double getSalary() {
		    	return salary;}
		   public void  setSalary(double salary) {
			this.salary=salary;  }
		   
}