public class StockItem
{
    private String description;

    private int id = 0;

    private double price;

    private int quantity;

    private static int itemId = 0; //allows id number to increment

    public StockItem()
    {

    }

    public StockItem(String description, double price, int quantity)
    {
        id = itemId++;
        this.description =description;
        this.price=price;
        this.quantity=quantity;

    }

    public String getDescription()
    {
        return description;
    }

    public int getId()
    {
        return id;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setPrice(double price)
    {
        if(price < 0)
        {
            System.out.println("Error: The price cannot be less than $0.00");
        }
        else
        {
            this.price = price;
        }
    }

    public void lowerQuantity(int quantity)
    {
        if(this.quantity-quantity < 0)
        {
            System.out.println("Error: The quantity cannot be less than 0");
        }
        else
        {
            this.quantity -= quantity;
        }
    }

    public void raiseQuantity(int quantity)
    {
        this.quantity += quantity;
    }





    @Override
    public String toString()
    {
        return "Item number: " + id + " is " + description + " has price " + price + " we currently have " + quantity + " in stock";
    }
}
