/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalAPIs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eslam
 */
public class CityImp implements DAO{
    
      @Override
    public List readFromCsv(String Filename) {
        List<City> list=new ArrayList<City>();
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
                
                City c = createObject(attributes);
                
               
                list.add(c);
                
                
                }
            }while(st != null);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        return list ;
    }

    @Override
    public City createObject(String[] metaData) {
        City c =new City();
        c.setId(Integer.parseInt(metaData[0]));
        c.setName(metaData[1]);
        c.setPopulation(Integer.parseInt(metaData[2]));
        c.setCountryCode(metaData[3]);
        
        
        return c;
        
    }

    
}
