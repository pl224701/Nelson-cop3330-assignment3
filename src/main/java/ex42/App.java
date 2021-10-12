/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jack Nelson
 */


package ex42;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class App
{
    public static ArrayList<String> main( String[] args ) throws IOException /*Main function which calls other functions*/
    {
        String file = "src/main/java/ex42/exercise42_input.txt";
        BufferedReader br = new BufferedReader(new FileReader(file));/*Reading in file*/
        ArrayList<String> Names = new ArrayList<>();
        String line;
        while((line=br.readLine())!=null)
        {
            Names.add(line);
        }
        br.close();
        Parser Parser = new Parser(); /*Creating object for class*/
        Parser.Parse(Names); /*Calling function from Alphabetize*/
        return Names;
    }
}
class Parser
{
    public String[] Parse(ArrayList<String> Names)/*Parsing string to remove commas*/
    {
        String str[]=new String[Names.size()];
        for(int i=0;i<Names.size();i++)
        {
            str[i]=Names.get(i);
        }
        for(int i=0;i<Names.size();i++)
        {
            str[i]=str[i].replaceAll("[,]"," ");/*Removing commas*/
        }

        print print = new print();/*Creating object for print and calling print function*/
        print.prints(str);
        return str;
    }
}

class print
{
    public String prints(String str[]) {
        String test = "something";
        int size = str.length;
        try {
            File outfile = new File("exercise42_output.txt");/*Creating outfile and printing to it*/
            if (!outfile.exists()) ;
            {
                outfile.createNewFile();
            }
            PrintWriter pw = new PrintWriter(outfile);
            pw.print("Last      First     Salary\n");/*Printing output*/
            pw.println("--------------------------\n");
            System.out.print("Last      First     Salary\n");/*Printing output*/
            System.out.println("--------------------------");
            for (int i = 0; i < size; i++) {/*Printing output*/
                String[] str1 = str[i].split(" ");/*Separating string for formatting*/
                System.out.format("%-9s %-9s %-9s",str1[0],str1[1],str1[2]);
                pw.format("%-9s %-9s %-9s",str1[0],str1[1],str1[2]);
                System.out.print("\n");
                pw.print("\n");
            }
            if(outfile==null)
            {
                test=null;
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return test;
    }
}