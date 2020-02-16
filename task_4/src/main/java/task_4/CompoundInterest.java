package task_4;
import java.lang.Math;
public class CompoundInterest {
	double compound_interest;
	double calculateInterest(int principal,double rate_of_interest,int number_of_times,int time_elapsed)
	{
		double a=1+rate_of_interest/number_of_times;
		int b=number_of_times*time_elapsed;
		compound_interest=principal*(Math.pow(a,b));
		return compound_interest;
	}
}
