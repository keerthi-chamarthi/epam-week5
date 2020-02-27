package task_4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Estimate {
	private static final Logger LOGGER= LogManager.getLogger(Estimate.class); 
	int totalcost;
	void estimateCost(String material_standard,int total_area,String fully_automated)
	{
		if(material_standard.equals("Standard"))
			totalcost=1200*total_area;
		else if(material_standard.equals("AboveStandard"))
			totalcost=1500*total_area;
		else if(material_standard.equals("HighStandard"))
		{
			if(fully_automated.equals("Yes"))
			{
				totalcost=2500*total_area;
			}
			else
			{
				totalcost=1800*total_area;
			}
		}
		LOGGER.info("Your total cost will be:"+totalcost);
		LOGGER.warn("No harmful situations found");
	}
}
