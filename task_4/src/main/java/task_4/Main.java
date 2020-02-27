package task_4;
import org.apache.logging.log4j.*;
public class Main {
	private static final Logger LOGGER= LogManager.getLogger(Main.class); 
	public static void main(String[] args) {
		Client call=new Client();
		double simple_interest;
		double compound_interest;
		double[] a=new double[2];
		a=call.enterValues();
		simple_interest=a[0];
		compound_interest=a[1];
		//System.out.println("Simple Interest:"+simple_interest);
		//System.out.println("Compound Interest:"+compound_interest);
		LOGGER.info("Simple Interest:"+simple_interest);
		LOGGER.info("Compound Interest:"+compound_interest);
	}
}
