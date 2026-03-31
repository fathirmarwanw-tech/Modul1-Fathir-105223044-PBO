class Pelanggan {
    String nama;
    String noHP;
    int saldo;

    Pelanggan(String nama, String noHP) {
        this.nama = nama;
        this.noHP = noHP;
        this.saldo = 0;
    }

    void isiSaldo(int jumlah) {
        if (jumlah < 10000) {
            System.out.println("Setoran ditolak! Minimal Rp 10.000");
        } else {
            saldo += jumlah;
            System.out.println("Isi saldo berhasil: Rp " + jumlah);
        }
    }

    void bayarTagihan(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Pembayaran berhasil: Rp " + jumlah);
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup");
        }
    }

    void tampilSaldo() {
        System.out.println("Saldo sekarang: Rp " + saldo);
    }
}

public class Main {
    public static void main(String[] args) {

        Pelanggan anton = new Pelanggan("Anton", "081234567");

        anton.isiSaldo(50000);

        anton.bayarTagihan(60000);

        anton.isiSaldo(20000);

        anton.bayarTagihan(60000);

        anton.tampilSaldo();
    }
}