/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PyramidsTask;

import java.util.List;



/**
 *
 * @author Eslam
 */
public interface PyramidsCsvDao {
    
    /**
     *
     * @return
     */
    public List readPyramidsFromCsv(String Filename);
    public Pyramid createPyramid(String[] metaData );
    
}
