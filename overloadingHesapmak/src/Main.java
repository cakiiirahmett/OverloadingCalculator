import java.util.Scanner;

public class Main {

    public static int toplama(int a,int b, int c){
        return (a+b+c);
    }
    public static int toplama(int a,int b){
        return (a+b);
    }
    public static int çıkarma(int a,int b,int c){
        return (a-b-c);
    }
    public static int çıkarma(int a,int b){
        return (a-b);
    }
    public static int çarpma(int a,int b){
        return (a*b);
    }
    public static int çarpma(int a,int b,int c){
        return (a*b*c);
    }
    public static double bölme(int a,int b){
        return ((double) a/b);
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("--------------------------------");
        String islemler="1.İşlem : Toplama İşlemi\n" +
                "2.İşlem : Çıkarma İşlemi\n" +
                "3.İşlem : Çarpma İşlemi\n" +
                "4.İşlem : Bölme İşlemi\n" +
                "İşlemden çıkmak için q'ya basınız.";
        System.out.println(islemler);
        System.out.println("--------------------------------");

        while (true){

            System.out.print("İşlem Seçiniz : ");
            String islem=scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("İşlemden Çıkış Yapılıyor....");
                break;
            }
            else if (islem.equals("1")){
                System.out.print("Kaç Sayılı İşlem Yapıcaksınız 2 ya da 3 :");
                int kacsayi=scanner.nextInt();
                scanner.nextLine();

               if (kacsayi==2){
                   System.out.print("1.Sayi : ");
                   int a=scanner.nextInt();
                   System.out.print("2.Sayi : ");
                   int b=scanner.nextInt();
                   scanner.nextLine();
                   System.out.println("Toplam = "+toplama(a,b));
               }else if (kacsayi==3){
                   System.out.print("1.Sayi : ");
                   int a=scanner.nextInt();
                   System.out.print("2.Sayi : ");
                   int b=scanner.nextInt();
                   System.out.print("3.Sayi : ");
                   int c=scanner.nextInt();
                   scanner.nextLine();
                   System.out.println("Toplam = "+toplama(a,b,c));
               }else {
                   System.out.println("Bu Methoda ait bir işlem yoktur...");
               }

            }
            else if (islem.equals("2")){
                System.out.print("Kaç Sayılı İşlem Yapıcaksınız 2 ya da 3 :");
                int kacsayi=scanner.nextInt();
                scanner.nextLine();

                if (kacsayi==2){
                    System.out.print("1.Sayi : ");
                    int a=scanner.nextInt();
                    System.out.print("2.Sayi : ");
                    int b=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Çıkarma = "+çıkarma(a,b));
                }
                else if (kacsayi==3){
                    System.out.print("1.Sayi : ");
                    int a=scanner.nextInt();
                    System.out.print("2.Sayi : ");
                    int b=scanner.nextInt();
                    System.out.print("3.Sayi : ");
                    int c=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Çıkarma = "+çıkarma(a,b,c));
                }else {
                    System.out.println("Bu Methoda ait bir işlem yoktur...");
                }
            }
            else if (islem.equals("3")){
                System.out.print("Kaç Sayılı İşlem Yapıcaksınız 2 ya da 3 :");
                int kacsayi=scanner.nextInt();
                scanner.nextLine();

                if (kacsayi==2){
                    System.out.print("1.Sayi : ");
                    int a=scanner.nextInt();
                    System.out.print("2.Sayi : ");
                    int b=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Çarpma = "+çarpma(a,b));
                }else if (kacsayi==3){
                    System.out.print("1.Sayi : ");
                    int a=scanner.nextInt();
                    System.out.print("2.Sayi : ");
                    int b=scanner.nextInt();
                    System.out.print("3.Sayi : ");
                    int c=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Çarpma = "+çarpma(a,b,c));
                }
                else {
                    System.out.println("Bu Methoda ait bir işlem yoktur...");
                }
            }
            else if (islem.equals("4")){
                System.out.print("1.Sayi : ");
                int a=scanner.nextInt();
                System.out.print("2.Sayi : ");
                int b=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Bölme = "+bölme(a,b));
            }
            else {
                System.out.println("Yanlış Tuşlama Yaptınız Tekrar Deneyiniz...");
            }



        }

    }
}
