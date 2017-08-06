package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Mem;

import java.util.List;

/**
 * Created by Qbala on 2017-08-02.
 */
public interface MemDao {

List<Mem> showAll();
List<Mem> showFavourite();
Mem searchName(String name);



}
