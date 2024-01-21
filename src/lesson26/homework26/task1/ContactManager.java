package task1;

import lesson26.homework26.UserInput;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ContactManager {
    private final Set<Contact> contactSet = new HashSet<>();
    UserInput ui = new UserInput();
    private Contact createNewContact(){
        return new Contact(ui.uiText("Insert name of new contact; "), ui.uiText("Insert phone number of new contact: "));
    }
    public void addNewContact(){
        Contact newContact = createNewContact();
        if (!isContactPresent(newContact)){contactSet.add(newContact);}
        else System.out.println("contact " + newContact + " is already exist.");
    }
    public void addContact(Contact contact){
        if (!isContactPresent(contact)){contactSet.add(contact);}
        else {System.out.println("contact " + contact + " is already exist.");}
    }


    public Set<Contact> getContactSet() {
        return contactSet;
    }
public void removeContact(Contact contact){
    if (isContactPresent(contact)){ contactSet.remove(contact); }
        else {System.out.println("Not such contact exist.");}
}

    private boolean isContactPresent(Contact contact) {
        return contactSet.contains(contact);
    }

    public ArrayList<Contact> searchContactByName(String name){
        ArrayList<Contact> searchedContacts = new ArrayList<>();

        for (Contact contact : contactSet){
            if(contact.getContactName().equals(name)){
                searchedContacts.add(contact);
            }
        }
        if (searchedContacts.isEmpty()){
            System.out.println("No contact name " + name +" presents in your contacts.");
        }
        return searchedContacts;
    }

    public ArrayList<Contact> searchContactByNumber(String phoneNumber) {
        ArrayList<Contact> searchedContacts = new ArrayList<>();
      for (Contact contact : contactSet){
          if (contact.getPhoneNumber().equals(phoneNumber)){
              searchedContacts.add(contact);
          }
      }
        if (searchedContacts.isEmpty()){
            System.out.println("No contact with phone number " + phoneNumber +" presents in your contacts.");
        }
        return searchedContacts;
    }



}
