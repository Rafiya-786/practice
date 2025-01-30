package UserApplication;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
 
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserServiceTest {
	private Userrepository userRepository;
	private Userservice userService;
	
	@BeforeEach
	void setUp() throws Exception{
		Userrepository = Mockito.mock(Userrepository.class);
		// inject the mock into userservice
		Userservice = new Userservice(userRepository);
	}

	@Test
	void testFindByUserName() {
		User mockUser = new User();
		mockUser.setUsername("John Doe");
		mockUser.setEmailID("johndoe@gmail.com");
		when(userrepository.findByUserName("John Doe")).thenReturn(mockUser);
		String userName = userService.findByUserName("John Doe").getUsername();
		
		// Asset: verify the result
		assertEquals("John Doe", userName);
	}

}

has context menu