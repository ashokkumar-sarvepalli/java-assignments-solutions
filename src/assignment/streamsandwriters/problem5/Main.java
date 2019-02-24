package assignment.streamsandwriters.problem5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        
    	File file = new File("input.txt");

		try {

			BufferedReader brReader = new BufferedReader(new FileReader(file));
			List<Item> userList = new ArrayList<Item>();
			String st;
			while ((st = brReader.readLine()) != null) {
				
				String [] split = st.split("\\s+");
				Item user = new Item(Long.parseLong(split[0]),split[1], Integer.parseInt(split[2]), Long.parseLong(split[3]), Double.parseDouble(split[4]));
				userList.add(user);
			}
			brReader.close();
			
			int delCount=0;
           
			for(Item item : userList) {
				if(item.getDeleted()==1) {
					delCount++;
				}
			}
			
			System.out.println("Number of deleted items : "+delCount);
			System.out.println("Number of active items : "+(userList.size()-delCount));
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

    }
    
}