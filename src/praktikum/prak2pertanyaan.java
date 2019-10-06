/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import tugas6.ReadStreamPushBackReader;

/**
 *
 * @author asus
 */
public class prak2pertanyaan {
    public static void main (String[] args){
        try {
            File f = new File("coba.txt");
            PushbackReader reader = new PushbackReader(new FileReader (f));
            
            char [] words = new char[(int) f.length()];
            
            reader.read(words);
            
            System.out.println(new String (words));
            
            reader.unread((int)words [5]);
            reader.read(words);
            
            System.out.println(new String(words));
        } catch (IOException ex){
            Logger.getLogger(ReadStreamPushBackReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
