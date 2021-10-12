/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jack Nelson
 */


package ex41;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class App
{
    public static void main( String[] args ) throws IOException /*Main function which calls other functions*/
    {
        String file = "src/main/java/ex41/exercise41_input.txt";
        BufferedReader br = new BufferedReader(new FileReader(file));/*Reading in file*/
        ArrayList<String> Names = new ArrayList<>();
        String line;
        while((line=br.readLine())!=null)
        {
            Names.add(line);
        }
        br.close();
        Alphabetize Alphabetize = new Alphabetize(); /*Creating object for class*/
        Alphabetize.Alphabetizes(Names); /*Calling function from Alphabetize*/
    }
}
class Alphabetize
{
    public String[] Alphabetizes(ArrayList<String> Names)
    {
        String str[]=new String[Names.size()];
        for(int i=0;i<Names.size();i++)
        {
            str[i]=Names.get(i);
        }
        String temp;
        for(int i = 0;i<Names.size();i++)/*Alphabetizing names*/
        {
            for(int j = i+1;j<Names.size();j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        print print = new print();/*Creating object for print and calling print function*/
        print.prints(str);
        return str;
    }
}

class print
{
    public String prints(String str[])
    {
        String test="something";
        int size = str.length;
        try {
            File outfile = new File("exercise41_output.txt");/*Creating outfile and printing to it*/
            if (!outfile.exists()) ;
            {
                outfile.createNewFile();
            }
            PrintWriter pw = new PrintWriter(outfile);
            pw.printf("Total of %d names\n", size);/*Printing output*/
            pw.print("-----------------\n");
            System.out.printf("Total of %d names\n", size);/*Printing output*/
            System.out.println("-----------------");
            for (int i = 0; i < size; i++) {
                System.out.println(str[i]);
                pw.println(str[i]);
            }
            pw.close();
            if(outfile==null)
            {
                test=null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return test;
    }
}
