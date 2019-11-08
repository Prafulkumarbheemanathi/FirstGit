package Arraylist;

public class Employe {
	
	String name;

	public Employe(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Employe f = (Employe) obj;
		return this.name.equals(f.name);
	}


}
