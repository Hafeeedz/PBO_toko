/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaaplication1;

/**
 *
 * @author No Jeneng
 */
public class main {
    public static void main(String[] args) {
     Member member = new Member();
     Karyawan karyawan = new Karyawan();
     Transaksi transaksi = new Transaksi();
     Barang barang = new Barang();
     Laporan laporan = new Laporan();
     
     laporan.laporan(member);
     laporan.laporan(barang);
     transaksi.prosesTransaksi(member,transaksi,barang);
     laporan.laporan(transaksi,barang);
     
}
}
