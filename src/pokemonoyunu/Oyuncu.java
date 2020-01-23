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
public abstract class  Oyuncu {
    int oyuncuID;
    String oyuncuAdi;
    int skor;
    int [] kartListesi=new int[5];
    public Oyuncu(){
        
    }
    
      public Oyuncu( int oyuncuID,String oyuncuAdi,int  skor){
          this.oyuncuAdi=oyuncuAdi;
          this.oyuncuID=oyuncuID;
          this.skor=skor;

          
        
    }
    public void SkorGoster (){
    
    }
    public void kartSecim(){
        
        
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }
    
}
