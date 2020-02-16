package task_4;

public class Estimate {
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
		System.out.println(totalcost);
		
	}
}
