import java.util.ArrayList;
import java.util.Scanner;

public class Data_Antrian {

    Scanner input = new Scanner(System.in);

    //instansiasi arraylist
    public ArrayList<Antrian> daftarAntrian = new ArrayList<>(); //menampung 2 tipe objek yaitu antrian teller dan antrian costumer service

    //method tambah daftar antrian
    public void tambahDataAntrian(Antrian tambah){
        daftarAntrian.add(tambah);
    }

    //method cetak antrian
    public void cetakDaftarAntrian(){
        int i= 0;
        int j= 0;
        System.out.println("\nDaftar Antrian ");

        System.out.println("\nDaftar Antrian Teller\n");
        for(Antrian list : daftarAntrian){
            if(list instanceof Antrian_Teller){     //instanceof
                list.cetakAntrian();
                i++;
            }
        }
        if(i == 0){
            System.out.println("Belum Ada Antrian. . .");
        }

        System.out.println("\nDaftar Antrian Customer Service\n");
        for(Antrian list : daftarAntrian){
            if(list instanceof Antrian_CustomerService){        //instanceof
                list.cetakAntrian();
                j++;
            }
        }
        if(j == 0){
            System.out.println("Belum Ada Antrian. . .");
        }


    }
}
