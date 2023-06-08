package phone;

public class CellphoneMain {
    public static void main(String[] args)
    {
        Cellphone cp = new Cellphone("Nokia", "3310");
        cp.powerOn();
        cp.tambahKontak("Chris", "08123456789");
        cp.tambahKontak("Jeno", "08987654321");
        cp.lihatKontak();
        cp.cariKontak("Jeno");
        cp.cariKontak("Zayn");
        cp.topUpPulsa(5000);
        cp.lihatSisaPulsa();
        cp.volumeUp();
        cp.powerOff();
        cp.cariKontak("Jeno");
        cp.lihatKontak();
        cp.topUpPulsa(10000);
        cp.lihatSisaPulsa();
        cp.volumeUp();
    }
}
