package builder;



public class User1 {
	private final String firstName; // required
	private final String lastName; // required

	private int age; // optional
	private String phone; // optional
	private String address; // optional

	public User1(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public User1 age(int age) {
		this.age = age;
		return this;
	}

	public User1 phone(String phone) {
		this.phone = phone;
		return this;
	}

	public User1 address(String address) {
		this.address = address;
		return this;
	}

	@Override
	public String toString() {
		return "User1{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
