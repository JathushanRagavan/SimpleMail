import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstename;
    private String lastname;
    private String password;
    private String department;
    private String email;
    private String emailEnd = "stoogle.com";
    private int mailboxCapacity = 100;
    private String alternateEmail;

    //Konstruktor um first und last Name zu bekommen
    public Email(String fName, String lName){
        this.firstename = fName;
        this.lastname = lName;

        //Aufruf der Methode für Zuordnung der Abteilung
        this.department = setDepartment();

        //Aufruf der Methode für Random Password
        this.password = randomPassword(10);

        //Erstellung der eigentlichen EMAIL
        this.email = firstename.toLowerCase() + "." + lastname.toLowerCase() + "@" + department.toLowerCase() + "." + emailEnd;

    }

    //Determine the department
    private String setDepartment(){
        Scanner scanner = new Scanner(System.in);

        /*
        String depQuestion = "Zu welcher Abteilung gehören Sie?\n";
        depQuestion += "1 für Sales\n";
        depQuestion += "2 für Developement\n";
        depQuestion += "2 für Accounting\n";
        depQuestion += "4 wenn Sie zu keinem von den Oben genannten gehören\n";

        int whichDepartment = Integer.parseInt(JOptionPane.showInputDialog(depQuestion));
    */

        System.out.println("Zu welcher Abteilung gehören Sie?");
        System.out.println("Drücken Sie 1 für Sales");
        System.out.println("Drücken Sie 2 für Developement");
        System.out.println("Drücken Sie 3 für Accounting");
        System.out.println("Drücken Sie 4 wenn Sie zu keinem von den Oben genannten gehören");

        int whichDepartment = scanner.nextInt();

        if (whichDepartment == 1){
            return "sales";
        }
        else if(whichDepartment == 2){
            return "developement";
        }
        else if(whichDepartment == 3){
            return "accounting";
        }
        else{
            return "";
        }
    }

    //Generate a random String for password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGJKLMNOPQRSTUVWXYZ";
        passwordSet += "abcdefghijklmnopqrstuvw";
        passwordSet += "1234567890";
        passwordSet += "!&/()=?+#-";

        char[] passwordArray = new char[length];
        for (int i = 0; i<length; i++) {
            int random = (int)(Math.random() * passwordSet.length());
            passwordArray[i] = passwordSet.charAt(random);
        }
        return new String(passwordArray);
    }

    //set methode to change the password
    public void setChangePassword(String password){
        this.password = password;
    }

    public String getChangePassword(){
        return password;
    }

    //set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    //set alternate Email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }

    //Methode to display Infos
    public String showInfo(){
        String info = "EMAILUSER: " + this.firstename + " " + this.lastname + "\n";
        info += "ABTEILUNG: " + this.department + "\n";
        info += "PASSWORT: " + this.password + "\n";
        info += "EMAILADRESSE: "+ this.email + "\n";
        info += "MAilBOX CAPACITY: " + this.mailboxCapacity;

        return info;
    }



}
