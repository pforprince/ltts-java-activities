/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4.activity7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Benzee
 */
public class FileProgram {

    public static void main(String[] args) {

        byte[] byteArray = new byte[200];
        try {
            File file1 = new File("src/day4/activity7/file1.txt");
            File file2 = new File("src/day4/activity7/file2.txt");
            file1.createNewFile();
            file2.createNewFile();
            
            
            
            FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);

            fileInputStream.read(byteArray);

            fileOutputStream.write(byteArray);
            System.out.println("The input.txt file is copied to newFile.");

            fileInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
