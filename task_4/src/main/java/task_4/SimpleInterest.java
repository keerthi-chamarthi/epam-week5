package task_4;

public class SimpleInterest {
	double calculate(int principal,double rate_of_interest,int tenure)
	{
		double simple_interest=(principal*rate_of_interest*tenure)/100;
		return simple_interest;
	}
}
