/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonoyunu;

/**
 *
 * @author Mustafa
 */
public class InsanOyuncusu extends Oyuncu{
    int[] kartListesi=new int[5];
    public InsanOyuncusu(){
        
    }

    InsanOyuncusu(int i, String mustafa_, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setKartListesi(int[] kartListesi) {
        this.kartListesi = kartListesi;
    }

    public int[] getKartListesi() {
        return kartListesi;
    }
    @Override
    public void kartSecim(){
        
    }
}
