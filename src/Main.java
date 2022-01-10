import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Main main = new Main();
        /**
         * Kullanıcının girdiği sayılardan sadece
         * tek sayıların toplamını
         * bulan program
         */
        main.oddTotal();

        /**
         * Kullanıcı tek sayı girene kadar çift olan ve
         * 4'e tam bölünen sayıların toplamını bulan
         * program
         */
        main.evenTotal();
    }

    public void oddTotal(){
        Scanner scanner = new Scanner(System.in);
        int total = 0, option;
        System.out.println("Negatif bir değer girilene kadar girilen tek sayıların toplamını bulan program");
        do{
            System.out.print("Sayı Girin : ");
            option = scanner.nextInt();
            if(option > 0 && option%2 != 0){
                total += option;
            }
        }while(option > 0);

        System.out.println("Toplam : " + total);
    }

    public void evenTotal(){
        Scanner scanner = new Scanner(System.in);
        int total = 0, option;
        System.out.println("Çift ve 4'ün katları olan sayıların toplanması ");
        do{
            System.out.print("Tek Sayı Girene Kadar Devam : ");
            option = scanner.nextInt();
            if(option%2 == 0 && option%4 == 0){
                total += option;
            }
        }while(option%2 == 0);

        System.out.println("Toplam : " + total);
    }
}
