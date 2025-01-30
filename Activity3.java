package Day3;
class Node3{
	Bullet bullet;
	Node3 next;
	Node3(Bullet bullet){
		this.bullet=bullet;
		this.next=null;
	}
}
class Bullet{
	int id;
	int dmg;
	public  Bullet(int id,int dmg) {
		this.id=id;
		this.dmg=dmg;
	}
	public String toString() {
		return "Fire Bullet "+id+" Damage: "+dmg;
	}
}
public class Activity3 {
	Node3 FRONT;
	Node3 REAR;
	Activity3(){
		FRONT=REAR=null;
	}
	public void enque(int id,int dmg) {
		Bullet b=new Bullet(id,dmg);
		Node3 n=new Node3(b);
		if(FRONT==null && REAR==null) {
			FRONT=REAR=n;
		}
		REAR.next=n;
		REAR=n;	
		}
	public void deque() {
		Bullet bullet=FRONT.bullet;
		FRONT=FRONT.next;
		System.out.println(bullet);
	}
	public static void main(String[] args) {
		Activity3 a=new Activity3();
		a.enque(1, 10);
		a.enque(2, 10);
		a.enque(3, 10);
		a.enque(4, 10);
		a.enque(5, 10);
		a.deque();
		a.deque();
		a.deque();
		a.deque();
		a.deque();
		}
		
	}

