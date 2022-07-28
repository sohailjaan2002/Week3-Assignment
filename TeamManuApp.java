package java18project;

import java.util.Scanner;

public class TeamManuApp {

	static	Scanner s = new Scanner(System.in);
	static int addingindex = 0;
	public static void main(String[] args) {
		
		/*Add team member
		 * View team member
		 * View all team member
		 * Delete team member by position
		 * Delete all team members
		 */

		String[] team = new String[5];
		int decision = 0;
		
		while(decision != -1) {
			showMenu();
			decision = s.nextInt();
			
			if(decision < -1 || decision > 5) {
				System.out.println("Please pick a valid option!");
			}else if(decision == 1){
				showTeam(team);
			}else if(decision == 2) {
				showTeamMembers(team);
			}else if(decision == 3) {
				addTeamMember(team);
			}else if(decision == 4) {
				deleteTeamMember(team);
			}else {
				deleteAllTeamMember(team);
			}
		}
		
	}
	
	

	public static void showTeam(String[] team) {
		System.out.println("Team");
		
		for(int i = 0; i < team.length; i++)
			System.out.println(i+ " : "+ team[i]);
		
	}	
	public static void showTeamMembers(String[] team) {
		System.out.println("Which team member would you like to see? ");
		int teamNumber = s.nextInt();
		if(isValid(teamNumber)) {
		System.out.println(teamNumber+ " : " + team[teamNumber]);
		}
	}
	
	public static void addTeamMember(String[] team) {
		System.out.print("Enter new member name: ");
		String newMember = s.next();
		if(isValid(addingindex)) {
		team[addingindex++]=newMember;
		}
	}
		
	public static void deleteTeamMember(String[] team) {
		System.out.print("Which team member you would like to delete? ");
		int memberTodelete = s.nextInt();
		if(isValid(memberTodelete)) {
		team[memberTodelete]=null;
		}
	}
	
	public static void deleteAllTeamMember(String[] team) {
		for(int i = 0; i < team.length; i++) {
			team[i]= null;
		}
	}
	
	public static boolean isValid(int input) {
		if(input >= 0 && input < 5) {
			return true;
		}else {
			System.out.println("OOPs Invalid Entry.");
			return false;
		}
	}
	
	public static void showMenu() {
		System.out.println("Please enter an option or enter -1 to exit. ");
		System.out.println("1) Show Team");
		System.out.println("2) Show Team Member");
		System.out.println("3) Add Team member");
		System.out.println("4) Delete Team member");
		System.out.println("5) Delete All Team Members");
		
	}
	

}
