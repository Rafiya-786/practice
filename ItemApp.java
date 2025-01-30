package Day3;
import java.io.*;
import java.io.ObjectOutputStream;

 class Item2 implements Serializable {
	private String itemName;
	private float price;
	public Item2() {
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}

	public float getPrice() {
		return price;
	}
}
class ItemRecords{
	public void saveItem(Item2 item) throws IOException{
		FileOutputStream fout=new FileOutputStream("item.txt");
		ObjectOutputStream objectwriter=new ObjectOutputStream(fout);
		objectwriter.writeObject(item);
		objectwriter.flush();
		objectwriter.close();
	}
	public Item2 readItem() throws FileNotFoundException,IOException,ClassNotFoundException{
		FileInputStream fin=new FileInputStream("item.txt");
		ObjectInputStream objectreader=new ObjectInputStream(fin);
		Item2 item=(Item2) objectreader.readObject();
		return item;
	}
	
}
public class ItemApp{
	public static void main(String[] args) {
		
			Item2 item=new Item2();
			item.setItemName("coffee");
			item.setPrice(200);
			ItemRecords records=new ItemRecords();
			try {
				records.saveItem(item);
				Item2 itemrecord=records.readItem();
				System.out.println(itemrecord.getItemName());
				System.out.println(itemrecord.getPrice());
	}
			catch(FileNotFoundException e) {
			}
		catch(IOException e) {
	}
		catch(ClassNotFoundException e) {
}

}
}