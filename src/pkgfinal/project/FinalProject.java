
package pkgfinal.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class FinalProject {

   
    public static void main(String[] args) {

        // Load user
        ArrayList <User> user = loadUser("users.csv");
        System.out.println(user);
        
        // Load contacts and test 
        loadContactRecord("contacts.csv", user);
        System.out.println("Contact count for first user: " + user.get(0).getContacts().size());
        
        // Test sorting by shuffling and then sorting again because the list we have is already sorted
        Collections.shuffle(user);
        Collections.sort(user);
        System.out.println("Total Users Loaded: " + user.size());
        
        
        
        
    }
    public static ArrayList<User> loadUser(String fileName)
    {
        ArrayList<User> users = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
                String line;
                reader.readLine(); // skips over header line
                while ((line = reader.readLine()) != null)
                {
                  String[] field = line.split(",",-1);
                  int userId = Integer.parseInt(field[0]);
                  String firstName = field[1];
                  String lastName = field[2];
                  String gender = field[3];
                  String dateOfBirth = field[4];
                  String phoneNumber = field[5];
                  boolean infected = field[6].equalsIgnoreCase("yes");
                  String dateDiagnosed = infected ? field[7]: ""; // checks whether they are infected or not to make sure diagnotion date.


                  User user = new User(userId, firstName, lastName, gender, dateOfBirth, phoneNumber, infected, dateDiagnosed);
                  users.add(user);
                }

            } catch (IOException error){
                    System.out.println("There was some error reading user file: " + error.getMessage());
        }
        return users;
    }
            
      public static User getUserById(ArrayList<User> users, int id){
          User toCompare = new User(id,"","","","","",false,"");// Binary Search only works when there are two things to compare. This is used for comparing only.
          
          int index = Collections.binarySearch(users, toCompare);
          
          if(index >= 0)
          {
              return users.get(index);
          }
          return null;
      }
          
      public static void loadContactRecord(String fileName, ArrayList<User> users)
      {
          int count = 0;

          try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
                String line;
                reader.readLine(); // skips over header line
                while ((line = reader.readLine()) != null)
                {
                    String [] field  = line.split(",",-1);
                    int reportingId = Integer.parseInt(field[0]);
                    int contactId = Integer.parseInt(field[1]);
                    String startTime  = field[2];
                    String endTime = field[3];

                    User reportingUser = getUserById(users, reportingId);
                    User contactUser = getUserById(users, contactId);
                if(reportingUser != null && contactUser != null)
                {
                    Contact contact = new Contact(reportingUser, contactUser, startTime, endTime);
                    reportingUser.addContact(contact);
                    count++;
                }            
            }
            System.out.println("Loaded " + count + " contact records.");
        }
          catch (IOException error)
        {
            System.out.println("There was some error reading the file: " + error.getMessage());
        }
    }
}
