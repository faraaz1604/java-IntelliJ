package List.Arraychallenge;

import java.util.ArrayList;
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return false; // Contact already exists
        }
        myContacts.add(contact);
        return true;
    }

    public  boolean updateContact(Contact oldContact, Contact newContact){
        int index = findContact(oldContact);
        if(index>=0){
            myContacts.set(index, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if (index >= 0) {
            myContacts.remove(index);
            return true;
        }
        return false; // Contact not found
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1; // Contact not found
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        return (index >= 0) ? myContacts.get(index) : null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }



}
