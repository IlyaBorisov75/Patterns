package Mediator;

public class AppMediator {
	//��������(���������) - ��� ���� TextChat
	void App() {
		TextChat chat = new TextChat();
		
		User admin = new Admin(chat, "Admin1");
		User user1 = new SimpleUser(chat, "Vasya");
		User user2 = new SimpleUser(chat, "Petya");
		
		chat.setAdmin(admin);
		chat.addUsers(user1);
		chat.addUsers(user2);
		
		user1.sendMessage("������");
		admin.sendMessage("Test");
	}
}
