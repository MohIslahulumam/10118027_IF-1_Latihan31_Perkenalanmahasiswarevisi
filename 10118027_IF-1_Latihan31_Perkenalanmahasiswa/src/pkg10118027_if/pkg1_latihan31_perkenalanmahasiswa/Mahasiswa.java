/*
 * NAMA              : M Islahul Umam djasuta
 * KELAS             : IF-01
 * NIM               : 10118027
 * DESKRIPSI PROGRAM : Program Biodata   
 */
package pkg10118027_if.pkg1_latihan31_perkenalanmahasiswa;

/**
 *
 * @author RYZEN
 */
public class Mahasiswa {

    public String nim;
    public String nama;

    public void perkenalkanDiri(String nim, String nama) {
        System.out.println("Hallo Everyone");
        System.out.printf("My NIM is\t: %s%n", nim);
        System.out.printf("My Name is\t: %s%n%n", nama);

    }

}
