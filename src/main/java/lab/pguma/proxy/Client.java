package lab.pguma.proxy;

public class Client {

    public static void main(String[] args) {
        Image image = new ProxyImage("sample");

        // 画像ファイルの実態を必要としない処理・・・

        // 画像ファイルの実態が必要な処理
        // 画像の実態が必要になったタイミングでロードを行う。
        image.displayImage();
    }
}
