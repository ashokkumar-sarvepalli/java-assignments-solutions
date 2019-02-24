package assignment.objectaccessencapsulationstatic.problem3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of role :");

		
		int n = Integer.parseInt(buff.readLine());

		
		
		Role[] roleArray = new Role[n];
		String name = null;
		String description = null;
		String privilegeslist = null;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the role "+(i+1)+" details");
			System.out.println("Enter role name :");
			name = buff.readLine();
			System.out.println("Enter description :");
			description = buff.readLine();
			System.out.println("Enter the privileges :");
			//Admin, Guide the team, Supporting  the team.
			privilegeslist = buff.readLine();

			String[] privil = privilegeslist.split(",");
			Privilege[] plist = new Privilege[privil.length];
			for (int j = 0; j < privil.length; j++) {
				plist[j] = new Privilege(privil[j]);

			}

			roleArray[i] = new Role(name, description, plist);

		}
		
		RoleBO rb = new RoleBO();
		rb.display(roleArray);

	}
}