package Rivision;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class exampleEMP {

	public static void main(String[] args) {
		List<employe> list =new ArrayList<>();
	list.add(new employe(1, "Saurabh Kulkarni",26,"11/12/2021", 600000.00));
	list.add(new employe(2, "Swapnali Shinde",24,"11/12/2021", 500000.00));
	list.add(new employe(3, "Dipali Gawade",28,"11/12/2021", 500000.00));
	list.add(new employe(4, "Sanket Kulkarni",22,"11/12/2021",700000.00));
	list.add(new employe(5, "Sujal Kulkarni",19,"11/12/2021", 1800000.00));
	list.add(new employe(6, "Saurabh Kulkarni",26,"11/12/2021", 900000.00));
	
	Optional<Double> salary = list.stream()
	.map(e-> e.getSalary())
	.sorted(Comparator.reverseOrder())
	.findFirst();
	
	System.out.println(salary.get());
	
	}

}
