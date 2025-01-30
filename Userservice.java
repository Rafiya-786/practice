package UserApplication;
	public class Userservice {
		private Userrepository userRepository;
		public Userservice(Userrepository userRepository) {
			this.userRepository=userRepository;
		}
		public User findByUserName(String userName) {
			return userRepository.findByUserName(userName);
		}
}
