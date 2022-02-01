import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int sayi=scanner.nextInt();
        System.out.println(palindromSayi(sayi));
    }
    static String palindromSayi(int x){
        if(x<0) x*=-1;
        int sayi=x;
        String tersSayi="";
        while (sayi>0){
         tersSayi+=Integer.toString(sayi%10);
         sayi/=10;
        }
        int ters=Integer.parseInt(tersSayi);
        return ters==x ? "Sayı palindrom sayıdır." : "Sayı palindrom sayı değildir.";
    }
}
