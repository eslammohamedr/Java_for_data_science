/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PyramidsTask;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Eslam
 */
public class PyramidsTask {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PyramidsCsvDaoImp p = new PyramidsCsvDaoImp();
        List<Pyramid> pyramids = p.readPyramidsFromCsv("src/main/resources/data/pyramids.csv");
        int i =0;
        // print the list of objects pyramids
        for(Pyramid pyr : pyramids){
        
            System.out.println("$"+(i++)+pyr);
        
        }
        
        System.out.println("-------------------------------------------------------------------------");
        
        
  
        pyramids.sort(Comparator.comparingDouble(Pyramid::getHeight).reversed());
        
        System.out.println("the sorted heights of the pyramids is ");
        for(Pyramid pi : pyramids){
        
            System.out.println(pi.getHeight());
        }
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("mapping sites with numbers of pyramis in each site");
        Map<String, Integer> mapping = new HashMap<>(); 

        pyramids.forEach(pp->{
            mapping.put(pp.getSite(), 0);
        });
        pyramids.forEach(pp->{
            
            //mapping.replace(pp.getSite(), mapping.get(pp.getSite())+1);
            mapping.forEach((k,v)->{
                if(pp.getSite().equals(k)){
                 v++;
                 mapping.put(pp.getSite(), v);
                 
                
                };
            });
        });
        
         mapping.forEach((k,v)->System.out.println("key = "+k+"\t"+"value = "+v));
         
         
        
        

        
        
    }

    
    
    
    
    
    
    
}
