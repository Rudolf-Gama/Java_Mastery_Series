package advancedjava;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args){
        //to create a file
       /* File file=new File("myfile.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Cannot create a file");
            throw new RuntimeException(e);
        }

        //to write in a file

        try {
           FileWriter fileWriter = new FileWriter("myfile.txt");
            fileWriter.write("this is my first file in our java class");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //to read a file
        File myfile=new File("myfile.txt");
        try {
            Scanner sc=new Scanner(myfile);
            while (sc.hasNextLine()){
                String s=sc.nextLine();
                System.out.println(s);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        */

        //to deleted a file
        File mfile=new File("myfile.txt");
        if(mfile.delete()){
            System.out.println("i deleted the file named as "+ mfile.getName());
        }else{
            System.out.println("Could not delete the file");
        }

    }
}
