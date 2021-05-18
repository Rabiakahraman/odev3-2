package Inheritance;

public class UserManager {
	public void add(User user) {
		System.out.println(user.UserName + "kaydedildi");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
		add(user);
			
		}
	}

}
