

interface DATENELEMENT
{
    
    void InformationAusgeben();
    void mineBlock(int difficulty);
    String HashAusgeben();
    
   
    boolean IstKleinerAls(DATENELEMENT dvergleich);

  
    boolean SchluesselIstGleich(String s);
    

}
