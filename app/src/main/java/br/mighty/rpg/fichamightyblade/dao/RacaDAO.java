package br.mighty.rpg.fichamightyblade.dao;

import android.util.Log;

import java.util.List;

import br.mighty.rpg.fichamightyblade.model.Raca;

/**
 * Created by igor on 31/12/17.
 */

public class RacaDAO {
    public boolean save(Raca raca){
        try{
            if(raca.getId() == null){

                raca.save();
            }
            else {
                raca.update();
            }
            return true;

        }
        catch (Exception e){
            Log.e("ERROR","Raça não cadastrada");
            return false;
        }

    }

    public List<Raca> listAll(){
        return Raca.listAll(Raca.class);
    }

    public Raca findById(int id){
        try{

            Raca raca = Raca.findById(Raca.class,id);
            return raca;
        }
        catch (Exception e){
            return null;
        }
    }


}
