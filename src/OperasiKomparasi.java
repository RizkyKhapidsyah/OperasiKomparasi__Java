/**
 * @author RizkyKhapidsyah
 */
public class OperasiKomparasi {

    public static void main(String[] args) {
        /*
         *   Operasional Komparasi terhadap dua buah nilai akan menghasilkan Boolean (true & false)
         *   Misal :
         */

        int A, B;
        double C, D;
        String Info = null;
        boolean HasilKomparasi;
        
        //=========================================CONTOH 1========================================
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("CONTOH 1: Hasil Komparasi dari Nilai Variabel dengan Tipe Data: Integer/Int)");
        System.out.println("----------------------------------------------------------------------------");
        
        A = 50;                     //Inisialisasi Variabel: Int
        B = 50;                     //Inisialisasi Variabel: Int
        HasilKomparasi = (A == B);  //Operasi Komparasi Terhadap Variabel A dan B

        if (HasilKomparasi != true)                                                     
        {   //Jika Hasil Komparasi = Tidak Sama
            Info = "TIDAK SAMA";
        } 
        else if (HasilKomparasi != false)                                               
        {   //Jika Hasil Komparasi = Sama   
            Info = "SAMA";
        }
        
        System.out.printf("Nilai A(%d) %s Dengan Nilai B(%d)\n\n\n", A, Info, B);

        //=========================================CONTOH 2========================================
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("CONTOH 2: Hasil Komparasi dari Nilai Variabel dengan Tipe Data: Double)");
        System.out.println("-----------------------------------------------------------------------");
        
        C = 20.3;                     //Inisialisasi Variabel: Double
        D = 20.2;                     //Inisialisasi Variabel: Double
        HasilKomparasi = (C == D);    //Operasi Komparasi Terhadap Variabel C dan D

        if (HasilKomparasi != true)                                                     
        {   //Jika Hasil Komparasi = Tidak Sama
            Info = "TIDAK SAMA";
        } 
        else if (HasilKomparasi != false)                                               
        {   //Jika Hasil Komparasi = Sama   
            Info = "SAMA";
        }
        
        System.out.printf("Nilai C(%.1f) %s Dengan Nilai D(%.1f)\n\n\n", C, Info, D);
    }
}
