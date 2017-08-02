package pl.akademiakodu.memy.model;

/**
 * Created by Qbala on 2017-08-02.
 */
public class Mem {

    String name;
    Boolean isTrue;

    public Mem(String name, Boolean isTrue) {
        this.name = name;
        this.isTrue = isTrue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getTrue() {
        return isTrue;
    }

    public void setTrue(Boolean aTrue) {
        isTrue = aTrue;
    }
}
