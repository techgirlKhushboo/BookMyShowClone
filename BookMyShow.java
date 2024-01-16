import java.util.Scanner;

public class BookMyShow{
    String emailId,pwd;
    boolean islogin;
    int selection;
    Scanner sc = new Scanner(System.in);

    public void Signup()
    {
        boolean check=true;
        while(check==true)
        {
            System.out.println("Do you have an account ?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter your choice=");
            int choice = sc.nextInt();
            System.out.println();
            if(choice == 2)
            {
                System.out.println();
                System.out.println("...Create an account...");
                System.out.print("Enter your EmailID =");
                emailId = sc.next();
                System.out.print("Enter your Password =");
                pwd = sc.next();
                login();
                check=false;
            }
            else if(choice == 1)
            {
                System.out.println("...Login to your account...");
                login();
                check=false;
            }
            else
            {
                System.out.println("Inavlid input entered!!!");
                System.out.println("Try again...");
                System.out.println();
            }
        }
    }
    public void login()
    {
        
        System.out.println();
        System.out.println("Enter login details");
        System.out.print("Enter your EmailID =");
        String loginemail=sc.next();
        System.out.print("Enter your Password =");
        String loginpwd=sc.next();

        if(loginemail.equals(emailId) && loginpwd.equals(pwd))
        {
            System.out.println("Login Successful...");
            islogin=true;
        }
        else if(loginemail.equals(emailId) && !(loginpwd.equals(pwd)))
        {
            System.out.println("Incorrect password");
            islogin=false;
        }
        else
        {
            System.out.println("Incorrect email");
        }
    }
    public void search()
    {
        System.out.println();
        System.out.println("Choose from the following :");
        System.out.println("1. Book Movies");
        System.out.println("2. Book ComedyShow");
        System.out.println("3. Book LiveEvent");
        System.out.print("Enter your choice =");
        selection = sc.nextInt();
    }
    public void booktickets()
    {
        System.out.println("Ticket is being booked...");
    }
    public void canceltickets()
    {
        System.out.println("Ticket is being cancelled...");
    }
}