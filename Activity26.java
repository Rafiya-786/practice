package Day3;
import java.util.*;
import java.util.Scanner;
class SecurityException extends Exception{
	private String message;
	private String errorCode;
	static final long serialVersionUID=1L;
	public SecurityException(String message,String errorCode) {
		super();
		this.message=message;
		this.errorCode=errorCode;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public String getMessage() {
		return message;
	}
	
}
class SecureChannel{
	private String channelId;
	private String userId;
	private String userEncryptionToken;
	private int channelEncryptionKeyLength;
	 public SecureChannel(String channelId,String userId) {
		 this.channelId=channelId;
		 this.userId=userId;
	 }
	 public SecureChannel(String channelId,String userId,String userEncryptionToken ) {
		 this.channelId=channelId;
		 this.userId=userId;
		 this.userEncryptionToken=userEncryptionToken;
	 }
	public String getChannelId() {
		return channelId;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserEncryptionToken() {
		return userEncryptionToken;
	}
	public int getChannelEncryptionKeyLength() {
		return channelEncryptionKeyLength;
	}
	public void setChannelEncryptionKeyLength(int channelEncryptionLength) {
		this.channelEncryptionKeyLength=channelEncryptionKeyLength;
	}	
}
class SecureTransmission{
	public static final String USER_NOT_AUTHORIZED="USER_NOT_AUTHORIZED";
public static final String INVALID_MESSAGE_LENGTH="INVALID_MESSAGE_LENGTH";
public static final String INSUFFICIENT_ENCRYPTION_KEY="INSUFFICIENT_ENCRYPTION_KEY";
public void SendMessage(SecureChannel secureChannel,int messageLength) throws SecurityException{
	if(secureChannel.getUserEncryptionToken()==null || secureChannel.getUserEncryptionToken().isEmpty()) {
		throw new SecurityException("User not authorized",USER_NOT_AUTHORIZED);
	}
	if(messageLength<=0) {
		
		throw new SecurityException("Message length must be greater than zero", INVALID_MESSAGE_LENGTH);

	}


	secureChannel.setChannelEncryptionKeyLength(secureChannel.getChannelEncryptionKeyLength() + messageLength);

	}


	public void readMessage(SecureChannel secureChannel, int messageLength) throws SecurityException {

	if (secureChannel.getUserEncryptionToken() == null || secureChannel.getUserEncryptionToken().isEmpty()) {

	throw new SecurityException("User not authorized", USER_NOT_AUTHORIZED);

	}

	if (messageLength <= 0) {

	throw new SecurityException("Message length must be greater than zero", INVALID_MESSAGE_LENGTH);

	}

	if (secureChannel.getChannelEncryptionKeyLength() < messageLength) {

	throw new SecurityException("Insufficient encryption key", INSUFFICIENT_ENCRYPTION_KEY);

	}


	secureChannel.setChannelEncryptionKeyLength(secureChannel.getChannelEncryptionKeyLength() - messageLength);

	}

	}

public class Activity26 {

private static final Scanner INPUT_READER = new Scanner(System.in);

private static final SecureTransmission SECURE_TRANSMISSION = new SecureTransmission();

private static final Map<String, SecureChannel> SECURE_CHANNELS = new HashMap<>();


public static void main(String[] args) {

int numberOfChannels = Integer.parseInt(INPUT_READER.nextLine());

while (numberOfChannels-- > 0) {

String[] channel = INPUT_READER.nextLine().split(" ");

SecureChannel secureChannel;


if (channel.length == 2) {

secureChannel = new SecureChannel(channel[0], channel[1]);

} else {

secureChannel = new SecureChannel(channel[0], channel[1], channel[2]);

}


SECURE_CHANNELS.put(channel[0], secureChannel);

}


int numberOfTransmissions = Integer.parseInt(INPUT_READER.nextLine());

while (numberOfTransmissions-- > 0) {

String[] transmission = INPUT_READER.nextLine().split(" ");

SecureChannel secureChannel = SECURE_CHANNELS.get(transmission[0]);


if (transmission[1].equals("send")) {

try {

SECURE_TRANSMISSION.SendMessage(secureChannel, Integer.parseInt(transmission[2]));

System.out.println("Message successfully sent.");

} catch (SecurityException ex) {

System.out.println(ex.getErrorCode() + ": " + ex.getMessage() + ".");

}

} else {

try {

SECURE_TRANSMISSION.readMessage(secureChannel, Integer.parseInt(transmission[2]));

System.out.println("Message successfully read.");

} catch (SecurityException ex) {

System.out.println(ex.getErrorCode() + ": " + ex.getMessage() + ".");

}

}

}


System.out.println();


List<String> channelIds = new ArrayList<>();

channelIds.addAll(SECURE_CHANNELS.keySet());


Collections.sort(channelIds);

for (String channelId : channelIds) {

SecureChannel secureChannel = SECURE_CHANNELS.get(channelId);

System.out.println(secureChannel.getChannelId() + " " + secureChannel.getUserId() + " " + secureChannel.getChannelEncryptionKeyLength());

}

}

}