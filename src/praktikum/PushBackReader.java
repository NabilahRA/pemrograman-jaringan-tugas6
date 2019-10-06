/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class PushBackReader {
    public static void main(String[] args){
        String s = "Polinema tetap jaya selalu di kancah nasional dan akan berlanjut ke internasional";
                    PushbackReader reader = new PushbackReader(new InputStreamReader(new ByteArrayInputStream(s.getBytes())));
                    
                    PushbackReader reader2 = new PushbackReader(new InputStreamReader(new ByteArrayInputStream(s.getBytes())));
                    //tambahan pertanyaan 1
                    
                    char[] words = new char[s.length()];
                    try {
                        reader.read(words);
                        System.out.println("" + new String(words));
                        
                        words = new char[8];
                        System.out.println(new String(words));
                        
                        reader.unread(words,0,0);//modifikasi pertanyaan no 1
                        
                        words = new char[s.length()];
                        reader2.read(words);//tambahan pertanyaan 1
                        System.out.println(new String (words,0,8));
                        System.out.println(new String (words,0,s.length()));
                    } catch (IOException ex) {
                        Logger.getLogger(PushBackReader.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }
}
