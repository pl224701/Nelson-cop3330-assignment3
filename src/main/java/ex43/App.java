/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jack Nelson
 */


package ex43;
import java.io.*;
import java.util.Scanner;

public class App
{
    public static String main( String[] args ) throws FileNotFoundException/*Main function which calls other functions*/
    {
        System.out.print("Site name: ");
        Scanner sc = new Scanner(System.in);//Scanning text
        String str1 = sc.nextLine();
        System.out.print("Author: ");
        String str2 = sc.nextLine();
        Folder folder = new Folder();
        folder.create_folder(str1);
        System.out.print("Do you want a folder for JavaScript? ");
        String str3 = sc.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        String str4 = sc.nextLine();
        if(str3.equals("y"))
        {
            JS js = new JS();
            js.javascript(str1);
        }
        if(str4.equals("y"))
        {
            CSS css = new CSS();
            css.CSS_files(str1);
        }
        index index = new index();
        String str = new Scanner(new File("./website/template.html")).useDelimiter("\\Z").next();
        index.html(str1,str2,str);
        return str1+str2+str3+str4;
    }
}

class Folder
{
    public String create_folder(String name)
    {
        String folder_name = "./website/" + name;
        File new_folder = new File(folder_name);
        String test = "true";
        if (!new_folder.exists())
        {
            new_folder.mkdirs();
            test=null;
        }
        return test;
    }
}

class JS
{
    public String javascript(String name)
    {
        String folder_name = "./website/" + name +"/js/";
        File new_folder = new File(folder_name);
        String test = "true";
        if (!new_folder.exists())
        {
            new_folder.mkdirs();
            test = null;
        }
        return test;
    }
}

class CSS
{
    public String CSS_files(String name)
    {
        String folder_name = "./website/" + name +"/css/";
        File new_folder = new File(folder_name);
        String test = "true";
        if (!new_folder.exists())
        {
            new_folder.mkdirs();
            test = null;
        }
        return test;
    }
}

class index
{
    public String html(String site_name, String author_name, String HTML)
    {
        String file_name = "./website/" + site_name +"/index.html/";
        File html_file = new File(file_name);
        String replaceString = HTML.replace("something",author_name);
        replaceString = replaceString.replace("$Title",site_name);
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(html_file));
            bw.write(replaceString);
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return replaceString;
    }
}