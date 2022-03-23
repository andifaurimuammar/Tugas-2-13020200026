/* 13020200026, ANDI FAURI MUAMMAR, Sabtu 19 Maret 2022, 14.03 WITA */

import java.util.Scanner;

public class Konversiwaktu {
    public static void main(String[] args){
        int d,J,M,D,Z;
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukkan Angka = ");d=baca.nextInt();
        D=d;
        J=D/3600; D=D%3600;
        M=D/60; D=D%60;
        Z=J%24;
        System.out.print(D+"Detik = ");
        System.out.print(M+"Menit = ");
        System.out.print(J+"Jam = ");
        System.out.print(Z+"JamSekarang ");
        
    }
}