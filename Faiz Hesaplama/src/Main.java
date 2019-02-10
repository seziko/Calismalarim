import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            boolean devamEdilsinMi=false;
            do {
                int a = 1, b = 2, c = 3, d = 0;

                Scanner scanner = new Scanner(System.in);
                System.out.println("Faiz türünü seçiniz." +
                        "a-) Gunluk için 1 giriniz." +
                        " b-) Aylık için 2 giriniz" +
                        " c-) Yıllık için 3 giriniz."+
                        " d-) çıkış yapmak için 0 giriniz..");
                int input = scanner.nextInt();
                if (input == c) {
                    double odenecekFaiz;
                    Scanner input1 = new Scanner(System.in);
                    System.out.print("Ana Parayı Giriniz.");
                    double anaPara = scanner.nextDouble();

                    System.out.print("Faiz Oranını Giriniz.");
                    Float faizOrani = scanner.nextFloat();

                    System.out.print("Faizde Kalacak Zamanı Giriniz.(Yıl)");
                    double sure = scanner.nextInt();

                    odenecekFaiz = (anaPara * faizOrani * sure) / 100;

                    System.out.println("Ödenecek Faiz Tutarı " + odenecekFaiz);

                    System.out.println("Hesaplama Bitmiştir.");
                    devamEdilsinMi=true;

                } else if (input == b) {
                    double odenecekFaiz;
                    Scanner input2 = new Scanner(System.in);
                    System.out.print("Ana Parayı Giriniz.");
                    double anaPara = scanner.nextDouble();

                    System.out.print("Faiz Oranını Giriniz.");
                    Float faizOrani = scanner.nextFloat();

                    System.out.print("Faizde Kalacak Zamanı Giriniz.(Ay)");
                    double sure = scanner.nextInt();

                    odenecekFaiz = (anaPara * faizOrani * sure) / 1200;

                    System.out.println("Ödenecek Faiz Tutarı " + odenecekFaiz);

                    System.out.println("Hesaplama Bitmiştir.");
                    devamEdilsinMi=true;
                } else if (input == a) {
                    double odenecekFaiz;
                    Scanner input3 = new Scanner(System.in);
                    System.out.print("Ana Parayı Giriniz.");
                    double anaPara = scanner.nextDouble();

                    System.out.print("Faiz Oranını Giriniz.");
                    Float faizOrani = scanner.nextFloat();

                    System.out.print("Faizde Kalacak Zamanı Giriniz(Gün).");
                    double sure = scanner.nextInt();

                    odenecekFaiz = (anaPara * faizOrani * sure) / 36000;

                    System.out.println("Ödenecek Faiz Tutarı " + odenecekFaiz);

                    System.out.println("Hesaplama Bitmiştir.");
                    devamEdilsinMi=true;

                } else if (input == d){
                    System.out.println("Başarılı bir şekilde çıkış yaptınız...");
                    devamEdilsinMi = false;
                    break;

                }
                System.out.println("Lütfen seçim yapınız");
                devamEdilsinMi=true;
            }while(devamEdilsinMi);
        } catch (Exception e){
            System.out.println("Faiz Türünü Yalnızca 1,2 veya 3 olarak seçebilirsiniz. Tekrar Deneyiniz.");

        }

    }


}
