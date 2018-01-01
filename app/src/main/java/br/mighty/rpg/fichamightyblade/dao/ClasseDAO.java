package br.mighty.rpg.fichamightyblade.dao;

import android.util.Log;

import java.util.List;

import br.mighty.rpg.fichamightyblade.model.Classe;

/**
 * Created by igor on 31/12/17.
 */

public class ClasseDAO {
    public boolean save(Classe classe){
        try{
            if(classe.getId() == null){

                classe.save();
            }
            else {
                classe.update();
            }
            return true;

        }
        catch (Exception e){
            Log.e("ERROR","Classe não cadastrada");
            return false;
        }

    }

    public List<Classe> listAll(){
        return Classe.listAll(Classe.class);
    }

    public Classe findById(int id){
        try{

            Classe classe = Classe.findById(Classe.class,id);
            return classe;
        }
        catch (Exception e){
            return null;
        }
    }
}
