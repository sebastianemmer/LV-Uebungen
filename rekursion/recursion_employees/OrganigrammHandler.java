package recursion_employees;

public class OrganigrammHandler {

	public static String getChainOfCommand(Employee employee) {
		
		String chain = employee.getName() + " [" +employee.getRole() + "]";
		
		if(employee.getSuperior() == null) {
			return chain;
		}
		
		return chain; // + " -> " + getChainOfCommand(employee.getSuperior());
	}
}
