/*
 * Ad Soyad: Yiğit Alper Ayhan
 * Ogrenci No: 250542014
 * Tarih: 11.11.2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormulAsistani {

    // Sabit tanımlama
    final static double GRAVITY = 9.8;

    // --- 8 METOT ---

    // 1. Hız (v = s / t)
    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    // 2. İvme (a = Δv / t)
    public static double calculateAcceleration(double deltaV, double time) {
        return deltaV / time;
    }

    // 3. Kuvvet (F = m × a)
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // 4. İş (W = F × d)
    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    // 5. Güç (P = W / t)
    public static double calculatePower(double work, double time) {
        return work / time;
    }

    // 6. Kinetik Enerji (KE = 0.5 × m × v^2)
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    // 7. Potansiyel Enerji (PE = m × g × h)
    public static double calculatePotentialEnergy(double mass, double height) {
        return mass * GRAVITY * height;
    }

    // 8. Momentum (p = m × v)
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }

    // --- ANA METOT ---
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe (m): ");
        double s = input.nextDouble();
        System.out.print("Zaman (s): ");
        double t = input.nextDouble();

        double hiz = calculateVelocity(s, t);
        System.out.printf("Hız: %.2f m/s\n", hiz);

        System.out.print("Hız değişimi (Δv): ");
        double deltaV = input.nextDouble();
        double ivme = calculateAcceleration(deltaV, t);
        System.out.printf("İvme: %.2f m/s²\n", ivme);

        System.out.print("Kütle (kg): ");
        double m = input.nextDouble();
        double kuvvet = calculateForce(m, ivme);
        System.out.printf("Kuvvet: %.2f N\n", kuvvet);

        System.out.print("Kuvvetin uygulandığı mesafe (m): ");
        double d = input.nextDouble();
        double is = calculateWork(kuvvet, d);
        System.out.printf("İş: %.2f J\n", is);

        double guc = calculatePower(is, t);
        System.out.printf("Güç: %.2f W\n", guc);

        double ke = calculateKineticEnergy(m, hiz);
        System.out.printf("Kinetik Enerji: %.2f J\n", ke);

        System.out.print("Yükseklik (m): ");
        double h = input.nextDouble();
        double pe = calculatePotentialEnergy(m, h);
        System.out.printf("Potansiyel Enerji: %.2f J\n", pe);

        double momentum = calculateMomentum(m, hiz);
        System.out.printf("Momentum: %.2f kg·m/s\n", momentum);

        input.close();
    }
}
