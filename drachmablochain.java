import java.util.ArrayList;
import java.util.Arrays;

public class DrachmaBlockchain{
    public static void main(String[] args){
        String statment1 = "zerotwo is best waifu";
        int hashswert =statment1.hashCode();
        
        System.out.println("zero = " + statment1 + " has hash val = " + hashswert);

        String[] list1= {"raphtalia", "ichigo", "aqua"};
        String[] list2= {"raphtalia", "ichigo", "aqua"};

        int hash1 = Arrays.hashCode(list1);
        int hash2 = Arrays.hashCode(list2);

        System.out.println("hash1 = " + hash1 + "hash2 = " + hash2);

        ArrayList<Block> blockChain = new ArrayList<Block>();

        String[] initialValues = {"Megumin has 700D", "Rem has 500D"};
        Block firstBlock = new Block(initialValues, 0);
        blockChain.add(firstBlock);
        System.out.print("first block is " + firstBlock.toString());
        System.out.println("THe blcok chain is " + blockChain.toString());

        String[] meguminGivesItAway = {"Megumin gives Ram 40D", "Megumin gives to Ni 60D", "Megumin gives Yumeko 100D"};
        Block secondBlock = new Block(meguminGivesItAway, firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.print("second block is " + secondBlock.toString());
        System.out.println("THe blcok chain is " + blockChain.toString());

        String[] meguminGetsSomeBack = {"Ram gives  Megumin 10D", "Ni gives to Megumin 50D"};
        Block thirdBlock = new Block(meguminGetsSomeBack, secondBlock.getBlockHash());
        blockChain.add(thirdBlock);
        System.out.print("third block is " + thirdBlock.toString());
        System.out.println("THe blcok chain is " + blockChain.toString());
    }



}

