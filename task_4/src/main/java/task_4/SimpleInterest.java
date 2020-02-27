package task_4;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SimpleInterest {
	private static final Logger LOGGER= LogManager.getLogger(SimpleInterest.class);
	double calculate(int principal,double rate_of_interest,int tenure)
	{
		double simple_interest=(principal*rate_of_interest*tenure)/100;
		LOGGER.error("No errors found");
		return simple_interest;
	}
}
