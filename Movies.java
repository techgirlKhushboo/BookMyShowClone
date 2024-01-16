public class Movies extends BookMyShow {
    int price;

    @Override
    public void search()
    {
        System.out.println();
        System.out.println("Choose the language from the following...");
        System.out.println("1. Hindi");
        System.out.println("2. English");
        System.out.print("Enter your choice =");
        int choice = sc.nextInt();
        if(choice == 1)
        {
            System.out.println();
            System.out.println("Choose the movie to watch in hindi...");
            System.out.println("1. Jawan");
            System.out.println("2. Gadar");
            System.out.println("3. KGF");
            System.out.print("Enter your choice =");
            String movieselection = sc.next();
            System.out.println("Enjoy watching the movie " + movieselection);
        }
        if(choice == 2)
        {
            System.out.println();
            System.out.println("Choose the movie to watch in English...");
            System.out.println("1. Spiderman");
            System.out.println("2. Harry Poter");
            System.out.println("3. Avengers");
            System.out.print("Enter your choice =");
            String movieselection = sc.next();
            System.out.println("Enjoy watching the movie " + movieselection);
        }
    }
    public void seatselection()
    {
        System.out.println();
        System.out.print("Enter the Number of seats =");
        int NumberofSeats = sc.nextInt();
        System.out.println("Choose the seat to select ...");
        System.out.println("1. Normal --> 200Rs");
        System.out.println("2. Premium --> 400Rs");
        System.out.println("3. Executive --> 600Rs");
        System.out.print("Enter your choice =");
        int selectedseat = sc.nextInt();
        if(selectedseat == 1)
        {
            price = price + (200 * NumberofSeats);
        }
        if(selectedseat == 2)
        {
            price = price + (400 * NumberofSeats);
        }
        if(selectedseat == 3)
        {
            price = price + (600 * NumberofSeats);
        }
        System.out.println("Total amount of the movie is " + price);
    }
    public void addon()
    {
        System.out.println();
        System.out.println("Do yo want addon ?");
        System.out.println("1. No");
        System.out.println("2. Yes");
        System.out.print("Enter your choice =");
        int addon = sc.nextInt();
        if(addon==1)
        {
            System.out.println("Total price is " + price);
        }
        if(addon==2)
        {
            System.out.println();
            System.out.println("Choose the addon you want to add...");
            System.out.println("1. Small popcorn --> 150Rs");
            System.out.println("2. Large popcorn --> 30Rs");
            System.out.print("Enter your choice =");
            int choice = sc.nextInt();
            System.out.print("Enter number of addons =");
            int numaddons = sc.nextInt();
            if(choice==1)
            {
                price = price +(150 * numaddons);
                System.out.println("Total price is " + price);
            }
            if(choice==2)
            {
                price = price +(300 * numaddons);
                System.out.println("Total price is " + price);
            }
        }
    }
    public void booktickets()
    {
        search();
        seatselection();
        addon();
    }
    public void canceltickets()
    {
        System.out.println();
        System.out.print("Do you want to really cancel the tickets ? (Yes or no) =");
        String choice = sc.next();
        if(choice.equalsIgnoreCase("yes"))
        {
            super.canceltickets();
            price =0;
            System.out.println("Total amount refunded");
        }
        if(choice.equalsIgnoreCase("no"))
        {
            System.out.println("Enjoy the movie...");
        }
    }
}
