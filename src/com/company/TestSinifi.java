// TODO: Use card lists from within kullanici and bilgisayar classes
// TODO: Remove arraylist parameters from oyuncu classes
package com.company;

import java.util.ArrayList;
import java.util.Random;

public class TestSinifi {
    private Futbolcu[] futbolcular;
    private Basketbolcu[] basketbolcular;
    private ArrayList<Sporcu> kartlar1; // Bilgisayar kartlari
    private ArrayList<Sporcu> kartlar2; // Kullanici kartlari
    private final Random random = new Random();
    private int len;

    TestSinifi() {

    }

    TestSinifi(Futbolcu[] futbolcular, Basketbolcu[] basketbolcular) {
        this.futbolcular = futbolcular;
        this.basketbolcular = basketbolcular;
        kartlariKontrolEt();
    }

    private void kartlariKaristir() {
        // Richard Durstenfeld dizi karistirma algoritmasi
        int j;
        Basketbolcu tempBasketbolcu;
        for (int i = basketbolcular.length - 1; i > 0; i--) {
            j = random.nextInt(i);
            tempBasketbolcu = basketbolcular[i];
            basketbolcular[i] = basketbolcular[j];
            basketbolcular[j] = tempBasketbolcu;
        }
        Futbolcu tempFutbolcu;
        for (int i = futbolcular.length - 1; i > 0; i--) {
            j = random.nextInt(i);
            tempFutbolcu = futbolcular[i];
            futbolcular[i] = futbolcular[j];
            futbolcular[j] = tempFutbolcu;
        }
    }

    private void sporculariTanimla() {
        Futbolcu LionelMessi = new Futbolcu("LionelMessi", "Barcelona", 96, 90, 95);
        Futbolcu CristianoRonalo = new Futbolcu("CristianoRonalo", "Juventus", 97, 92, 94);
        Futbolcu TonyKross = new Futbolcu("TonyKross", "RealMadrid", 90, 87, 89);
        Futbolcu MohammedSalah = new Futbolcu("MohammedSalah", "Liverpool", 93, 89, 93);
        Futbolcu RobertLewandowski = new Futbolcu("RobertLewandowski", "BayernMunih", 93, 86, 96);
        Futbolcu MarcoReus = new Futbolcu("MarcoReus", "BorussiaDortmund", 91, 90, 89);
        Futbolcu NeymarJR = new Futbolcu("NeymarJR", "ParisSaintGermain", 95, 95, 94);
        Futbolcu KarimBenzema = new Futbolcu("KarimBenzema", "RealMadrid", 89, 87, 93);
        Basketbolcu KobeBryant = new Basketbolcu("KobeBryant", "Lakers", 99, 99, 99);
        Basketbolcu LebronJames = new Basketbolcu("LebronJames", "Lakers", 97, 93, 95);
        Basketbolcu MichaelJordan = new Basketbolcu("MichaelJordan", "Bulls", 96, 96, 96);
        Basketbolcu StephCurry = new Basketbolcu("StephCurry", "GoldenState", 95, 97, 95);
        Basketbolcu ShaquilleONeal = new Basketbolcu("ShaquilleONeal", "Lakers", 92, 93, 91);
        Basketbolcu ShaneLarkin = new Basketbolcu("ShaneLarkin", "AnadoluEfes", 94, 95, 96);
        Basketbolcu ScottiePippen = new Basketbolcu("ScottiePippen", "Bulls", 93, 91, 90);
        Basketbolcu JamesHarden = new Basketbolcu("JamesHarden", "Houston", 94, 91, 93);
        futbolcular = new Futbolcu[]{LionelMessi, CristianoRonalo, TonyKross, MohammedSalah, RobertLewandowski, MarcoReus, NeymarJR, KarimBenzema};
        basketbolcular = new Basketbolcu[]{KobeBryant, LebronJames, MichaelJordan, StephCurry, ShaquilleONeal, ShaneLarkin, ScottiePippen, JamesHarden};
        kartlariKontrolEt();
    }

    private void kartlariKontrolEt() {
        if (basketbolcular.length == futbolcular.length)
            len = basketbolcular.length;
        else {
            System.out.println("kart sayisi ayni degil. Lutfen oyunu tekrardan baslatin.");
            System.exit(1);
        }
    }

    private void kartlariDagit() {
        kartlariKaristir();
        for (int i = 0; i < len; i += 2) {
            kartlar1.add(futbolcular[i]);
            kartlar1.add(basketbolcular[i]);
            kartlar2.add(futbolcular[i + 1]);
            kartlar2.add(basketbolcular[i + 1]);
        }
    }

    public int oyunuBaslat() {
        sporculariTanimla();
        kartlariDagit();
        return 0;
    }

    private Sporcu kartiSec() {
        return null;
    }

    void kartTipiniDegistir() {
    }
}
