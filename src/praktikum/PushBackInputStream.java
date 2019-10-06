/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class PushBackInputStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader nb = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan lokasi file   :");
        String input = nb.readLine();
        
        Scanner br = new Scanner(System.in);
        
        //PushbackInputStream stream = new PushbackInputStream(System.in);
        PushbackInputStream stream = new PushbackInputStream(new FileInputStream("coba.txt"));//jawaban pertanyaan no 1
        
                 //System.out.print("Masukan karakter apapun: ");
                 try {
                     int read = stream.read();
                     stream.unread(read);
                     int read2 = stream.read();
                     int read3 = stream.read();
                     //stream.unread(read);
                     System.out.println("" + (char) read);
                     System.out.println("" + (char) read2);
                     System.out.println("" + (char) read3);
                 } catch (IOException ex) {
                     Logger.getLogger(PushBackInputStream.class.getName()).log(Level.SEVERE, null, ex);
                 }
    }
}
