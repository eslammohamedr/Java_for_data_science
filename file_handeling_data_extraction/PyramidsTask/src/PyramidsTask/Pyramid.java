/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PyramidsTask;

/**
 *
 * @author Eslam
 */
public class Pyramid implements Comparable<Pyramid>{
    
    double Height ;
    String site ;
    String pharaoh ;
    String modern_name;

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public double getHeight() {
        return Height;
    }

    public String getSite() {
        return site;
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public String getModern_name() {
        return modern_name;
    }
    public int getintheight(){
    
        return (int)this.getHeight();
    
    }
     
    public double compareTo(Pyramid p1,Pyramid p2) {
        if (p1.getHeight() > p2.getHeight()) return p1.getHeight();
        else return p2.getHeight();
    }

    @Override
    public int compareTo(Pyramid p1) {
        return (int)Double.max(this.getHeight(), p1.getHeight());
    }
    
    
    
}
