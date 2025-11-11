/*
 * Ad Soyad: Yiğit Alper Ayhan
 * Ogrenci No: 250542014
 * Tarih: 11.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {

    // --- KARE ---
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    // --- DİKDÖRTGEN ---
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    // --- DAİRE ---
    public static double calculateCircleArea(double r) {
        return Math.PI * r * r;
    }

    public static double calculateCircleCircumference(double r) {
        return 2 * Math.PI * r;
    }

    // --- ÜÇGEN ---
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    // --- ANA METOT ---
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kare
        System.out.print("Kare kenarı: ");
        double kareKenar = input.nextDouble();
        double kareAlan = calculateSquareArea(kareKenar);
        double kareCevre = calculateSquarePerimeter(kareKenar);
        System.out.printf("Kare Alanı: %.2f\n", kareAlan);
        System.out.printf("Kare Çevresi: %.2f\n\n", kareCevre);

        // Dikdörtgen
        System.out.print("Dikdörtgen genişliği: ");
        double genislik = input.nextDouble();
        System.out.print("Dikdörtgen yüksekliği: ");
        double yukseklik = input.nextDouble();
        double dikAlan = calculateRectangleArea(genislik, yukseklik);
        double dikCevre = calculateRectanglePerimeter(genislik, yukseklik);
        System.out.printf("Dikdörtgen Alanı: %.2f\n", dikAlan);
        System.out.printf("Dikdörtgen Çevresi: %.2f\n\n", dikCevre);

        // Daire
        System.out.print("Daire yarıçapı: ");
        double r = input.nextDouble();
        double daireAlan = calculateCircleArea(r);
        double daireCevre = calculateCircleCircumference(r);
        System.out.printf("Daire Alanı: %.2f\n", daireAlan);
        System.out.printf("Daire Çevresi: %.2f\n\n", daireCevre);

        // Üçgen
        System.out.print("Üçgen tabanı: ");
        double taban = input.nextDouble();
        System.out.print("Üçgen yüksekliği: ");
        double yukseklikU = input.nextDouble();
        System.out.print("1. kenar: ");
        double a = input.nextDouble();
        System.out.print("2. kenar: ");
        double b = input.nextDouble();
        System.out.print("3. kenar: ");
        double c = input.nextDouble();
        double ucgenAlan = calculateTriangleArea(taban, yukseklikU);
        double ucgenCevre = calculateTrianglePerimeter(a, b, c);
        System.out.printf("Üçgen Alanı: %.2f\n", ucgenAlan);
        System.out.printf("Üçgen Çevresi: %.2f\n", ucgenCevre);

        input.close();
    }
}
