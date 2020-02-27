package task_4;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CompoundInterest {
	private static final Logger LOGGER= LogManager.getLogger(CompoundInterest.class);
	double compound_interest;
	double calculateInterest(int principal,double rate_of_interest,int number_of_times,int time_elapsed)
	{
		double a=1+rate_of_interest/number_of_times;
		int b=number_of_times*time_elapsed;
		compound_interest=principal*(Math.pow(a,b));
		LOGGER.fatal("No severe errors found!");
		return compound_interest;
	}
}
