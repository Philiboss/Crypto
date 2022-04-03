
/**
 * Write a description of class Arbeit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import java.util.ArrayList;
import com.google.gson.GsonBuilder;

public class Arbeit
{
    // instance variables - replace the example below with your own
    private int x;
    public static int difficulty = 5;
    public static ArrayList<Block> blockchain = new ArrayList<Block>();

    /**
     * Constructor for objects of class Arbeit
     */
    public Arbeit()
    {
        addBlock(new Block("1 Drachma, from Theodoros, to Tountas", "0"));
        addBlock(new Block("4 Drachma, from Tzo, to Tountas", blockchain.get(blockchain.size()-1).hash));

        ShowBlockChain();
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   public static void addBlock(Block newBlock) {
		newBlock.mineBlock(difficulty);
		blockchain.add(newBlock);
	}
    public void ShowBlockChain()
    {
        String blockchainJson = StringUtil.getJson(blockchain);
		System.out.println("\nThe block chain: ");
		System.out.println(blockchainJson);
    
    }
}
