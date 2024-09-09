import java.util.Scanner;

public class Driver
{
    public static void main (String[] args)
    {
        StockItem milk = new StockItem( "1 Gallon of Milk",3.60,15);
        StockItem bread = new StockItem( "1 Loaf of Bread",1.98,30);
        Scanner input = new Scanner(System.in);

        int terminate = 0;

        while(terminate == 0)
        {
            System.out.println("1. Sold One Milk" + "\n" +
                                "2. Sold One Bread" + "\n" +
                                "3. Change price of Milk" + "\n" +
                                "4. Change price of Bread" + "\n" +
                                "5. Add Milk to Inventory" + "\n" +
                                "6. Add Bread to Inventory" + "\n" +
                                "7. See Inventory" + "\n" +
                                "8. Quit");

            int choice = input.nextInt();

            if(choice == 1)
            {
                milk.lowerQuantity(1);
            }
            else if(choice == 2)
            {
                bread.lowerQuantity(1);
            }
            else if(choice == 3)
            {
                System.out.println("What is the new price for Milk");
                double choicePrice = input.nextDouble();
                milk.setPrice(choicePrice);
            }
            else if(choice == 4)
            {
                System.out.println("What is the new price for Bread");
                double choicePrice = input.nextDouble();
                bread.setPrice(choicePrice);
            }
            else if(choice == 5)
            {
                System.out.println("How many milk did we get?");
                int newInventory = input.nextInt();
                milk.raiseQuantity(newInventory);
            }
            else if(choice == 6)
            {
                System.out.println("How many bread did we get?");
                int newInventory = input.nextInt();
                bread.raiseQuantity(newInventory);
            }
            else if(choice == 7)
            {
                System.out.println();
                System.out.println(milk);
                System.out.println(bread);
            }
            else if(choice == 8)
            {
                terminate = 1;
            }
            System.out.println();
        }
    }
}
