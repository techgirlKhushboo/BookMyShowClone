import java.util.Scanner;
public class Test {
    static{
        System.out.println("****... Welcome to Book My Show ...****");
        System.out.println();System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check=true;
        boolean relogin=true;
        BookMyShow b = new BookMyShow();
        b.Signup();
        while(relogin==true){
            if(b.islogin==true){
                while(check==true){
                    b.search();
                    if(b.selection==1){
                        Movies m = new Movies();
                        m.booktickets();
                        System.out.println();
                        System.out.print("Do you want to cancel ? (Yes/No): ");
                        String choice = sc.next();
                        if(choice.equalsIgnoreCase("yes")){
                            m.canceltickets();
                        }
                        else{
                            System.out.println("Enjoy the show...");
                        }
                        check=false;
                        relogin=false;
                    }
                    if(b.selection==2){
                        ComdeyShow c = new ComdeyShow();
                        c.booktickets();
                        System.out.println();
                        System.out.print("Do you want to cancel ? (Yes/No): ");
                        String choice = sc.next();
                        if(choice.equalsIgnoreCase("yes")){
                            c.canceltickets();
                        }
                        else{
                            System.out.println("Enjoy the show...");
                        }
                        check=false;
                        relogin=false;
                    }
                    if(b.selection==3){
                        System.exit(0);
                    }
                    else{
                        System.out.println("Invalid Input entered!!!");
                        System.out.println("Try again ...");
                    }
                }
            }
            else{
                System.out.println("Try again ...");
                b.Signup();
                relogin=true;
            }
        }
    }
}
