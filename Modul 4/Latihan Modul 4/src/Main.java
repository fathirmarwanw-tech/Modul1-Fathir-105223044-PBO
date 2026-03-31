class MesinKopi {
    int kopi; // gram
    int air;  // ml
    int susu; // ml

    // Soal 4
    MesinKopi() {
        this.kopi = 0;
        this.air = 0;
        this.susu = 0;
    }

    // Soal 2
    void isiUlangBahan(int kopi, int air, int susu) {
        this.kopi += kopi;
        this.air += air;
        this.susu += susu;

        System.out.println("Bahan berhasil diisi ulang.");
    }

    // Soal 3
    boolean cekKetersediaanCappuccino() {
        if (kopi >= 15 && air >= 50 && susu >= 100) {
            return true;
        } else {
            return false;
        }
    }

    void tampilkan() {
        System.out.println("Kopi: " + kopi + " gram");
        System.out.println("Air: " + air + " ml");
        System.out.println("Susu: " + susu + " ml");
    }
}

public class Main {
    public static void main(String[] args) {
        // Soal 1
        MesinKopi mesinLobby = new MesinKopi();

        mesinLobby.tampilkan();

        mesinLobby.isiUlangBahan(20, 100, 150);

        mesinLobby.tampilkan();

        System.out.println("Bisa buat cappuccino? " + mesinLobby.cekKetersediaanCappuccino());
    }
}