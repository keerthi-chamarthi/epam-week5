package task_4;
import java.util.*;
public class Client2 {
		String material_standard;
		int total_area;
		String fully_automated;
		Client2()
		{
			Scanner sc=new Scanner(System.in);
			material_standard=sc.nextLine();
			fully_automated=sc.nextLine();
			total_area=sc.nextInt();
			Estimate e=new Estimate();
			e.estimateCost(material_standard,total_area,fully_automated);
			sc.close();
		}
}