import java.util.Scanner;
public class receiptcreator {
    public static void main(String[] args) {
        String output="";
        for(int i=0;i<40;++i) {
            output+="*";
        }
        System.out.println("How many Golden Apples would you like?");
        Scanner quant = new Scanner(System.in);
        int qApples = quant.nextInt();
        System.out.println("I'm Sorry we don't have gold nor apples. But, today we have a special deal! I can sell you "+qApples+" Watermelons?");
        System.out.print("I'm just kidding we don't sell that either :). This is a bank.");
    }
}