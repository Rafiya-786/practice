package Day3;

public class HashTable {
	private String[] keys;
	private String[] values;
	private int capacity;
	public HashTable(int capacity) {
		this.capacity=capacity;
		values=new String[capacity];
		keys=new String[capacity];		
	}
	public int hash(String key) {
		return Math.abs(key.hashCode()%capacity);
	}
	public void put(String key,String value) {
		int index=hash(key);
		while(keys[index]!=null) {
			if(keys[index].equals(key)) {
				values[index]=value;
				return;
			}
			index=(index+1)%capacity;
		}
		keys[index]=key;
		values[index]=value;
	}
	public String get(String key) {
		int index=hash(key);
		while(keys[index]!=null) {
			if(keys[index].equals(key)) {
				return values[index];
		}
		index=(index+1)%capacity;
	}
	return null;
	}
	public void remove(String key) {
		int index=hash(key);
		while(keys[index]!=null) {
			if(keys[index].equals(key)){
				keys[index]=null;
				values[index]=null;
				return;
			}
			index=(index+1)%capacity;
		}
	}
	public void display() {
		for(int i=0;i<capacity;i++) {
			if(keys[i]!=null) {
				System.out.println("Index"+i+": [" +keys[i]+": "+ values[i]+ "]");
			}
		}
	}
	public static void main(String[] args) {
		HashTable obj=new HashTable(5);
		obj.put("1", "Peter");
		obj.put("2", "sam");
		obj.put("3", "Erric");
		obj.put("4", "Simond");
		obj.put("5", "William");
		System.out.println(obj.get("1"));
		System.out.println(obj.get("2"));
		System.out.println(obj.get("3"));
		System.out.println(obj.get("4"));
		System.out.println(obj.get("5"));
	}

}
