import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class PPMImage {
    private int width;
    private int height;
    private int maxShade;
    private String typeOfFile;
    private short[][][] pixels;


    public short[][] makeGrey(String filename) {
        short[][] a= new short[getHeight()][getWidth()];
        if(!filename.equals(null)) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(filename));
                setTypeOfFile("P2");
                out.write( getTypeOfFile()+ "\n");
                out.write(getWidth() + " " + getHeight()+"\n");
                out.write(getMaxShade() + "\n");
                byte counter = 0;
                for (int i = 0; i < getHeight(); i++) {
                    for (int j = 0; j < getWidth(); j++) {
                        for (int k = 0; k <3; k++)
                        {
                            //  System.out.println(getPixels()[i][j][k]);
                                //out.write(getPixels()[i][j][k] +" ");
                                a[i][j] = (short)Math.round((getPixels()[i][j][0]+getPixels()[i][j][1]+getPixels()[i][j][2])/3.0);
                            }
                            out.write(a[i][j]+ " ");
                        counter++;
                        if (counter == 15) {
                            out.write("\n");
                            counter = 0;
                        }
                    }
                }
                out.write("\n");
                out.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
      return a;

    }
public PPMImage(String fileName)  {
    try {
        File imgFile = new File(fileName);
        Scanner scanner = new Scanner(imgFile);
        typeOfFile = scanner.next();
        width = scanner.nextInt();
        height = scanner.nextInt();
        maxShade = scanner.nextInt();
        pixels = new short[height][width][3];
        while (scanner.hasNextShort()) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                for (int k = 0; k < 3; k++) {
                    pixels[i][j][k] = scanner.nextShort();
                }
            }
        }
        }

    }catch (IOException e) {
        System.out.println("File not found");
        typeOfFile = "P3";
        width = 0;
        height = 0;
        maxShade = 0;
        pixels = new short [height][width][maxShade];
    }

}

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMaxShade() {
        return maxShade;
    }

    public void setMaxShade(int maxShade) {
        this.maxShade = maxShade;
    }

    public String getTypeOfFile() {
        return typeOfFile;
    }

    public void setTypeOfFile(String typeOfFile) {
        this.typeOfFile = typeOfFile;
    }

    public short[][][] getPixels() {
        return pixels;
    }

    public void setPixels(short[][][] pixels) {
        this.pixels = pixels;
    }


    public static  void main(String[] args) {
       PPMImage ppmImage = new PPMImage("/pic/ComputerScienceSmall.ppm");
       ppmImage.makeGrey("/pic/smallpic1.pgm");
        }


    }





