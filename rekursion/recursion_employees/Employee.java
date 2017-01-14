package recursion_employees;

public class Employee {

	private int empNumber;
	private String name;
	private double salary;
	private String department;
	private String role;
	private String superior;
	
	public Employee(int empNumber, String name, double salary, String department, String role, String superior) {
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.role = role;
		this.superior = superior;
	}
	
	public int getEmpNumber() {
		return empNumber;
	}

	public String getName() {
		return name;
	}
	
	public String getSuperior() {
		return superior;
	}
	
	public String getRole() {
		return role;
	}
	
	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber
				+ ", name=" + name + ", salary="
				+ salary + ", department="
		        + department + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empNumber != other.empNumber)
			return false;
		return true;
	}
	
}