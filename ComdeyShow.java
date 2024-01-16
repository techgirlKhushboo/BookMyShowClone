public class ComdeyShow extends BookMyShow{
    int price;
    @Override
    public void search()
    {
        System.out.println();
        System.out.println("Choose from the following...");
        System.out.println("1. Standup");
        System.out.println("2. Show");
        System.out.print("Enter your choice =");
        int choice =sc.nextInt();
        if(choice==1)
        {
            System.out.println();
            System.out.println("Choose from the following...");
            System.out.println("1. Munawar");
            System.out.println("2. Harsh");
            System.out.print("Enter your choice =");
            String comedyselection = sc.next();
            System.out.println("Enjoy watching your comedy show of "+comedyselection);
            seatbookingstandup();
        }
        if(choice==2)
        {
            System.out.println();
            System.out.println("Choose from the following...");
            System.out.println("1. Zakir");
            System.out.println("2. Bassi");
            System.out.print("Enter your choice =");
            String comedyselection = sc.next();
            System.out.println("Enjoy watching the comedy show of "+comedyselection+" ...");
            seatbookingshow();
        }
    }
    public void seatbookingstandup()
    {
        System.out.println();
        System.out.print("Enter the number of seats =");
        int Numberofseats = sc.nextInt();
        price = price + (500 * Numberofseats); 
        System.out.println("Total price of tickets is "+price);
        addon();
        taxstandup();
    }
    public void seatbookingshow()
    {
        System.out.println();
        boolean check=true;
        int choice=0;
        System.out.print("Enter the number of seats =");
        int Numberofseats = sc.nextInt();
        System.out.println();
        while(check==true)
        {
            System.out.println("Choose the seats from the following..."); 
            System.out.println("1. Front row ---> 5000Rs");
            System.out.println("2. Middle row ---> 3000Rs");
            System.out.println("3. Last row ---> 1500Rs");
            System.out.print("Enter your choice =");
            choice = sc.nextInt();
            if(choice==1) 
            {
                price = price + (5000 * Numberofseats);
                check=false;
            }
            else if(choice==2) 
            {
                price = price + (3000 * Numberofseats);
                check=false;
            }
            else if(choice==3) 
            {
                price = price + (1500 * Numberofseats);
                check=false;
            }
            else
            {
                System.out.println("Invalid choice entered !!!");
                System.out.println("Try again");
                System.out.println();
            }
        }
        System.out.println("Total price of tickets is "+price);
        addon();
        taxshow(choice);
    }
    public void addon()
    {
        boolean onemore=false;
        System.out.println();
        System.out.print("Do you want to addon ?(Yes/No) =");
        String addon=sc.next();
        if(addon.equalsIgnoreCase("yes"))
        {
            while(onemore==false)
            {
                System.out.println("Choose from the following...");
                System.out.println("1. Popcorn");
                System.out.println("2. Drinks");
                System.out.print("Enter your choice = ");
                int choice = sc.nextInt();
                if(choice == 1)
                {
                    System.out.println();
                    System.out.println("Choose the popcorn size...");
                    System.out.println("1. Small --->150Rs");
                    System.out.println("2. Large --->300Rs");
                    System.out.print("Enter your choice = ");
                    int popcorn = sc.nextInt();
                    System.out.println();
                    System.out.print("Enter the number of addon =");
                    int Numberofaddon = sc.nextInt();
                    if(popcorn == 1)
                    {
                        price = price +(150 * Numberofaddon);
                    }
                    if(popcorn == 2)
                    {
                        price = price +(300 * Numberofaddon);
                    } 
                    System.out.println("Do you want to add other addon? (Yes/No) =");
                    String select = sc.next();
                    if(select.equalsIgnoreCase("No"))
                    {
                        onemore = true;
                    }
                }
                else if(choice == 2)
                {
                    System.out.println();
                    System.out.println("Choose the Drink...");
                    System.out.println("1. Pepsi --->200Rs");
                    System.out.println("2. Old Monk --->500Rs");
                    System.out.print("Enter your choice = ");
                    int popcorn = sc.nextInt();
                    System.out.println();
                    System.out.print("Enter the number of addon =");
                    int Numberofaddon = sc.nextInt();
                    if(popcorn == 1)
                    {
                        price = price +(200 * Numberofaddon);
                    }
                    if(popcorn == 2)
                    {
                        price = price +(500 * Numberofaddon);
                    } 
                    System.out.print("Do you want to add other addon ? (Yes/No) =");
                    String select = sc.next();
                    if(select.equalsIgnoreCase("No"))
                    {
                        onemore = true;
                    }
                }
                else
                {
                    System.out.println("Invalid choice entered !!!");
                    System.out.println("Try again");
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("Total price of Comdeyshow = " + price);
    }
    public void taxstandup()
    {
        price = price + (( 5 * price)/100);
        System.out.println("Total price of Comdeyshow including tax = " + price);
    }
    public void taxshow(int choice)
    {
        if(choice==1)
        {
            price = price + ((15 * price)/100);
        }
        if(choice==2)
        {
            price = price + ((10 * price)/100);
        }
        if(choice==3)
        {
            price = price + ((5 * price)/100);
        }
        System.out.println("Total price of Comdeyshow including tax = " + price);
    }
    @Override
    public void booktickets()
    {
        search();
        System.out.println();
        super.booktickets();
    }
    @Override
    public void canceltickets()
    {
        System.out.println();
        System.out.print("Do you want to really cancel the tickets ? (Yes or no) =");
        String choice = sc.next();
        if(choice.equalsIgnoreCase("yes"))
        {
            super.canceltickets();
            price = price - ((10 * price)/100);
            System.out.println("Total amount refunded is " + price);
        }
        if(choice.equalsIgnoreCase("no"))
        {
            System.out.println("Enjoy the movie...");
        }
    }
}
