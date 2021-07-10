/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PyramidsTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eslam
 */
public class PyramidsCsvDaoImp implements PyramidsCsvDao {

    @Override
    public List readPyramidsFromCsv(String Filename) {
        List<Pyramid> list=new ArrayList<Pyramid>();
        File f = new File(Filename);
        
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            String st = br.readLine();
            
            
            if(st != null){
            
                System.out.println("File is not empty");
            }
            do{
                st = br.readLine();
                if(st != null){
                String[] attributes = st.split(",");
                
                Pyramid p = createPyramid(attributes);
                
               
                list.add(p);
                
                
                }
            }while(st != null);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PyramidsCsvDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PyramidsCsvDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        return list ;
    }

    @Override
    public Pyramid createPyramid(String[] metaData) {
        Pyramid p =new Pyramid();
         if(metaData[7].isEmpty())p.setHeight(0);
         else p.setHeight(Double.parseDouble(metaData[7]));
                p.setModern_name(metaData[2]);
                p.setPharaoh(metaData[0]);
                p.setSite(metaData[4]);
        
        return p;
        
    }

   
    
    
    
}
