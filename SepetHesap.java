/*
 * Ad Soyad: Yiğit Alper Ayhan
 * Ogrenci No: 250542014
 * Tarih: 13.11.2025
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesap {

    final static double VAT_RATE = 0.18;
    final static double SHIPPING_FEE = 29.99;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ürün bilgileri
        System.out.print("1. Ürün fiyatı: ");
        double fiyat1 = input.nextDouble();
        System.out.print("1. Ürün adedi: ");
        int adet1 = input.nextInt();

        System.out.print("2. Ürün fiyatı: ");
        double fiyat2 = input.nextDouble();
        System.out.print("2. Ürün adedi: ");
        int adet2 = input.nextInt();

        System.out.print("3. Ürün fiyatı: ");
        double fiyat3 = input.nextDouble();
        System.out.print("3. Ürün adedi: ");
        int adet3 = input.nextInt();

        System.out.print("İndirim oranı (%): ");
        double indirimOrani = input.nextDouble();

        // Hesaplamalar
        double toplam1 = calcProductTotal(fiyat1, adet1);
        double toplam2 = calcProductTotal(fiyat2, adet2);
        double toplam3 = calcProductTotal(fiyat3, adet3);

        double araToplam = calcSubtotal(toplam1, toplam2, toplam3);
        double indirimTutari = calcDiscount(araToplam, indirimOrani);
        double indirimliToplam = calcDiscountedTotal(araToplam, indirimTutari);
        double kdvTutari = calcVAT(indirimliToplam);
        double genelToplam = calcGrandTotal(indirimliToplam, kdvTutari);

        // Sonuç
        System.out.println("\n----- SEPET ÖZETİ -----");
        System.out.printf("Ara Toplam: %.2f TL%n", araToplam);
        System.out.printf("İndirim Tutarı: %.2f TL%n", indirimTutari);
        System.out.printf("İndirimli Toplam: %.2f TL%n", indirimliToplam);
        System.out.printf("KDV (%%18): %.2f TL%n", kdvTutari);
        System.out.printf("Kargo Ücreti: %.2f TL%n", SHIPPING_FEE);
        System.out.printf("Genel Toplam: %.2f TL%n", genelToplam);
    }

    public static double calcProductTotal(double price, int quantity) {
        return price * quantity;
    }

    public static double calcSubtotal(double t1, double t2, double t3) {
        return t1 + t2 + t3;
    }

    public static double calcDiscount(double subtotal, double discountRate) {
        return subtotal * (discountRate / 100);
    }

    public static double calcDiscountedTotal(double subtotal, double discount) {
        return subtotal - discount;
    }

    public static double calcVAT(double discountedTotal) {
        return discountedTotal * VAT_RATE;
    }

    public static double calcGrandTotal(double discountedTotal, double vat) {
        return discountedTotal + vat + SHIPPING_FEE;
    }
}
