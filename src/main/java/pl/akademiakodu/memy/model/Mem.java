package pl.akademiakodu.memy.model;

/**
 * Created by Qbala on 2017-08-02.
 */
public class Mem {

    String name;
    Boolean favorite;

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }



    public Mem(String name, Boolean isTrue) {
        this.name = name;
        this.favorite = isTrue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
