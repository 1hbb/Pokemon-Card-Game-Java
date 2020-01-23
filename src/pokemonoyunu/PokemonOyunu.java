/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonoyunu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mustafa
 */
public class PokemonOyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int secim = 0;
        System.out.println("SİZ Mİ OYNUCAKSINIZ  1");
        System.out.println("BİLGİSAYARLAR MI OYNASIN 2");

        Pikachu pikachu = new Pikachu();
        pikachu.setPokemonID(1);
        pikachu.setPokemonName("pikachu");
        pikachu.setTip("Elektrik");
        pikachu.hasarPuani = 40;
        Bulbasaur bulbasaur = new Bulbasaur();
        bulbasaur.setPokemonID(2);
        bulbasaur.setPokemonName("Bulbasaur");
        bulbasaur.setTip("Çim");
        bulbasaur.hasarPuani = 50;
        Charmander charmander = new Charmander();
        charmander.setPokemonID(3);
        charmander.setPokemonName("charmander");
        charmander.setTip("Ateş");
        charmander.hasarPuani = 60;
        Squirtle squirtle = new Squirtle();
        squirtle.setPokemonID(4);
        squirtle.setPokemonName("squirtle");
        squirtle.setTip("Su");
        squirtle.hasarPuani = 30;
        Zubat zubat = new Zubat();
        zubat.setPokemonID(5);
        zubat.setPokemonName("zubat");
        zubat.setTip("Hava");
        zubat.hasarPuani = 50;
        Psyduck psyduck = new Psyduck();
        psyduck.setPokemonID(6);
        psyduck.setPokemonName("psyduck");
        psyduck.setTip("Su");
        psyduck.hasarPuani = 20;
        Snorlax snorlax = new Snorlax();
        snorlax.setPokemonID(7);
        snorlax.setPokemonName("snorlax");
        snorlax.setTip("Normal");
        snorlax.hasarPuani = 30;
        Butterfree butterfree = new Butterfree();
        butterfree.setPokemonID(8);
        butterfree.setPokemonName("butterfree");
        butterfree.setTip("Hava");
        butterfree.hasarPuani = 100;
        Jigglypuff jigglypuff = new Jigglypuff();
        jigglypuff.setPokemonID(9);
        jigglypuff.setPokemonName("jigglypuff");
        jigglypuff.setTip("Ses");
        pikachu.hasarPuani = 70;
        Meowth meowth = new Meowth();
        meowth.setPokemonID(10);
        meowth.setPokemonName("meowth");
        meowth.setTip("Normal");
        meowth.hasarPuani = 40;

        /*System.out.println(pikachu.getPokemonName());
         System.out.println(pikachu.getTip());
         System.out.println(pikachu.getPokemonID());
         System.out.println(pikachu.hasarPuani);
         */
     
        Random rnd = new Random();

        int RastgeleSayi;
        RastgeleSayi = (int) (Math.random()* 10)+1;
        int[] sayilar = new int[10];
        sayilar[0] = RastgeleSayi;
        for (int i = 1; i < sayilar.length; i++) {
            RastgeleSayi = (int) (Math.random()* 10)+1;
            for (int j = 0; j < i; j++  )
{
if (sayilar[j] == RastgeleSayi) {
                    i--;
                    break;
                } else {
                    sayilar[i] = RastgeleSayi;
                }
            }
        }
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);            
        }
        Scanner input = new Scanner(System.in);
        secim = input.nextInt();

        if (secim == 1) {
           // BilgisayarOyuncusu pcoyuncusu=

        }

    }

}
