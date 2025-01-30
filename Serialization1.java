package Day3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//seriaalizable instances can be saved to file
class Product implements Serializable{
	private String productname;
	private float price;
	private int quantity;
	public Product() {
		super();
		this.productname = productname;
		this.price = price;
		this.quantity = quantity;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
	class ProductSave{
		Product product;
	public	ProductSave(Product product)
	{
		this.product=product;
	}
		public void saveProduct() throws IOException{
			FileOutputStream fout=new FileOutputStream(product.getProductname()+".txt");
			ObjectOutputStream objectwriter=new ObjectOutputStream(fout);
			objectwriter.writeObject(product);
			objectwriter.flush();
			objectwriter.close();
		}
		public Product readProduct() throws FileNotFoundException,IOException,ClassNotFoundException{
			FileInputStream fin=new FileInputStream(product.getProductname()+".txt");
			ObjectInputStream objectreader=new ObjectInputStream(fin);
			Product product=(Product) objectreader.readObject();
			return product;

		}
	}
 
		public class Serialization1{
			public static void main(String [] args) throws FileNotFoundException, IOException, ClassNotFoundException {
				Product product=new Product();
				product.setProductname("coffee");
				product.setPrice(200);
				product.setQuantity(4);
				ProductSave records=new ProductSave(product);
				try {
					records.saveProduct();
					Product productrecord=records.readProduct();
					System.out.println(productrecord.getProductname());
					System.out.println(productrecord.getPrice());
					System.out.println(productrecord.getQuantity());
				}
				catch(FileNotFoundException e) {
					System.out.println(e);
				}
				catch(IOException e) {
				System.out.println(e);
			}
				catch(ClassNotFoundException e) {
				System.out.println(e);
				}
			}
		}
