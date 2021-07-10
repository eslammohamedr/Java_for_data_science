/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalAPIs;

import java.util.List;

/**
 *
 * @author Eslam
 */
public interface DAO {
    
    public List readFromCsv(String Filename);
    public Object createObject(String[] metaData );
    
}
