import java.util.Scanner;

public class Testclass {

    //array object antrian teller
    public static Antrian_Teller[] antriTeller = new Antrian_Teller [100];
        
    //array object antrian customer service
    public static Antrian_CustomerService[] antriCS = new Antrian_CustomerService [100];
   
    //object proses antrian
    public static ProsesAntrian prosesAntri = new ProsesAntrian();
    
    //object data antrian
    public static Data_Antrian dataAntrian = new Data_Antrian();

    public static Scanner input = new Scanner(System.in); 
    
    public static String sPilih;
    public static int pilih;
    public static int noAntriT = 0;
    public static int noAntriCS = 0;

    public static void main(String[] args) {

        do{
            menuAplikasi();

            if (pilih == 1){
                cetakProsesAntri();
            }
            else if(pilih == 2){
                menuTambahAntrian();

                if(pilih == 1){
                    createAntrianTeller();
                }
                else if(pilih == 2){
                    createAntrianCS();
                }
            }
            else if(pilih == 1122){
                menuAdmin();

                if(pilih == 1){
                   roleTeller();
                }
                else if(pilih == 2){
                    roleCS();
                }
                else if(pilih == 3){
                    dataAntrian.cetakDaftarAntrian();
                }
            }
        }while(true);  
           
    }

    public static void menuAplikasi(){
        boolean next = false;;
        while(!next){
            System.out.println("\n~~~~~~~~ Antrian Bank ~~~~~~~~");
            System.out.println("1. Lihat Antrian");
            System.out.println("2. Tambah Antrian");

            System.out.print("\npilih (1/2): ");
            sPilih = input.nextLine();
            try{
                pilih = Integer.parseInt(sPilih);
                if(pilih < 1 || pilih > 2 ){
                    if(pilih == 1122){
                        next = true;
                    }
                    else{
                        throw new ArithmeticException();
                    }
                }
                next = true;
            }catch(NumberFormatException error){
                System.err.println("Menu tidak tersedia !!!");
            }catch(ArithmeticException error){
                System.err.println("Menu tidak tersedia !!!");
            }
        }
            
        
    }

    public static void cetakProsesAntri(){
    
        //proses antri teller
        prosesAntri.cetakProsesAntrianTeller();
        if(noAntriT == 0){
            System.out.println("Belum Ada Antrian\n");
        }
    
        //proses antri customer service
        prosesAntri.cetakProsesAntrianCS();
        if(noAntriCS == 0){
            System.out.println("Belum Ada Antrian\n");
        }
    }

    public static void menuTambahAntrian(){
        boolean next = false;
        while(!next){
            System.out.println("\n~  Tambah Antrian ~");
            System.out.println("1. Teller");
            System.out.println("2. Customer Service");

            System.out.print("\npilih (1/2): ");
            sPilih = input.nextLine();
            try{
                pilih = Integer.parseInt(sPilih);
                if(pilih < 1 || pilih > 2 ){
                    throw new ArithmeticException();
                }
                next = true;
            }catch(NumberFormatException error){
                System.err.println("Menu tidak tersedia !!!");
            }catch(ArithmeticException error){
                System.err.println("Menu tidak tersedia !!!");
            }
        }
    }

    public static void createAntrianTeller(){
        //instansiasi objek antriTeller[noAntriT]
        antriTeller[noAntriT] = new Antrian_Teller();

        antriTeller[noAntriT].inputAntrian();               //objek memanggil method inputAntrian() untuk input antrian
        antriTeller[noAntriT].setNomorAntri(noAntriT+1);    //objek memangil method setNomorAntri() untuk set nomor antri

        antriTeller[noAntriT].cetakAntrian();               //objek memanggil method cetakAntrian() untuk mencetak antrian

        prosesAntri.tambahAntrianTeller(antriTeller[noAntriT]);     //objek prosesAntri memanggil method tambahAntrianTeller() untuk menambahkan objek antriTeller[noAntriT] ke dalam arraylist prosesAntrianTeller
        dataAntrian.tambahDataAntrian(antriTeller[noAntriT]);       //objek dataAntrian memanggil method tambahDataAntrian() untuk menambahkan objek antriTeller[noAntriT] ke dalam arrylist daftarAntrian
                
        noAntriT++;         //value variabel noAntriT bertambah 1
    }

