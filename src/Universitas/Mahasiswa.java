
package Universitas;


public class Mahasiswa {  
    private String npm, nama, prodi;
    
    public Mahasiswa(String npm, String nama, String prodi){
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }
    public void getNPM(String npm) {
        this.npm = npm;
    }
    
    public void getNama(String nama) {
        this.nama = nama;
    }
    
    public void getProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public void getDetail (){
         System.out.println(" NPM :"+ npm);
        System.out.println(" Nama :"+ nama);
        System.out.println(" Prodi :"+ prodi);
    }
}
