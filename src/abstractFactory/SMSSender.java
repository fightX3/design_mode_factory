package abstractFactory;

public class SMSSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is sms sender!");
	}

}
