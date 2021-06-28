package addressbookmain;

public class AddressBookMain
{
	public static void main(String[] args)
	{
		Contact contact1 = new Contact("jayesh", "mali", "Kharghar", "mumbai", "MH", "400211", "0987654321", "jay@gmail.com");
		Contact contact2 = new Contact("jay", "mali", "Thane", "satara", "MH", "400211", "0987123345", "jay2@gmail.com");
		Contact[] allContacts = new Contact[20];
		allContacts[1] = contact1;			
		allContacts[2] = contact2;			
		for (int i = 1; i < allContacts.length; i++) {
			if(allContacts[i] != null) 
			{
				System.out.println(allContacts[i]);
			}
		}
	}

}

