package Controller;

import Models.Contact;
import Models.LinkedList;
import View.ConsoleView;

public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;

    public MenuController() {
        this.contactManager = new ContactManager();
        this.consoleView = new ConsoleView();
    }

    public void showMenu() {
        boolean exit = false;
        while (!exit) {
            consoleView.displayMenu();
            String option = consoleView.getInput("Choose an option: ");
            switch (option) {
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printList();
                    break;
                case "5":
                    exit = true;
                    consoleView.showMessage("Exiting...");
                    break;
                default:
                    consoleView.showMessage("Invalid option. Try again.");
            }
        }
    }

    private void addContact() {
        String name = consoleView.getInput("Enter name: ");
        String phone = consoleView.getInput("Enter phone: ");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact);
        consoleView.showMessage("Contact added successfully!");
    }

    private void findContact() {
        String name  = consoleView.getInput("Enter a name to search: ");
        Contact<?, ?> contact = contactManager.findContactByName(name);
        if (contact != null){
            consoleView.showMessage(("CONTAC FUND"+ contact));
            
        }else {
            consoleView.showMessage("Contact not found.");
        }
        
    }

    private void deleteContact() {
        String name = consoleView.getInput("ENTER A NAME TO DELETE: ");
        contactManager.deleteContactByName(name);
        consoleView.showMessage("CONTACT NO FUND ");
        
    }

    private void printList() {
        consoleView.showMessage("Printing all contacts:");
        contactManager.printList(); 
    }
    
}
