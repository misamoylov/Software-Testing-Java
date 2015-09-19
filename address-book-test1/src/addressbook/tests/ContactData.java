package addressbook.tests;

public class ContactData implements Comparable<ContactData> {
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
	
	@Override
	public String toString() {
		return "ContactData [firstname=" + firstname + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
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
		ContactData other = (ContactData) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		return true;
	}
	@Override
	public int compareTo(ContactData other) {
		return this.firstname.toLowerCase().compareTo(other.firstname);
	}
	
}