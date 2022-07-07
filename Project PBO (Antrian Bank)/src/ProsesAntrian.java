import java.util.ArrayList;
import java.util.Scanner;

public class ProsesAntrian {
    
    //ArrayList
    public ArrayList<Antrian_Teller> prosesAntrianTeller = new ArrayList<>();       //Antrian Teller
    public ArrayList<Antrian_CustomerService> prosesAntrianCS = new ArrayList<>();  //Antiran Customer Service

    Scanner input = new Scanner(System.in);

    //Tambah Antrian
    public void tambahAntrianTeller(Antrian_Teller tambah){     //tambah antrian teller
        prosesAntrianTeller.add(tambah);
    }
    public void tambahAntrianCS(Antrian_CustomerService tambah){    //tambah antrian customer service
        prosesAntrianCS.add(tambah);
    }

    //Panggil Antrian
    public void panggilAntrianTeller(){         //panggil antrian teller
        String s;
        int i = 0;
        int noAntri=0;
        boolean next = false;

        while(!next){
            System.out.println("\nPanggil Pengantri Berdasarkan Nomor Antrian");
            System.out.print("\nMasukan Nomor Antri : ");
            s = input.nextLine();      //input nomor antrian
            try{
                noAntri = Integer.parseInt(s);
                next = true;
            }catch(NumberFormatException error){
                System.err.println("Nomor Antri Tidak Tersedia !!!");
            }
        }

        for(Antrian_Teller pengatri : prosesAntrianTeller){     //perulangan for untuk proses pencarian objek di arraylist prosesAntrianTeller
            if(pengatri.nomorAntri == noAntri){            //percabangan if untuk membandingkan nilai nomorAntri dari objek pengatri bertipe Antrian_Teller
                prosesAntrianTeller.remove(pengatri);      //menghapus objek dari arraylist prosesAntrianTeller 
                System.out.println("Berhasil dipanggil...\n\n");
                i=1;
                break;      //keluar dari perulangan
            }
        }
        if(i == 0){
            System.out.println("\nNomor Antri Tidak Ditemukan...\n\n");
        }
    }

    public void panggilAntrianCS(){         //panggil antrian customer service
        String s;
        int i = 0;
        int noAntri = 0;
        boolean next = false;

        while(!next){
            System.out.println("\nPanggil Pengantri Berdasarkan Nomor Antrian");
            System.out.print("\nMasukan Nomor Antri : ");
            s = input.nextLine();      //input nomor antrian

            try{
                noAntri = Integer.parseInt(s);
                next = true;
            }catch(NumberFormatException error){
                System.err.println("Nomor Antri Tidak Tersedia !!!");
            }
        }

        for(Antrian_CustomerService pengatri : prosesAntrianCS){    //perulangan for untuk proses pencarian objek di arraylist prosesAntrian CS
            if(pengatri.nomorAntri == noAntri){              //percabagan if untuk membandingkan nilai nomorAntri dari objek pengantri bertipe Antrian_CustomerService
                prosesAntrianCS.remove(pengatri);           //menghapus objek dari arraylist prosesAntrianCS
                System.out.println("Berhasil dipanggil...\n\n");
                i = 1;
                break;      //keluar dari perulangan
            }
        }
        if(i == 0){
            System.out.println("\nNomor Antri Tidak Ditemukan...\n\n");
        }
    }

    //cetak proses antrian
    public void cetakProsesAntrianTeller(){                     //cetak proses antrian teller
        System.out.println("\n~~~ Antrian Teller ~~~\n");
        for(Antrian_Teller antri : prosesAntrianTeller){            //perulangan for untuk mencetak antrian dari arraylist prosesAntrianTeller
                antri.cetakAntrian();                               //cetak antrian dari objek antri bertipe Antrian_Teller
        }
    }
    public void cetakProsesAntrianCS(){                                     //cetak proses antrian customer service
        System.out.println("\n~~~ Antrian Customer Service ~~~\n");
        for(Antrian_CustomerService antri : prosesAntrianCS){               //perulangan for untuk mencetak antrian dari arraylist prosesAntrianCS
                antri.cetakAntrian();                                       //cetak antrian dari objek antri bertipe Antrian_CustomerService
        }

    }
    
}
