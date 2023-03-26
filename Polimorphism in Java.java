package source;

import java.util.Scanner;

/* misalkan harga vga: 200 ribu */
/* class pembelian untuk pembayaran secara cash */
class Pembelian {
    private int jumlah; //  jumlah pembelian
    
    public Pembelian(int newJumlah) {
        this.jumlah = newJumlah;
    }
    
    public int getJumlah() {return this.jumlah;}
    
    @SuppressWarnings("override")
    public String toString() {
        return "Anda memperoleh diskon sebesar 0 persen";
    }
    
    public void getTotal() {
        System.out.println(toString());
        System.out.println("Total biaya: " + (getJumlah() * 200000));
    }
}

class PembayaranOvo extends Pembelian {
    public PembayaranOvo(int newJumlah) {
        super(newJumlah);
    }
    
    @SuppressWarnings("override")
    public String toString() {
        return "Anda memperoleh diskon sebesar 30 persen";
    }
    
    @SuppressWarnings("override")
    public void getTotal() {
        System.out.println(toString());
        System.out.println("Total biaya: " + (getJumlah() * 200000 - (getJumlah() * 200000 * 30/100)));
    }
}

class PembayaranDana extends Pembelian {
    public PembayaranDana(int newJumlah) {
        super(newJumlah);
    }
    
    @SuppressWarnings("override")
    public String toString() {
        return "Anda memperoleh diskon sebesar 25 persen";
    }
    
    @SuppressWarnings("override")
    public void getTotal() {
        System.out.println(toString());
        System.out.println("Total biaya: " + (getJumlah() * 200000 - (getJumlah() * 200000 * 25/100)));
    }
}

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Pembelian: ");
        int jumlah = input.nextInt();
        
        System.out.println("Pilih Metode Pembayaran: ");
        System.out.println("1. Cash");
        System.out.println("2. OVO");
        System.out.println("3. Dana");
        System.out.println("4. Exit");
        System.out.println("Input: ");
        int index = input.nextInt();
        
        switch(index) {
            case 1 :
                Pembelian cash = new Pembelian(jumlah);
                cash.getTotal();
                break;
            case 2 :
                Pembelian ovo = new PembayaranOvo(jumlah);
                ovo.getTotal();
                break;
            case 3 :
                Pembelian dana = new PembayaranDana(jumlah);
                dana.getTotal();
                break;
            default :
                System.exit(0);
                break;
        }
    }
}
