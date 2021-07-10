/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import tech.tablesaw.api.Table;

import java.io.IOException;
import tech.tablesaw.columns.Column;
/**
 *
 * @author Eslam
 */
public class TabelSaw {
    
    
     public static void main(String[] args ) {
  
         
         // read the csv file and get specific columns by name
       Table titanic  = null;
       try {
           titanic = Table.read().csv("src/main/resources/data/titanic.csv")
                   .retainColumns("age","sibsp","parch");
       } catch (IOException e) {
           e.printStackTrace ();
       }
       
       // print the summary of the table
         System.out.println(titanic.summary());
         
       


  
     

   }
    
}
