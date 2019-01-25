package ChainOfResponsibility;

public class AppCOR {
	public void app() {
		Logger log0 = new SMSLogger(Level.EROR);
		Logger log1 = new MailLogger(Level.DEBUG);
		Logger log2 = new FileLogger(Level.INFO);
		log0.setNext(log1);
		log1.setNext(log2);
		
		log0.setMassage("������ ������ � ��", Level.EROR);
		log0.setMassage("�� ���������� ���� �� �� �������", Level.DEBUG);
		log0.setMassage("�������� ������� ����������", Level.INFO);
	}
}
