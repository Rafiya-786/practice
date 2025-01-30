package Day3;
import java.util.*;
class Product{
	String productname;
	int price;
	Product(String productname,int price){
		this.productname=productname;
		this.price=price;
	}
	public void setName(String productname) {
		this.productname=productname;
	}
	public String getName() {
		return productname;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Product [productname=" + productname + ", price=" + price + "]";
	}
	
}
public class ProductRecord {

	public static void main(String[] args) {
		
	Comparator<Product> comparator=(p1,p2)->p1.getPrice()!=p2.getPrice()?p1.getPrice()>p2.getPrice()?1:-1:0;
TreeSet<Product>treeSet=new TreeSet(comparator);
treeSet.add(new Product("COffee",120));
treeSet.add(new Product("Ice tea",200));
treeSet.add(new Product("tea",110));
treeSet.add(new Product("Black COffee",150));
System.out.println(treeSet);
	}

}
