package pl.akademiakodu.memy.model;

/**
 * Created by Qbala on 2017-08-02.
 */
public class Mem {

    String name;

    Boolean isFavourite;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFavourite() {
        return isFavourite;
    }

    public void setFavourite(Boolean favourite) {
        isFavourite = favourite;
    }

    public Mem(String name, Boolean isFavourite) {
        this.name = name;
        this.isFavourite = isFavourite;
    }
}
