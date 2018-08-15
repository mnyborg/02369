package test;

import builder.User;
import builder.User1;

public class Main {

	public static void main(String[] args) {
		User n = new User.UserBuilder("Jhon", "Doe")
			    .age(30)
			    .phone("1234567")
			    .address("Fake address 1234")
			    .build();
		
		System.out.println(n);
		
		
		User1 u1 = new User1().firstName("Mads").lastName("Nyborg");
		System.out.println(u1);

	}

}
