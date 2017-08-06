package pl.akademiakodu.memy.dao;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.memy.model.Mem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Qbala on 2017-08-02.
 */
public class MemDaoImpl implements MemDao {


    static List<Mem> mems = new ArrayList<>();

    static {
        mems.add(new Mem("android-explosion", true));
        mems.add(new Mem("ben-and-mike", false));
        mems.add(new Mem("book-dominos", false));
        mems.add(new Mem("compiler-bot", false));
        mems.add(new Mem("cowboy-coder", false));
        mems.add(new Mem("infinite-andrew", true));


    }

    @Override
    public List<Mem> showAll() {
        return mems;
    }


    @Override
    public List<Mem> showFavourite() {
        List<Mem> mems1 = new ArrayList<>();
        for (Mem a : mems) {

            if (a.getFavorite()) {

                if (a.getFavorite() == true) {

                    mems1.add(a);
                }
            }
        }
        return mems1;

    }


    @Override
    public Mem searchName(String name) {

        Mem mem1 = new Mem();

        for (Mem p : mems){
            if (p.getName() == name){
                mem1 = p;
            }
        }
        return mem1;
    }





}



