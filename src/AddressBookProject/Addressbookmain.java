package AddressBookProject;

import java.util.ArrayList;
import java.util.Scanner;
//create update delete retrive
public class Addressbookmain {
    Scanner sc = new Scanner(System.in);
    AddressBook addressBook = new AddressBook();
    ArrayList<AddressBook> list = new ArrayList<>();
    public void createContacts() {
        System.out.println("Enter firstname");
        addressBook.setFirstName(sc.next());
        System.out.println("Enter lastname");
        addressBook.setLastName(sc.next());
        System.out.println("Enter phonenumber");
        addressBook.setPhoneNumber(sc.next());
        System.out.println("Enter email");
        addressBook.setEmail(sc.next());
        System.out.println("Enter city");
        addressBook.setCity(sc.next());
        list.add(addressBook);
        System.out.println(addressBook);
    }

    public void edit() {
        System.out.print("Enter firstname to edit: ");
        if (addressBook.getFirstName().equals(sc.next())) {
           createContacts();
        } else {
            System.out.println("User not valid");
        }
    }
    public void show() {
        System.out.println(list);
    }

    public void delete(){
        System.out.print("Enter firstname to delete: ");
        if (addressBook.getFirstName().equals(sc.next())) {
            addressBook = null;
            System.out.println("Deleted SuccessFully...!");
        } else {
            System.out.println("User not valid");
        }

    }

    public static void main(String[] args) {
        Addressbookmain addressbookmain = new Addressbookmain();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to Create Contacts");
            System.out.println("Enter 2 to Edit Contacts");
            System.out.println("Enter 3 to Show Contacts");
            System.out.println("Enter 4 to Delete Contacts");
            System.out.println("Enter 0 to Exit");
            switch (sc.nextInt()) {
                case 1:
                    addressbookmain.createContacts();
                    break;
                case 2:
                    addressbookmain.edit();
                    break;
                case 3:
                    addressbookmain.show();
                    break;
                case 4 :
                    addressbookmain.delete();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Enter valid options");
            }
        }
    }
}
