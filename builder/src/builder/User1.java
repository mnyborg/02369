package builder;

import builder.User.UserBuilder;

public class User1 {
	private String firstName; // required
	private String lastName; // required
	private int age; // optional
	
	
	
	public User1 firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public User1 lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@Override
	public String toString() {
		return "User1 [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
}
