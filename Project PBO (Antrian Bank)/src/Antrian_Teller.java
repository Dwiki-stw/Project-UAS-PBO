import java.util.Scanner;

public class Antrian_Teller extends Antrian{
   
    int nomorAntri = 0;
    String keperluan ="Teller";

    Scanner input = new Scanner(System.in);

    public void setNomorAntri (int nomorAntri){
        this.nomorAntri = nomorAntri;
    }

    public void inputAntrian(){
        String nama;
        String jenisKelamin;

        //input nama
        System.out.print("\nNama Nasabah : ");
        nama = input.nextLine();

        //set nama
        setNama(nama);

        //input Jenis Kelamin
        System.out.print("\nJenis Kelamin : ");
        jenisKelamin = input.nextLine();

        //set Jenis Kelamin
        setJenisKelamin(jenisKelamin);
    }

    // method cetak antrian
    @Override
    public void cetakAntrian (){

        //cetak informasi antrian
        System.out.println("\nNama           : " + getNama() );
        System.out.println("Jenis Kelamin  : " + getJenisKelamin() );
        System.out.println("Keperluan      : " + keperluan );
        System.out.println("Nomor Antri    : " + nomorAntri + "\n");
    }

}