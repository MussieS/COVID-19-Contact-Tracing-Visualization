
package pkgfinal.project;

import java.util.ArrayList;



public class User implements Comparable <User> {
    private int userId;
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private String phoneNumber;
    private boolean infected;
    private String dateDiagnosed;
    private ArrayList<Contact> contacts;

    public User(int userId, String firstName, String lastName, String gender, String dateOfBirth, String phoneNumber, boolean infected, String dateDiagnosed) 
    {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.infected = infected;
        this.dateDiagnosed = dateDiagnosed;
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact)
    {
        contacts.add(contact);
    }
    
    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public void setDateOfBirth(String dateOfBirth) 
    {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public void setInfected(boolean infected)
    {
        this.infected = infected;
    }

    public void setDateDiagnosed(String dateDiagnosed)
    {
        this.dateDiagnosed = dateDiagnosed;
    }
    
    public int getUserId() 
    {
        return userId;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public String getGender() 
    {
        return gender;
    }

    public String getDateOfBirth() 
    {
        return dateOfBirth;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public boolean isInfected()
    {
        return infected;
    }

    public String getDateDiagnosed() 
    {
        return dateDiagnosed;
    }
    
    public ArrayList<Contact> getContacts() 
    {
        return contacts;
    }
    
    
    @Override
    public String toString() 
    {
        return "\nUser ID: " + userId + "\nFirst Name: " + firstName + "\nLast name: " + lastName + "\nGender: " + gender + "\nDate of Birth: " + dateOfBirth + "\nPhone Number: " + phoneNumber + "\nInfection: " + (infected ? "Positive" : "Negative") + (infected ?"\nDiagnosis date: "  + dateDiagnosed :  "") + "\n------------------";
    }

    @Override
    public int compareTo(User o) 
    {
    return Integer.compare(this.userId, o.userId);
    }
}
