package worldpay.training.multithreadingtask;

public class Employee implements Runnable {

	private int eno;
	private String ename;
	private double basicSal;
	
	
	public void calculateHRA() {
		System.out.println("HRA of "+Thread.currentThread().getName()+" is "+basicSal*(0.1));
	}
	
	public void calculateDA() {
		System.out.println("DA of "+Thread.currentThread().getName()+" is "+basicSal*(0.25));
	}
	
	public void calculateCA() {
		System.out.println("CA of "+Thread.currentThread().getName()+" is "+basicSal*(0.1));
	}
	
	@Override
	public void run() {
		
		calculateHRA();
		calculateDA();
		calculateCA();
	}
	
	
	
	public Employee(int eno, String ename, double basicSal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.basicSal = basicSal;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"aaa",50000); 
		Employee e2 = new Employee(2, "bbb", 40000); 
		Employee e3 = new Employee(3, "ccc", 60000); 
		Employee e4 = new Employee(4, "ddd", 75000); 
		Employee e5 = new Employee(5, "eee", 30000); 
		
		Thread t1= new Thread(e1); t1.setName("Emp1");
		Thread t2= new Thread(e2); t2.setName("Emp2");
		Thread t3= new Thread(e3); t3.setName("Emp3");
		Thread t4= new Thread(e4); t4.setName("Emp4");
		Thread t5= new Thread(e5); t5.setName("Emp5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}