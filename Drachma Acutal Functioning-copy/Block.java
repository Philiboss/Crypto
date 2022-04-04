import java.util.Date;
import java.lang.*;

public class Block {
    
    public String hash;
    public String previousHash; 
    private String data; 
    private long Datum; 
    private int nonce;
    
    //Block Constructor.  
    public Block(String data,String previousHash ) {
        this.data = data;
        this.previousHash = previousHash;
        this.Datum = new Date().getTime();
        
        this.hash = calculateHash(); 
    }
    
    //Calculate new hash based on blocks contents
    public String calculateHash() {
        String calculatedhash =  previousHash +Long.toString(Datum) +Integer.toString(nonce) + data ;
                
        String sha256hex = org.apache.commons.codec.digest.DigestUtils.sha256Hex(calculatedhash);   

                
                
                
        
        return sha256hex;
    }
    
 
    public void mineBlock(int difficulty) {
        String target = StringUtil.getDificultyString(difficulty); 
        while(!hash.substring( 0, difficulty).equals(target)) {
            nonce ++;
            hash = calculateHash();
        }
        System.out.println("Block Mined!!! : " + hash);
    }
    
}
