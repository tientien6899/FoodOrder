package ModelClass;

/**
 * Created by wolfsoft5 on 26/1/19.
 */

public class ReviewModelClas {

    String title;
    Integer image;

    public ReviewModelClas(String title, Integer image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
