/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.function.BiPredicate;

/**
 *
 * @author Eslam
 */
public class Lambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String string1="123";
        String string2 ="1234567";
        
        String longer = Stringutils.betterstring(string1, string2,(s1,s2)->{
            return s1.length()>s2.length();
        });
        System.out.println(longer);
        
        String first=Stringutils.betterstring(string1, string2,(s1,s2)->true);
        System.out.println(first);
        
        
        
        String all_char =null;
        if(all_char==null || all_char=="")all_char="1";
        boolean x = all_char.chars().allMatch(Character::isLetter);
        System.out.println(x);      
      
        
    }
    
}
