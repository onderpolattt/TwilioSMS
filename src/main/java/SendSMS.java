import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendSMS {

	public static final String ACCOUNT_SID = "ACa55993ba31775735a3a91d2c59e9403f";
	public static final String AUTH_TOKEN = "205a0121934cc24342242d3af6510591";

	public static void main(String[] args) {

		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		Message message = Message.creator(
				new com.twilio.type.PhoneNumber("+905077387860"),
				new com.twilio.type.PhoneNumber("+905077387860"),
				"Merhaba").create();

		System.out.println(message.getSid());

	}

}
