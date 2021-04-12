package dependency.injection;

public class MessageSender {

	MessageService messageService;
	
	public MessageSender(MessageService messageService) {
		this.messageService = messageService;
	}
	

	public void sentMessage(String msg, String address) {
		messageService.sentMessage(msg, address);
	}
}
