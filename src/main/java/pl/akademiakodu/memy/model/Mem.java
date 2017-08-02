package pl.akademiakodu.memy.model;

/**
 * Created by Qbala on 2017-08-02.
 */
public class Mem {

    String name;
    String url;

    public Mem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {
        return "Mem{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
