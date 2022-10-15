package pratikum_2;
import java.util.Scanner;

public class tugas6 {
 public static void main(String[] args) {
  int pilih;
  Scanner input = new Scanner(System.in);
  Scanner input2 = new Scanner (System.in);
  String jwb;
  
  do {
  System.out.println("Menu Sarapan:");
  System.out.println("1. Nasi kebuli");
  System.out.println("2. Bubur kacang");
  System.out.println("3. Soto babat");
  System.out.print("Pilihan Anda = ");
  pilih = input.nextInt();
  
  if (pilih == 1) {
   System.out.println("Anda memesan Nasi kebuli dengan harga Rp\r\n"
     + "55.000,-");
  }else if (pilih == 2) {
   System.out.println("“Anda memesan Bubur kacang dengan harga Rp10.000,-");
  }else if (pilih == 3) {
   System.out.println("“Anda memesan Soto babat dengan harga Rp 30.000,-");
  }else {
   System.out.println("Maaf menu yang anda masukkan salah.");
  }
  System.out.print("\nApa ingin mengulang (Y/N) ? = ");
  jwb = input2.nextLine();
  }while (jwb.equals("Y")||jwb.equals("y"));
  
  System.out.println();
  System.out.println("------Sesi Selesai------");
  
 }
}
