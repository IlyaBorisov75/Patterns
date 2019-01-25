package Mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat{
	User admin;
	List<User> users = new ArrayList<>();
	
	
	
	public void setAdmin(User admin) {
		if (admin instanceof Admin) {
			this.admin = admin;
		}else {
			throw new RuntimeException("Не хватает прав");
		}
	}



	public void addUsers(User user) {
		if (admin==null) {
			throw new RuntimeException("Нет администратора");
		}
		if (user instanceof SimpleUser)
			users.add(user);
	}



	@Override
	public void sendMessage(String message, User user) {
		if (user instanceof Admin) {
			for(User u: users) {
				u.getMessage(message);
			}
		}else {
			for(User u: users) {
				if (u!=user && u.isEnable()) {
					u.getMessage(message);
				}
			}
			if (admin.isEnable()) {
				admin.getMessage(message);
			}
		}
	}

}
