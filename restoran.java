import java.util.Scanner;

public class restoran {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean status = true;
        int harga = 0;
        int total = 0;
        do{
            System.out.println("list harga \n 1. nasi ayam crispy keju 15000 \n 2.nasi ayam crispy teriyaki 15000 \n 3. nasi goreng vegetable 18000 \n 4. coffe latte 12500 \n 5. blackcurrant milkshake 10000 \n 6. milk mojito 12500");
            System.out.println("Mau beli apa?");
            int makanandanminuman = s.nextInt();

            switch (makanandanminuman) {
                case 1:
                harga = 15000;
                total += harga;
                break;
                
                case 2:
                harga = 15000;
                total += harga;
                break;
                
                case 3:
                harga = 18000;
                total += harga;
                break;
                
                case 4:
                harga = 12500;
                total += harga;
                break;
                
                case 5:
                harga = 10000;
                total += harga;
                break;
                
                case 6:
                harga = 12500;
                total += harga;
                break;

                default:
                harga = 0;
                break;
            }
            System.out.println("Ada tambahan? (ya/tidak)");
            String lagi = s.next();
            if(lagi.equalsIgnoreCase("tidak")){
                status = false;
            }
            System.out.println("total belanja: "+total);
        }while(status);
    }
}
