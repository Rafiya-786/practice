package Day3;

public class DivisionHash {
	public static int hash(int key,int prime) {
		return key % prime;
	}

	public static void main(String[] args) {
		int key=12345;
		int prime=31;
		System.out.println("Hash:" + hash(key,prime));

	}

}
