package task_4;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Client2 {
	private static final Logger LOGGER= LogManager.getLogger(Client2.class); 
		String material_standard;
		int total_area;
		String fully_automated;
		Client2()
		{
			Scanner sc=new Scanner(System.in);
			LOGGER.info("Material standard?Standard,AboveStandard,HighStandard");
			material_standard=sc.nextLine();
			LOGGER.info("Chosen HighStandard and need fully automated too?");
			fully_automated=sc.nextLine();
			total_area=sc.nextInt();
			LOGGER.debug("Your details are being sent");
			Estimate e=new Estimate();
			e.estimateCost(material_standard,total_area,fully_automated);
			sc.close();
		}
}