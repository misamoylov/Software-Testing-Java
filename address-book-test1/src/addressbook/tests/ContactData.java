package addressbook.tests;

public class ContactData {
	public String firstname;
	public String lastname;
	public String address11;
	public String hometel;
	public String mobiletel;
	public String worktel;
	public String email;
	public String secondemail;
	public String birthday;
	public String group;
	public String birthmonth;
	public String birthyear;
	public String secondphone;
	public String secondaddress;
	public ContactData() {
		
	}
	public ContactData(String firstname, String lastname, String address11, String hometel, String mobiletel, String worktel, String email, String secondemail, String birthday, String group, String birthmonth, String birthyear, String secondphone, String secondaddress ) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address11 = address11;
		this.hometel = hometel;
		this.mobiletel = mobiletel;
		this.worktel = worktel;
		this.email = email;
		this.secondemail = secondemail;
		this.birthday = birthday;
		this.group = group;
		this.birthmonth = birthmonth;
		this.birthyear = birthyear;
		this.secondphone = secondphone;
		this.secondaddress = secondaddress;
	}
}