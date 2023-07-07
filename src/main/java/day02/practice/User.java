package day02.practice;

public class User {
	private String Username;
	private String Userpassword;
	private String Userid;
	private String Useremail;

	
	// Below the code for geter and setter
	
	public String getName() {
		return Username;
	}

	public void setName(String name) {
		this.Username = name;
	}

	public String getId() {
		return Userid;
	}

	public void setId(String i) {
		this.Userid = i;
	}

	public String getPassword() {
		return Userpassword;
	}

	public void setPassword(String password) {
		this.Userpassword = password;
	}

	public String getemailId() {
		return Useremail;
	}

	public void setemailId(String email) {
		this.Useremail = email;
	}

	public static void main(String[] args) {
		
		// Create a new object
		User user = new User();
		user.setName("Meganathan");
		String name = user.getName();
		System.out.println(name);

		// Set the user id 
		user.setId("000110");
		String id = user.getId();
		System.out.println(id);

		// Set the user password
		user.setPassword("Meganathan@2003");
		String password = user.getPassword();
		System.out.println(password);
		
		
		// Set the User Email password
		user.setemailId("Meganathan@Gmail.com");
		String emialid = user.getemailId();
		System.out.println(emialid);

	}
}