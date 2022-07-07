
public class Antrian {
    private String nama;
    private String jenisKelamin;

    
    //Method setter
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

     //Method getter
    public String getNama(){
        return nama;
    }

    public String getJenisKelamin(){
        return jenisKelamin;
    }

    //method cetak antrian
    public void cetakAntrian (){

        //cetak informasi antrian
        System.out.println("\nNama           : " + getNama() );
        System.out.println("Jenis Kelamin  : " + getJenisKelamin() );
    }

}
