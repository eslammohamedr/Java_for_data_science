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
public class CountryImp implements DAO{
    
     @Override
    public List readFromCsv(String Filename) {
        List<Country> list=new ArrayList<Country>();
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
                
                Country c = createObject(attributes);
                
               
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
    public Country createObject(String[] metaData) {
        Country c =new Country();
        c.setCode(metaData[0]);
        c.setName(metaData[1]);
        c.setContinent(metaData[2]);
        c.setSurfaceArea(Double.parseDouble(metaData[3]));
        c.setPopulation(Integer.parseInt(metaData[4]));
        c.setGnp(Double.parseDouble(metaData[5]));
        c.setCapital(Integer.parseInt(metaData[6]));
        
        
        return c;
        
    }
    
}
