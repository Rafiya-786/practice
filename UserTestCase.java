package UserApplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class UserTestCase {

	@Test
	void testgetUserNameLength() {
		User user=new User();
		String username="peter Parker";
		int expected=12;
		int actual=user.getUserNameLength(username);
		Assert.assertEquals(expected,actual);
	}

}