    public static void createAntrianCS(){
        //instansiasi objek antriCS[noAntriCS]
        antriCS[noAntriCS] = new Antrian_CustomerService();
                
        antriCS[noAntriCS].inputAntrian();                  //objek memanggil method inputAntrian() untuk input antrian
        antriCS[noAntriCS].setNomorAntri(noAntriCS+1);      //objek memangil method setNomorAntri() untuk set nomor antri
                
        antriCS[noAntriCS].cetakAntrian();                  //objek memanggil method cetakAntrian() untuk mencetak antrian
                
        prosesAntri.tambahAntrianCS(antriCS[noAntriCS]);        //objek prosesAntri memanggil method tambahAntrianCS() untuk menambahkan objek antriCS[noAntriCS] ke dalam arraylist prosesAntrianCS
        dataAntrian.tambahDataAntrian(antriCS[noAntriCS]);      //objek dataAntrian memanggil method tambahDataAntrian() untuk menambahkan objek antriCS[noAntriCS] ke dalam arrylist daftarAntrian

        noAntriCS++;        //value variabel noAntriCS bertambah 1
    }

    public static void menuAdmin(){
        boolean next = false;
        while (!next){
            System.out.println("\n~~~ Admin ~~~");
            System.out.println("1. Teller");
            System.out.println("2. Customer Service");
            System.out.println("3. Daftar Seluruh Antrian");

            System.out.print("\npilih : ");
            sPilih = input.nextLine();

            try{
                pilih = Integer.parseInt(sPilih);
                if(pilih < 1 || pilih > 3 ){
                    throw new ArithmeticException();
                }
                next = true;
            }catch(NumberFormatException error){
                System.err.println("Menu tidak tersedia !!!");
            }catch(ArithmeticException error){
                System.err.println("Menu tidak tersedia !!!");
            }
        }
    }

    public static void roleTeller(){
        boolean next = false;
        while(!next){
            System.out.println("\n~ ~ Teller ~ ~");
            prosesAntri.cetakProsesAntrianTeller();

            System.out.println("1. Panggil Antrian");
            System.out.println("2. keluar");

            System.out.print("\npilih : ");
            sPilih = input.nextLine();
            
            try{
                pilih = Integer.parseInt(sPilih);
                if(pilih < 1 || pilih > 2 ){
                    throw new ArithmeticException();
                }
            }catch(NumberFormatException error){
                System.err.println("Menu tidak tersedia !!!");
            }catch(ArithmeticException error){
                System.err.println("Menu tidak tersedia !!!");
            }

            if(pilih == 1){
                prosesAntri.panggilAntrianTeller();
            }
            else if (pilih == 2){
                break;
            }
        }
    }

    public static void roleCS(){
        boolean next = false;
        while(!next){
            System.out.println("\n~ ~ Customer Service ~ ~");
            prosesAntri.cetakProsesAntrianCS();

            System.out.println("1. Panggil Antrian");
            System.out.println("2. keluar");

            System.out.print("\npilih : ");
            sPilih = input.nextLine();

            try{
                pilih = Integer.parseInt(sPilih);
                if(pilih < 1 || pilih > 2 ){
                    throw new ArithmeticException();
                }
            }catch(NumberFormatException error){
                System.err.println("Menu tidak tersedia !!!");
            }catch(ArithmeticException error){
                System.err.println("Menu tidak tersedia !!!");
            }

            if(pilih == 1){
                prosesAntri.panggilAntrianCS();
            }
            else if(pilih == 2){
                break;
            }
        }
    }

}
