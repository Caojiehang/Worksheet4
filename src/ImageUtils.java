import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageUtils {

    /**
     * 将 jpg 格式图片转为 PPM 格式图片
     *
     * @param image
     * @param outPath
     * @throws IOException
     */
    public static void jpgToPPM(File image, String outPath) throws IOException {
        //读取图片
        BufferedImage bi = ImageIO.read(image);
        //获取长和高
        int width = bi.getWidth();
        int height = bi.getHeight();
        //获取图片字节数组
        byte [] img = ((DataBufferByte) bi.getData().getDataBuffer()).getData();
        //输出文件
        File outPPM = new File(outPath);
        FileOutputStream fos = new FileOutputStream(outPPM);
        fos.write("P6\n".getBytes());
        fos.write(new String(width + " " + height + "\n").getBytes());
        fos.write("255\n".getBytes());
        fos.write(img);
        fos.flush();
        //关闭输出流
        fos.close();
    }

    public static void main(String[] args) throws IOException {
        jpgToPPM(new File("/pic/68599.jpg"), "/pic/kkkk.ppm");
    }
}
