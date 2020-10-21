import java.util.*;
/*
Ini Adalah Program Untuk Menentukan Input meruapakn Bilangan Prima atau Bukan
 */
class billPrima {
    public static void main (String[] args){
        System.out.println("Program Untuk Menentukan Bilangan Prima Atau Bukan");
        Scanner inputUser = new Scanner(System.in);
        int angkaInput,cekAngka = 0;
        System.out.print("Masukkan Angka : ");
        angkaInput = inputUser.nextInt();
        
        for (int i = 2; i<=angkaInput; i++){
            if ((angkaInput%i) == 0){
                cekAngka++ ;
            }
        }
        
        printPrima(cekAngka,angkaInput);
        
    

    }
    private static void printPrima(int cekAngka, int angka){
        if (cekAngka == 1){
            System.out.println(angka + " adalah bilangan Prima");
        } else {
            System.out.println(angka + " adalah bukan bilangan Prima");
        }
    }
}

//Airlangga Permana Putra
//D3 RPLA 44-01