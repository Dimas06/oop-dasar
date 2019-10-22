/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author dimas_06
 */
public class Profile {
    long modelNIM;
    String modelNama;
    String modelAlamat;
    String modelJurusan;
    long modelAngkatan;
public Profile(long NIM, String Nama, String Alamat, String Jurusan, long Angkatan){
       modelNIM = NIM;
       modelNama = Nama;
       modelAlamat = Alamat;
       modelJurusan = Jurusan;
       modelAngkatan = Angkatan;

}
public static void main(String[] args){
    Profile myProfile = new Profile (201869040005L,"Zaenal Dimas Fadhilah","Tembong-Plintahan-Pandaan","Teknik Informatika",2018L);
    System.out.println(myProfile.modelNIM +" " + myProfile.modelNama +" " + myProfile.modelAlamat +" "+ myProfile.modelJurusan +" "+ myProfile.modelAngkatan);
  }
}