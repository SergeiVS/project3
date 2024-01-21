package task1;



public class ContactsTest {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        Contact contact1 = new Contact("John Smith", "+0123456789");
        Contact contact2 = new Contact("Jane Dow", "+1457856311");

        contactManager.addContact(contact1);
        contactManager.addContact(contact1);
        contactManager.addContact(contact2);

        contactManager.addNewContact();

        System.out.println(contactManager.getContactSet());

        System.out.println("search by name " + contact2.getContactName());
        System.out.println(contactManager.searchContactByName(contact2.getContactName()));

        System.out.println("search by name " + "Peter Pan");
        System.out.println(contactManager.searchContactByName("Peter Pan"));

        System.out.println("search by number " + contact1.getPhoneNumber());
        System.out.println(contactManager.searchContactByNumber(contact1.getPhoneNumber()));

        System.out.println("removing contact " + contact2);
        contactManager.removeContact(contact2);
        System.out.println("contactSet new version");
        System.out.println(contactManager.getContactSet());

    }
}




