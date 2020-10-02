package nd.com.JSONTransform.model;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

public class User {
	private int id;
	private String name;
	private int age;
	private BigDecimal salary;
	private String designation;
	private Set<Address> address;
	private long[] phoneNumbers;
	private Map<String, String> personalInformation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	public long[] getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(long[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Map<String, String> getPersonalInformation() {
		return personalInformation;
	}
	public void setPersonalInformation(Map<String, String> personalInformation) {
		this.personalInformation = personalInformation;
	}
	
}
