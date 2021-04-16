package dependency.injection;

public class MyDIApplication {

	public static void main(String[] args) {

		MessageSender emailMessageSender = new MessageSender(new EmailMessageService());
		emailMessageSender.sentMessage("Email message", "jiwan@test.com");
		
		MessageSender smsMessageSender = new MessageSender(new SMSMessageService());
		smsMessageSender.sentMessage("My message", "999990000");
	}

}
