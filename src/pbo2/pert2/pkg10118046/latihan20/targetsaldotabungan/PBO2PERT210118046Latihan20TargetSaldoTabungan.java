/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert2.pkg10118046.latihan20.targetsaldotabungan;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menghitung saldo bulanan sampai target yang ditentukan
 */
public class PBO2PERT210118046Latihan20TargetSaldoTabungan {

    /**
     * @param saldo
     * @return 
     */
    
    public static int hitungSaldo(int saldo)
    {
        int bunga = (int) (saldo * 0.08);
        int hasil = saldo + bunga;
        return hasil;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 3500000;
        int i = 1;
        NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
        do {
            saldo = hitungSaldo(saldo);
            System.out.println("Saldo Bulan ke-" + i + " Rp. " + nf.format(saldo));
            i++;
        } while (saldo<6000000);
        System.out.println("Developed by: M. Hilmy Naufal");
    }
    

}
