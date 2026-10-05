import java.util.Scanner;
public class day3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== SOAL 10: TAGIHAN LISTRIK PLN ===");
        System.out.print("Pilih Daya (1=900 VA, 2=1300 VA): ");
        int daya = input.nextInt();
        System.out.print("Subsidi? (1=Ya, 2=Tidak): ");
        int sub = input.nextInt();
        System.out.print("Pemakaian (kWh): ");
        double kwh = input.nextDouble();

        double tagihan = 0;
        String ketDaya;

        if (daya == 1) {
            if (sub == 1) {
                ketDaya = "900 VA (Subsidi)";
                tagihan = kwh * 605;
            } else {
                ketDaya = "900 VA (Non-Subsidi)";
                if (kwh <= 100) {
                    tagihan = kwh * 1352;
                } else {
                    tagihan = (100 * 1352) + ((kwh - 100) * 1444);
                }
            }
        } else {
            ketDaya = "1300 VA";
            tagihan = kwh * 1444.70;
            if (kwh > 300) {
                tagihan += tagihan * 0.10; // Tambahan biaya beban puncak 10%
            }
        }

        System.out.println("\n--- RINCIAN TAGIHAN PLN ---");
        System.out.println("Daya Listrik  : " + ketDaya);
        System.out.println("Pemakaian     : " + kwh + " kWh");
        System.out.println("Total Tagihan : Rp " + tagihan);

        input.close();
    }
}


