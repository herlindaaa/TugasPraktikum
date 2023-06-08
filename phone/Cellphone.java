package phone;

import java.util.ArrayList;
import java.util.List;

public class Cellphone implements Phone{
    String merk;
    String type;
    int batteryLevel;
    int status;
    int volume;
    int pulsa;
    List<Contact> contacts;

    public Cellphone(String merk, String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);
        this.pulsa = 0;
        this.contacts = new ArrayList<Contact>();
    }

    public void powerOn()
    {
        this.status = 1;
        System.out.println("Ponsel menyala");
    }

    public void powerOff()
    {
        this.status = 0;
        System.out.println("Ponsel mati");
    }

    public void volumeUp()
    {
        if(this.status == 0)
        {
            System.out.println("Ponsel mati. Tidak dapat menaikan volume");
        }
        else
        {
            this.volume++;
            if(this.volume >= MAX_VOLUME)
            {
                this.volume = MAX_VOLUME;
            }
        }
    }

    public void volumeDown()
    {
        if(this.status == 0)
        {
            System.out.println("Ponsel mati. Tidak dapat menurunkan volume");
        }
        else
        {
            this.volume--;
            if(this.volume <= MIN_VOLUME)
            {
                this.volume = MIN_VOLUME;
            }
        }
    }

    public int getVolume()
    {
        return this.volume;
    }

    public void topUpPulsa(int amount)
    {
        if(this.status == 0)
        {
            System.out.println("Ponsel mati. Tidak dapat melakukan top up pulsa");
        }
        else
        {
            this.pulsa += amount;
            System.out.println("Top up pulsa berhasil. Jumlah pulsa saat ini: "+this.pulsa);
        }
    }

    public int getPulsa()
    {
        return this.pulsa;
    }

    public int getSisaPulsa()
    {
        return this.pulsa;
    }

    public void lihatSisaPulsa()
    {
        if(this.status == 0)
        {
            System.out.println("Ponsel mati. Tidak dapat melihat sisa pulsa");
        }
        else
        {
            System.out.println("Sisa pulsa saat ini: "+this.pulsa);
        }
    }

    public void tambahKontak(String nama, String nomor)
    {
        Contact newContact = new Contact(nama, nomor);
        contacts.add(newContact);
        System.out.println("Kontak "+nama+" berhasil ditambahkan");
    }

    public void lihatKontak()
    {
        if(this.status == 0)
        {
            System.out.println("Ponsel mati. Tidak Dapat melihat daftar kontak");
        }
        else
        {
            System.out.println("Daftar Kontak:");
            for(Contact contact : contacts)
            {
                System.out.println("Nama: "+contact.getNama()+", Nomor: "+contact.getNomor());
            }
        }
    }

    public void cariKontak(String nama)
    {
        if(this.status == 0)
        {
            System.out.println("Ponsel mati. Tidak dapat mencari kontak");
        }
        else
        {
            boolean found = false;
            for(Contact contact : contacts)
            {
                if(contact.getNama().equalsIgnoreCase(nama))
                {
                    System.out.println("Kontak ditemukan:");
                    System.out.println("Nama: "+contact.getNama()+", Nomor: "+contact.getNomor());
                    found = true;
                }
            }
            if(!found)
            {
                System.out.println("Kontak dengan nama "+nama+" tidak ditemukan.");
            }
        }
    }
}
