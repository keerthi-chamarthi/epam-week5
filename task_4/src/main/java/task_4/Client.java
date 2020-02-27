package task_4;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Client
{
	int principal;
	double rate_of_interest;
	int tenure;
	int number_of_times;
	int time_elapsed;
	double simple_interest;
	double compound_interest;
	private static final Logger LOGGER= LogManager.getLogger(Client.class);
	double[] enterValues()
	{
		Scanner sc=new Scanner(System.in);
		LOGGER.info("Enter amount,rate of interest,tenure,number of times,time_elapsed");
		//System.out.println("Enter amount,rate,time,n_t,time_elapsed");
		principal=sc.nextInt();
		rate_of_interest=sc.nextDouble();
		tenure=sc.nextInt();
		number_of_times=sc.nextInt();
		time_elapsed=sc.nextInt();
		SimpleInterest s=new SimpleInterest();
		simple_interest=s.calculate(principal,rate_of_interest,tenure);
		LOGGER.debug("Simple interest calculation done");
		CompoundInterest c=new CompoundInterest();
		compound_interest=c.calculateInterest(principal,rate_of_interest,number_of_times,time_elapsed);
		LOGGER.debug("Compund interest calculation done");
		double[] a=new double[2];
		a[0]=simple_interest;
		a[1]=compound_interest;
		sc.close();
		return a;
	}
};
