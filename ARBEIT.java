
/**
 * Testklasse fuer die Liste
 */

import java.util.ArrayList;
import com.google.gson.GsonBuilder;




public class ARBEIT
{
    LISTE liste;
    DATENELEMENT p1;
    DATENELEMENT p2;
    DATENELEMENT p3;
    public static int difficulty = 5;
    
    
    /**
     * Constructor for objects of class ARBEIT
     */
    public ARBEIT()
    {
        liste = new LISTE();
        
        // Liste fuellen
        
        p1 = new PATIENT2("Genesis Block", "0");
        p1.mineBlock(difficulty);
        liste.VorneEinfuegen(p1);
        
        
        p2 = new PATIENT2("1 Drachma, from Theodoros, to Joe" , liste.EndeDatei().HashAusgeben());
        p2.mineBlock(difficulty);
        liste.VorneEinfuegen(p2);
        
        
        
        
        
        
        
    }
    
    
}
