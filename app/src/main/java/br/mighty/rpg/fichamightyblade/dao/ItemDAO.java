package br.mighty.rpg.fichamightyblade.dao;

import android.util.Log;

import java.util.List;

import br.mighty.rpg.fichamightyblade.model.Item;

/**
 * Created by igor on 31/12/17.
 */

public class ItemDAO {
    public boolean save(Item item){
        try{
            if(item.getId() == null){

                item.save();
            }
            else {
                item.update();
            }
            return true;

        }
        catch (Exception e){
            Log.e("ERROR","Item não cadastrada");
            return false;
        }

    }

    public List<Item> listAll(){
        return Item.listAll(Item.class);
    }

    public Item findById(int id){
        try{

            Item item = Item.findById(Item.class,id);
            return item;
        }
        catch (Exception e){
            return null;
        }
    }
}
