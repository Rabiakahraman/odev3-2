package Inheritance;

public class Main {

	public static void main(String[] args) {
		Instructor egitmen = new Instructor();
		egitmen.UserName = "rabia";
		
		Student �grenci = new Student();
		�grenci.UserName="zeynep";
		
		UserManager userManager =new UserManager();
		
		User[] users = {egitmen , �grenci};
		
		userManager.addMultiple(users);
		

	}

}
