
import java.io.IOException;
import joinery.DataFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import joinery.DataFrame;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Eslam
 */
public class Joinary {
    
    public static void main(String args[]) {
        try {

             // read the csv file and get specific columns by name
            DataFrame<Object> df = DataFrame.readCsv ("src/main/resources/data/titanic.csv")
                    .retain ("age","sibsp","parch")
            .describe ();
             System.out.println (df.toString ());
            System.out.println ("=========================================================================================");
        System.out.println ("================================adding column to data frame=========================================================");
 
        // processing a column and the new values to a list
        // female =1   male=0
             DataFrame<Object> df2 = DataFrame.readCsv ("src/main/resources/data/titanic.csv")
                     .retain ("pclass", "survived", "name", "sex", "age");
            List<Object> newValues = new ArrayList<> ();
            List<Object> values = df2.col ("sex");
            values.forEach(obj->{
                     if (obj instanceof String) {
                    String str = (String) obj;
                    if (str != null && str.equals ("female"))
                        newValues.add (1);
                    else
                        newValues.add (0);
                    
                }
            }); 
            // add the list as a column in DF
            df2.add("Gender",newValues);

           System.out.println (df2.head (10));
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
    
}
