package lab.pguma.proxy;

import lombok.Getter;
import lombok.Setter;

public class RealImage implements Image {

    @Getter
    @Setter
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        // 重たいイメージのローディング
        System.out.println("イメージのロード完了");
    }

    @Override
    public void displayImage() {
        System.out.println("画像の表示");
    }

}
