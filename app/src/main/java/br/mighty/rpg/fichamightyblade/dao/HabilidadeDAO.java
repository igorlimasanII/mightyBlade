package br.mighty.rpg.fichamightyblade.dao;

import android.util.Log;

import java.util.List;

import br.mighty.rpg.fichamightyblade.model.Habilidade;

/**
 * Created by igor on 31/12/17.
 */

public class HabilidadeDAO {
    public boolean save(Habilidade habilidade){
        try{
            if(habilidade.getId() == null){

                habilidade.save();
            }
            else {
                habilidade.update();
            }
            return true;

        }
        catch (Exception e){
            Log.e("ERROR","Habilidade não cadastrada");
            return false;
        }

    }

    public List<Habilidade> listAll(){
        return Habilidade.listAll(Habilidade.class);
    }

    public Habilidade findById(int id){
        try{

            Habilidade habilidade = Habilidade.findById(Habilidade.class,id);
            return habilidade;
        }
        catch (Exception e){
            return null;
        }
    }
}
