import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String s = scan.next();
        int i;
        float sum=0, ma, nr=0;
        while(true)
        {
            i = scan.nextInt();
            sum=sum+i;
            nr++;
            String Line = new String(scan.nextLine());
            if(Line.length()==0) {
                break;
            }
        }
        ma=sum/nr;
        System.out.println(ma);
    }
}