package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";

        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();//to avoid the problem with next scan.nextLine
            // *** create a new item and add it to the cart
            item=new Item(itemName,itemPrice,quantity);
            cart.add(item);
            // *** print the contents of the cart object using println
            //System.out.println(cart); old method
            //loop
            double total=0;     //variable to update the total price
            for(int i=0;i<cart.size();i++){
                total+=cart.get(i).getPrice()*cart.get(i).getQuantity();
                System.out.println("Item "+(i+1)+" : "+cart.get(i).getName()+", unit price="+cart.get(i).getPrice()+", quantity="+cart.get(i).getQuantity());
            }

            //printing the total price
            System.out.println("The total price of the item in the cart is "+total);


            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();


        }
        while (keepShopping.equals("y"));

    }
}
