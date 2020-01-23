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
public class pokemon {
    
  private  int pokemonID;
  private   String pokemonName;
  private  String Tip;
    public pokemon(){
        
    }
     public pokemon(String pokemonName,String Tip ){
         
        this.pokemonName = pokemonName;
        this.Tip = Tip;

    }
     public int hasarPuaniGoster(){
         return 0 ;
     }


    public void setPokemonID(int pokemonID) {
        this.pokemonID = pokemonID;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public void setTip(String Tip) {
        this.Tip = Tip;
    }


    public int getPokemonID() {
        return pokemonID;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public String getTip() {
        return Tip;
    }
    
}
