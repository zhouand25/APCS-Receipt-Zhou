import java.util.Scanner;
public class receiptcreator {
    public static void main(String[] args) {
        String output="";
        for(int i=0;i<40;++i) {
            output+="*";
        }
        System.out.println("How many Red Apples would you like? 1$ per apple");
        Scanner quantRed = new Scanner(System.in);
        int qRed = quantRed.nextInt();
        System.out.println("How many Iron Apples would you like? 50$ per apple");
        Scanner quantIron = new Scanner(System.in);
        int qIron = quantIron.nextInt();
        System.out.println("How many Golden Apples would you like? 10000$ per apple, Trust me friend this is a bargain :)");
        Scanner quantGold = new Scanner(System.in);
        int qGold = quantGold.nextInt();

        int total=(1*qRed)+(50*qIron)+(10000*qGold);
        double fulltotal=total*1.03;
        double tax=total*0.03;

        output+="\n"+"Your Purchase:\n"+qRed+" Red Apples"+"\n"+qIron+" Iron Apples"+"\n"+qGold+" Gold Apples"+"\n";
        output+="Price of Goods: "+total+".00$\n";
        output+="Tax: "+String.format("%.2f", tax)+"$ Trust me friend pay your\ntaxes, it's not worth messing with the IRS!\n";
        output+="Total: "+String.format("%.2f", fulltotal)+"$\n";
        output+="Alright, now I need to find some gold paint.\n";
        for(int i=0;i<40;++i) {
            output+="*";
        }
        System.out.println(output);

    }
}