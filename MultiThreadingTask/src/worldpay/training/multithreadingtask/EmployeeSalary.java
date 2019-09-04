package worldpay.training.multithreadingtask;

public class EmployeeSalary extends Thread {
	private int eno;
	private String ename;
	private double basicSal;
	
	public void calculateHRA() {
		System.out.println("HRA of "+getName()+" is "+basicSal*(0.1));
	}
	
	public void calculateDA() {
		System.out.println("DA of "+getName()+" is "+basicSal*(0.25));
	}
	
	public void calculateCA() {
		System.out.println("CA of "+getName()+" is "+basicSal*(0.1));
	}
	@Override
	public void run() {
		calculateHRA();
		calculateDA();
		calculateCA();
	}

	
	
	public EmployeeSalary(int eno, String ename, double basicSal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.basicSal = basicSal;
	}

	public static void main(String[] args) {
		EmployeeSalary e1 = new EmployeeSalary(1,"aaa",50000); e1.setName("Emp1");
		EmployeeSalary e2 = new EmployeeSalary(2, "bbb", 40000); e2.setName("Emp2");
		EmployeeSalary e3 = new EmployeeSalary(3, "ccc", 60000); e3.setName("Emp3");
		EmployeeSalary e4 = new EmployeeSalary(4, "ddd", 75000); e4.setName("Emp4");
		EmployeeSalary e5 = new EmployeeSalary(5, "eee", 30000); e5.setName("Emp5");
		
		e1.start();
		e2.start();
		e3.start();
		e4.start();
		e5.start();
	}

}
