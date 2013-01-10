/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yusuf
 */
import data.Content ;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cservice {
    
    static void writeinfo( Content cn){
         
        try {
            File fl = new File("write.txt");
            BufferedWriter output = new BufferedWriter(new FileWriter(fl));
            output.write(cn.getNews());
            output.flush();
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(Cservice.class.getName()).log(Level.SEVERE, null, ex);
        }
          
      
    
    }
    
}
