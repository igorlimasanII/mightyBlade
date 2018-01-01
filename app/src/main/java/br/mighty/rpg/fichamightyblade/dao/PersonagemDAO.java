package br.mighty.rpg.fichamightyblade.dao;

import android.util.Log;

import java.util.List;

import br.mighty.rpg.fichamightyblade.model.Personagem;

/**
 * Created by igor on 31/12/17.
 */

public class PersonagemDAO {

    public boolean save(Personagem personagem){
        try{
            if(personagem.getId() == null){

                personagem.save();
            }
            else {
                personagem.update();
            }
            return true;

        }
        catch (Exception e){
            Log.e("ERROR","Personagem não cadastrado");
            return false;
        }

    }

    public List<Personagem> listAll(){
        return Personagem.listAll(Personagem.class);
    }

    public Personagem findById(int id){
        try{

            Personagem personagem = Personagem.findById(Personagem.class,id);
            return personagem;
        }
        catch (Exception e){
            return null;
        }
    }
}
