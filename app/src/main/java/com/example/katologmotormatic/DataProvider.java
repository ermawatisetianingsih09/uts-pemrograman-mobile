package com.example.katologmotormatic;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.katologmotormatic.model.Honda;
import com.example.katologmotormatic.model.Suzuki;
import com.example.katologmotormatic.model.Motor;
import com.example.katologmotormatic.model.Yamaha;


public class DataProvider {
    private static List<Motor>motors= new ArrayList<>();

    private static List<Honda> initDataHonda(Context ctx) {
        List<Honda> hondas = new ArrayList<>();
        hondas.add(new Honda("BEAT", "2008",
                "Honda Beat adalah skuter otomatis produksi dari Astra Honda Motor di Indonesia. Skuter yang diluncurkan pada tahun 2008 ini dimaksudkan untuk mengantisipasi makin populernya skuter otomatis di pasar sepeda motor Indonesia", R.drawable.honda_beat_street));
        hondas.add(new Honda("ADV150", "2019",
                "Dimensi ADV 150 memiliki panjang 1.950 mm, lebar 763 mm dan panjang 1.153 mm. Jarak sumbu roda 1324 mm, tinggi jok 795 mm dan jarak terendah dari tanah ground clereance 165 mm.Berat kosong 132 kg", R.drawable.honda_adv));
        hondas.add(new Honda("SCOOPY", "2010",
                "Honda Scoopy adalah salah satu merk pedagang sepeda motor Honda di Indonesia skuter matik ini yang di produksi oleh PT Astra Honda Motor. Sepeda motor ini diluncurkan pada tanggal 20 Mei 2010 yang dimaksudkan untuk mengantisipasi makin populernya ", R.drawable.honda_scoopy));
        hondas.add(new Honda("PCX150", "2010",
                "Honda PCX .150 adalah motor keluaran Honda yang ditujukan bagi segmen motor premium skutik. ... Selain berteknologi injeksi atau lebih dikenal dengan istilah PGM-Fi, skuter matic PCX 150 ini juga memiliki alarm anti maling", R.drawable.honda_pcx));
        hondas.add(new Honda("VARIO", "2006",
                "sebuah skuter bertransmisi otomatis yang diproduksi oleh Astra Honda Motor di Indonesia sejak tahun 2006. Skuter ini dimaksudkan untuk mengantisipasi makin banyaknya populasi skuter otomatis yang beredar di pasar sepeda motor", R.drawable.honda_vario));
        return hondas;
    }

    private static List<Suzuki> initDataSuzuki(Context ctx) {
        List<Suzuki> suzukis = new ArrayList<>();
        suzukis.add(new Suzuki(" SUZUKI ADRESS F1", "Inggris",
                " Suzuki Adress FI hadir dengan membawakan mesin bertipe 4-stroke, 1 cylinder, air-cooled, SOHC. Mesin tersebut memiliki kapasitas 113cc dengan ratio kompresi sebesar 9.4:1", R.drawable.suzuki_address_f1));
        suzukis.add(new Suzuki("SUZUKI ADRESS PLAYFULL", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Suzuki Adress Playfull memiliki mesin dengan tipe yang sama yakni 4-stroke, 1 cylinder, air-cooled, SOHC. Mesin tersebut memiliki diamter x langkah sebesar 51,0 mm x 55,2 mm  ", R.drawable.suzuki_addressplayfull));
        suzukis.add(new Suzuki("SUZUKI BEUGMAN 200", "2002",
                " Suzuzki Burgman 200 hadir dengan membawakan mesin bertipe 4-stroke, 1 cylinder, liquid-cooled, DOHC dengan kapasitas mesin 200cc. Dengan didukung tipe mesin seperti tersebut", R.drawable.suzuki_brugman200));
        suzukis.add(new Suzuki("SUZUKI BRUGMAN 650", "Rusia",
                "Suzuki Brugman 650 hadir dengan membawakan mesin bertipe 4-stroke, liquid-cooled, 2-cylinder, DOHC. Mesin tersebut mampu menghasilkan tenaga yang sangat power full, karena sudah dipersenjatai dengan mesin berkapasitas 638cc.", R.drawable.suzuki_burgman_650_abs));
        suzukis.add(new Suzuki("SUZUKI NEX", "2020",
                "Suzuki NEX II hadir dengan membawakan mesin bertipe 4-stroke, 1 silinder, pendingin udara, SOHC, 2 Valve dengan kapasitas mesin sebesar 113cc", R.drawable.suzuki_nex));
        return suzukis;
    }
    private static List<Yamaha> initDataYamaha(Context ctx) {
        List<Yamaha> yamahas = new ArrayList<>();
        yamahas.add(new Yamaha("Fino Classic", "2018",
                "Motor ini memang memiliki panjang skitar 65.6 in dengan lebar motor hingga 24.8 in untuk tinggi motor Yamaha Vino classic ini mencapai 39.6 in. Jadi selain mudah untuk dikendarai.", R.drawable.yamaha_fino));
        yamahas.add(new Yamaha("Lexi", "2020 ",
                " Memiliki tampilan berkelas ditunjang desain lampu Grand LED Headlight sehingga lebih terang, ditambah eye line biru yang menawan memperkuat kesan mewah dan elegan. ", R.drawable.yamaha_lexi));
        yamahas.add(new Yamaha("Mio", "2013",
                "Kapasitas Mesin Silinder sebesar 113.7 cc dan telah menggunakan Tipe Mesin 4 Langkah, 2 Valve SOHC, Berpendingin Kipas dan telah dibekali oleh Diameter x Langkah sebesar 50 mm x 57,9 mm", R.drawable.yamaha_mio));
        yamahas.add(new Yamaha("NMAX 155", "2017",
                "Tipe mesin Liquid  Cooled 4 Stroke,SOHC kapasitas 155 cc dengan silinder tunggal beriameter 58.0 mm x 58.7 mm", R.drawable.yamaha_nmax));
        yamahas.add(new Yamaha("X-Ride", "2020",
                "Tipe mesin  4 langkah,2 Valve,Beprpendingin kipas dengan volume silinder 133,7 cc diameter x langkah 50.0 mm 57,9 mm", R.drawable.yamaha_xride));
        return yamahas;

    }

    private static void initAllMotors(Context ctx) {
        motors.addAll(initDataHonda(ctx));
        motors.addAll(initDataSuzuki(ctx));
        motors.addAll(initDataYamaha(ctx));

    }

    public static List<Motor> getAllMotor(Context ctx) {
        if (motors.size() == 0) {
            initAllMotors(ctx);
        }
        return  motors;
    }

    public static List<Motor> getMotorsByTipe(Context ctx, String merek) {
        List<Motor> motorsByType = new ArrayList<>();
        if (motors.size() == 0) {
            initAllMotors(ctx);
        }
        for (Motor h : motors) {
            if (h.getMerek().equals(merek)) {
                motorsByType.add(h);
            }
        }
        return motorsByType;
    }

}

