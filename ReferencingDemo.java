package Day3;
		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.List;
		import java.util.function.Consumer;
		interface IMessage
		{
			void printMessage();
		}
		class HelloMessenger
		{
			
		public HelloMessenger()
		{
			System.out.println("constructor referencing");
		}
		public static  void displayMessage()
			{
				System.out.println("Static referencing");
			}
		 
		void displaymessage()
		{
			System.out.println("instance referencing");
		}
		}
		public class ReferencingDemo {
		 
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				/*HelloMessenger messenger=new HelloMessenger();
				IMessage message=messenger::displaymessage;
				IMessage msg=HelloMessenger::displayMessage; // use this line when we declare the method as static
			
				message.printMessage();
				msg.printMessage();
		*/
				List<Integer> numList=Arrays.asList(12,23,34,54);
				Consumer<Integer> consumer=System.out::println;
				numList.forEach(consumer);
		 
		}
		
		 

	}


