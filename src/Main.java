import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String user,password;
        int login=3;
        int select;
        int balance=2000;
        int price;

        Scanner input = new Scanner(System.in);

        while (login>0){
            System.out.print("Kullanıcı Adınız: ");
            user=input.nextLine();

            System.out.print("Şifre: ");
            password=input.nextLine();

            if(user.equals("patika") && password.equals("dev123")){
                System.out.println("Kodluyorz Bankasına Hosgeldiniz");

                do {
                    System.out.println("\n1:Para Yatrıma\n"+
                            "2:Para Çekme\n"+
                            "3:Bakiye Sorgulama\n"+
                            "4:Çıkış");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
                    select=input.nextInt();

                    switch (select){

                        case 1:
                            System.out.print("Para Miktarı: ");
                            price=input.nextInt();
                            balance+=price;
                            price=0;
                            break;

                        case 2:
                            System.out.print("Para Miktarı: ");
                            price=input.nextInt();
                            balance-=price;
                            price=0;
                            break;

                        case 3:
                            System.out.print("Bakiye: "+balance);
                            break;

                        case 4:
                            System.out.println("Tekrar Görüşmek Üzere");
                            break;

                        default:
                            System.out.println("Geçersiz işlem. Lütfen Tekrar Deneyiniz");
                    }
                }
                while (select !=4);
                break;
            }
            else {
                login--;

                if(login==0){
                    System.out.println("Hesabınız bloke olmustur. Lütfen banka ile iletişime geçiniz.");
                }else{
                    System.out.println("Kullanıcı adı veya şifreniz yanlış. Tekrar Deneyiniz.");
                    System.out.println("Kalan hakkınız : "+login);

                }
            }

        }

    }
}
