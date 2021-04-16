package dependency.injection;

public class EmailMessageService implements MessageService {

	@Override
	public void sentMessage(String msg, String address) {

		System.out.println("Message sent to "+ address + " the Message is "+ msg);
	}

	
	
}
