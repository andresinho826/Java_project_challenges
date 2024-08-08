package codigo_practice;

/*
NOTA: este ejercico se crea con la ayuda de chatgpt

Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
        * - Url de ejemplo:
        *   https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png
        * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
 *   imagen de 1920*1080px.
*/



import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;

public class AspectRatioCalculator {

    public static void main(String[] args) {
        String imageUrl = "https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png";
        //String imageUrl = "https://www.istockphoto.com/es/foto/fire-png-burning-flame-isolated-on-a-black-background-gm2152193812-573223497?utm_source=pixabay&utm_medium=affiliate&utm_campaign=SRP_image_sponsored&utm_content=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fpng%2F&utm_term=png";
        try {
            URL url = new URL(imageUrl);
            InputStream inputStream = url.openStream();
            BufferedImage image = ImageIO.read(inputStream);

            int width = image.getWidth();
            int height = image.getHeight();

            int gcd = gcd(width, height);
            int aspectRatioWidth = width / gcd;
            int aspectRatioHeight = height / gcd;

            System.out.println("Aspect Ratio: " + aspectRatioWidth + ":" + aspectRatioHeight);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

