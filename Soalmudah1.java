import java.util.Scanner;

public class Soalmudah1 {
    public static void main(String[] args) {
        double TotalBelanja;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan total pembelian: ");
        TotalBelanja = s.nextDouble();


        if(TotalBelanja < 100000){
            System.out.println("Anda tidak mendapatkan diskon");
           
        } else if (TotalBelanja >=100000 && TotalBelanja <=200000) {
            System.out.println("Anda mendapatkan diskon 10 %");

          }  else if (TotalBelanja >=200000){
                System.out.println("Anda mendapatkan diskon 20%");;
            }
    
            }
    }
