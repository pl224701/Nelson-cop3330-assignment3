/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jack Nelson
 */


package ex45;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App
{
    public static ArrayList<String> main( String[] args ) throws IOException /*Main function which calls other functions*/
    {
        File file = new File("src/main/java/ex45/exercise45_input.txt");
        Scanner sc = new Scanner(file);
        ArrayList<String> Words = new ArrayList<>();
        String line;
        Pattern pat = Pattern.compile(".*\\R|.+\\z");
        while((line = sc.findWithinHorizon(pat,0))!=null) //reading in file until its finished
        {
            Words.add(line);
        }
        replacement replacement = new replacement();//defining object
        replacement.replacing(Words);//calling replacing function
        return Words;
    }
}
class replacement
{
    public String[] replacing(ArrayList<String> Words)
    {
        String str[] = new String[Words.size()];//assigning string and string size
        for(int i = 0;i< Words.size();i++) // assigning list to string array
        {
            str[i]=Words.get(i);
        }
        for(int i = 0;i< Words.size();i++)// replacing utilizes for use
        {
            str[i]=str[i].replaceAll("utilize","use");
        }
        print print = new print();
        print.prints(str);
        return str;
    }
}

class print
{
    public String prints(String str[]) {
        int size = str.length;
        String test = "true";
        System.out.print("What do you want the name of the output file to be? ");//prompting user for file name
        Scanner sc = new Scanner(System.in);//scanning file name
        String new_file = sc.nextLine();
        try {
            File outfile = new File(new_file);/*Creating outfile and printing to it*/
            if (!outfile.exists()) ;
            {
                outfile.createNewFile();
            }
            PrintWriter pw = new PrintWriter(outfile);
            for (int i = 0; i < size; i++)
            {/*Printing output*/
                System.out.printf("%s",str[i]);
                pw.printf("%s",str[i]);
            }
            if(outfile==null)
            {
                test = null;
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return test;
    }
}