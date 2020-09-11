import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployees {

	public static void main(String[] args) {

		List<Employee> employees = getUnsortedEmployeeList();
		Comparator<Employee> compareByName = Comparator.comparing(Employee::getAge).thenComparing(Employee::getName);
		List<Employee> sortedEmployees = employees.stream().filter(employee -> employee.getAge() > 10).sorted(compareByName).collect(Collectors.toList());
		System.out.println(sortedEmployees);
		
	}

	private static List<Employee> getUnsortedEmployeeList() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Jack", 25));
		employees.add(new Employee("Chloe", 32));
		employees.add(new Employee("Kim", 18));
		employees.add(new Employee("David", 27));
		employees.add(new Employee("Jill", 10));
		employees.add(new Employee("Michelle", 40));
		return employees;
	}

}
