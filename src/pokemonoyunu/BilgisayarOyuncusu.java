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
public class BilgisayarOyuncusu extends Oyuncu {
    int [] kartListesi=new int[5];
    
    public BilgisayarOyuncusu(){
        
    }
       public BilgisayarOyuncusu( int oyuncuID,String oyuncuAdi,int skor){
           super(oyuncuID, oyuncuAdi, skor);
           
        
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
