package assignment.streamsandwriters.problem2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

//fill your code

public class UserBO {

	public void saveAllUser(List<User> userList, String fileName) throws FileNotFoundException, IOException {

		File file = new File(fileName);
		try {
			BufferedWriter brWriter = new BufferedWriter(new FileWriter(file));
			for (User user : userList) {
				brWriter.write(user.toString());
				brWriter.newLine();
			}
			brWriter.flush();
			brWriter.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
