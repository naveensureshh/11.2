
public class Staff extends Employee {
	protected String title;

	public Staff(String name) {
		this(name, "none");

	}

	public Staff(String name, String title) {
		super(name);
		this.title = title;
	}

	public String getTile() {
		return title;

	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}
}