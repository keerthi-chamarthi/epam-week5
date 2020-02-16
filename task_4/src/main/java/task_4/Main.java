package task_4;

public class Main {
	public static void main(String[] args) {
		Client call=new Client();
		double simple_interest;
		double compound_interest;
		double[] a=new double[2];
		a=call.enterValues();
		simple_interest=a[0];
		compound_interest=a[1];
		System.out.println("Simple Interest:"+simple_interest);
		System.out.println("Compound Interest:"+compound_interest);
		
	}
}
