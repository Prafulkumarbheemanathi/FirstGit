package Arraylist;

import java.util.ArrayList;

public class EmployeeData {

	public static void main(String[] args) {
		
ArrayList<Employe> emp = new ArrayList<>();
		
		Employe praful = new Employe("Praful");
		Employe kiran = new Employe("Kiran");
		Employe siddu = new Employe("Siddu");
		Employe ragav = new Employe("Ragav");
		Employe avinash = new Employe("Avinash");
		
		
		Employe searchEmploye = praful ;
		System.out.println(praful.equals(searchEmploye));
		
		emp.add(praful);
		emp.add(kiran);
		emp.add(siddu);
		emp.add(ragav);
		emp.add(avinash);
		
		System.out.println(emp);
		
		boolean result = emp.contains("Praful");
		System.out.println(result);

	}

}
