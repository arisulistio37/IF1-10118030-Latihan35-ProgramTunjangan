/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi Program : program ini berisi tentang tunjangan karyawan
 */
public class IF110118030Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Karyawan emp = new Karyawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        emp.gajiPokok = scanner.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        emp.status = scanner.next();

        emp.HasilHitung(emp.status,emp.gajiPokok);
    }
    
}
