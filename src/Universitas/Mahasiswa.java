
package Universitas;


public class Mahasiswa {  
package universitas;
public class Mahasiswa {
    private String npm, nama, prodi;
    
    public Mahasiswa(String npm, String nama, String prodi){
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }
    public void setNPM(String npm) {
        this.npm = npm;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
