package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Mem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Qbala on 2017-08-02.
 */
public class MemDaoImpl implements MemDao {


    static List<Mem> mems = new ArrayList<>();

    static {
        mems.add(new Mem("Pierwszy gif", "gifs\\ben-and-mike.gif"));

    }

    @Override
    public List<Mem> showAll() {
        return mems;
    }



    @Override
    public List<Mem> showFavourite() {
        return null;
    }
}
