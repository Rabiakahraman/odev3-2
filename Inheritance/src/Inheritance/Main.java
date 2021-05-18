package Inheritance;

public class Main {

	public static void main(String[] args) {
		Instructor egitmen = new Instructor();
		egitmen.UserName = "rabia";
		
		Student ögrenci = new Student();
		ögrenci.UserName="zeynep";
		
		UserManager userManager =new UserManager();
		
		User[] users = {egitmen , ögrenci};
		
		userManager.addMultiple(users);
		

	}

}
