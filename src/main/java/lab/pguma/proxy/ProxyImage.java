package lab.pguma.proxy;

import lombok.Getter;
import lombok.Setter;

public class ProxyImage implements Image {

    @Getter
    @Setter
    private String filename;

    @Getter
    @Setter
    private Image image;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void displayImage() {
        if (image == null) {
            image = new RealImage(this.filename);
        }
        image.displayImage();
    }

}
