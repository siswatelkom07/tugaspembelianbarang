
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bisma
 */
public class KerjaRumah {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan jumlah item yang dibeli:");
        int Jumlahitem = input.nextInt();
        
        int Harga = 0;
        int Jumlah = 0;
        int totalharga = 0;
        for (int i = 1; i <= Jumlahitem; i++) {
            System.out.println("Masukkan Harga" + i);
            Harga = input.nextInt();
            System.out.println("Masukkan Jumlah:" + i);
            Jumlah = input.nextInt();
            totalharga += Harga * Jumlah;
        }     
            System.out.println("Jumlah item yang dibeli:" + Jumlahitem);
            System.out.println("Total pembelian:" + totalharga);
               
    }
}
