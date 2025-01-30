package UserApplication;

public class User1 {
private String username;
private String emailid;
 User1() {
	
}

	public void setUsername(String username) {
	this.username = username;
}

public void setEmailId(String emailid) {
	this.emailid = emailid;
}


	public String getUsername() {
	return username;
}

public String getEmailId() {
	return emailid;
}

	@Override
public String toString() {
	return "User1 [username=" + username + ", emailid=" + emailid + "]";
}

	public static void main(String[] args) {
		

	}

}
