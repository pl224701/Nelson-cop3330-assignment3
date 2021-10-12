/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jack Nelson
 */


package ex44;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

import com.google.gson.Gson;



public class App
{
    public class Product{
        String name;
        String price;
        String quantity;
    }
    public class Products{
        Product[] products;
    }
    public static void main( String[] args ) throws IOException /*Main function which calls other functions*/
    {
        String str = new Scanner(new File("src/main/java/ex44/exercise44_input.json")).useDelimiter("\\Z").next();
        Gson gson = new Gson();
        Products productList = gson.fromJson(str,Products.class);
        input input = new input();
        input.inputs(productList);
    }
}
class input
{
    public int inputs(App.Products productList)
    {
        String name = "1";
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while(name!=null)
        {
            System.out.print("What is the product name? ");
            name=sc.nextLine();
            for(int i=0;i<productList.products.length;i++)
            {
                if(Objects.equals(name, productList.products[i].name))
                {
                    n=i;
                    name=null;
                }
            }
            if(name!=null)
            {
                System.out.println("Sorry, that product was not found in our inventory");
            }
        }
        print print = new print();
        print.prints(productList,n);
        return n;
    }
}
class print
{
    public App.Products prints(App.Products productList, int n)
    {
        System.out.println("Name: " + productList.products[n].name);
        System.out.println("Price: " + productList.products[n].price);
        System.out.println("Quantity: " + productList.products[n].quantity);
        return productList;
    }
}
