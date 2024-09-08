package contact;
import java.io.*;
import java.util.Map;
import java.util.HashMap;

public class ContactManager {
    private HashMap<String, Contact> contacts;
    private static final String FILE_NAME = "contacts.txt";

    public ContactManager() {
        this.contacts = new HashMap<>();
        loadContacts();
    }
    public void addContact(Contact contact) {
        this.contacts.put(contact.getEmail(), contact);
        saveContacts();
    }
    public Contact searchContact(String email) {
        if (this.contacts.containsKey(email)) {
            return this.contacts.get(email);
        }
        return null;
    }
    public Boolean removeContact(String email) {
        if (this.contacts.containsKey(email)) {
            this.contacts.remove(email);
            saveContacts();
            return true;
        }
        return false;
    }
    public void showAllContacts() {
        for (Contact contact : this.contacts.values()) {
            contact.print();
        }
    }
    private void saveContacts() {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(FILE_NAME)))) {
            for (Map.Entry<String, Contact> entry : this.contacts.entrySet()) {
                Contact contact = entry.getValue();
                writer.println(contact.getName() + "," + contact.getAge() + "," + contact.getEmail());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void loadContacts() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_NAME)))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 3) {
                        String name = parts[0];
                        Integer age = Integer.parseInt(parts[1]);
                        String email = parts[2];
                        Contact contact = new Contact(name, age, email);
                        this.contacts.put(email, contact);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}