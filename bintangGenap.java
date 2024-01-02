import java.util.Scanner;
public class bintangGenap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Berapa *:");
        int angka = scan.nextInt();
        int i,j;
        for (i = 0; i < angka ; i+=1){
        for (j = 0; j < i ; j+=1){
        System.out.print("*");
        }
        System.out.println("*");
        }
    }
}
