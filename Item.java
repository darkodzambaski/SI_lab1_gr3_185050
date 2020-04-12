class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	enum DDV{
		A=0.18;
		B=0.5;
		V=0;
	}

	//TODO constructor

	public Item(int id, String name, double price,enum DDV) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.DDV = DDV;
	}

	//TODO setters and getters

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public enum getDDV(){
		return DDV;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	double taxReturn () {
		//TODO
		float r=0.15;
		float dd=0;
		float kd=0;
		dd=price*getDDV;
		kd=dd*r;
		return taxReturn();
	}
}
class Receipt{
	List<Integer> grades = new ArrayList<Integer>();

	public Receipt(List<Integer> grades) {
		this.grades = grades;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}
	
}