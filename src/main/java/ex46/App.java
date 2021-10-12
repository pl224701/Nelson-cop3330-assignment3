/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jack Nelson
 */


package ex46;
import java.io.*;
import java.util.*;

public class App
{
    public static String[] main( String[] args ) throws IOException /*Main function which calls other functions*/
    {

        String str = new Scanner(new File("src/main/java/ex46/exercise46_input.txt")).useDelimiter("\\Z").next();
        String[] Words = str.split("\\s+");
        uniqueNames unique = new uniqueNames();
        unique.unique(Words);
        return Words;
    }
}
class uniqueNames
{
    public String[] unique(String[] Names)
    {
        List<String> list = new ArrayList<String>(Arrays.asList(Names));
        for(int i=1;i<list.size();i++)
        {
            for(int j=0;j<i;j++)
            {
                if(list.get(i).equals(list.get(j)))
                {
                    list.remove(i);
                    i--;
                    break;
                }
            }
        }
        String[] uniqueNames = new String[list.size()];
        for(int i=0;i<list.size();i++)
        {
            uniqueNames[i]=list.get(i);
        }
        Counter counter = new Counter();
        counter.counts(uniqueNames,Names);
        return uniqueNames;
    }
}
class Counter
{
    public Integer[] counts(String[] uniqueNames, String[] str)
    {
        Integer[] int_string = new Integer[uniqueNames.length];
        for(int i=0;i<uniqueNames.length;i++)
        {
            int_string[i]=0;
        }
        for(int i=0;i<uniqueNames.length;i++)
        {
            for(int j=0;j<str.length;j++)
            {
                if(Objects.equals(uniqueNames[i], str[j]))
                {
                    int_string[i]++;
                }
            }
        }
        reorder reorder = new reorder();
        reorder.reordered(uniqueNames,int_string);
        return int_string;
    }
}

class reorder
{
    public Integer[] reordered(String[] uniqueNames, Integer[] int_string)
    {
        int temp1;
        String temp2;
        for(int i=0;i<int_string.length;i++)
        {
            for(int j=i+1;j<int_string.length;j++)
            {
                if(int_string[i]<int_string[j])
                {
                    temp1=int_string[i];
                    int_string[i]=int_string[j];
                    int_string[j]=temp1;
                    temp2=uniqueNames[i];
                    uniqueNames[i]=uniqueNames[j];
                    uniqueNames[j]=temp2;
                }
            }
        }
        printer printer = new printer();
        printer.print(uniqueNames,int_string);
        return int_string;
    }
}

class printer
{
    public void print(String[] uniqueNames, Integer[] int_string)
    {
        int size = uniqueNames.length;
        String str = "*";
        for(int i=0;i<size;i++)
        {
            System.out.format("%-9s %s",uniqueNames[i]+":", str);
            for(int j=1; j<int_string[i];j++)
            {
                System.out.printf("%s",str);
            }
            System.out.print("\n");
        }
    }
}