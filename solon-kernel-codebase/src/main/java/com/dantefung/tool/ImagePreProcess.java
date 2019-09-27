package com.dantefung.tool;
import java.awt.Color;  
import java.awt.image.BufferedImage;  
import java.io.File;  
import java.io.FileOutputStream;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
  
import javax.imageio.ImageIO;  
  
import org.apache.commons.httpclient.HttpClient;  
import org.apache.commons.httpclient.HttpStatus;  
import org.apache.commons.httpclient.methods.GetMethod;  
import org.apache.commons.io.IOUtils;  
  
public class ImagePreProcess {  
	
	/**
	 *  ��ɫ��ͼ���RGBֵ > ��ֵ������ͼƬ�����趨��100
     * ��ɫ��ͼ���RGBֵ < ��ֵ100
	 * @param colorInt
	 * @return
	 */
    public static int isWhite(int colorInt) {  
        Color color = new Color(colorInt);  
        if (color.getRed() + color.getGreen() + color.getBlue() > 100) {  
            return 1;  
        }  
        return 0;  
    }  
    
    /**
	 *  ��ɫ��ͼ���RGBֵ > ��ֵ������ͼƬ�����趨��100
     * ��ɫ��ͼ���RGBֵ < ��ֵ100
	 * @param colorInt
	 * @return
	 */
    public static int isBlack(int colorInt) {  
        Color color = new Color(colorInt);  
        if (color.getRed() + color.getGreen() + color.getBlue() <= 100) {  
            return 1;  
        }  
        return 0;  
    }  
    /**
     * ��ȥͼƬ�ı���:ͼ��ָ��Ŀ���뱳�����룩
     * @param picFile
     * @return
     * @throws Exception
     */
    public static BufferedImage removeBackgroud(String picFile)  
            throws Exception {  
        BufferedImage img = ImageIO.read(new File(picFile));  
        int width = img.getWidth();  
        int height = img.getHeight();  
        for (int x = 0; x < width; ++x) {  
            for (int y = 0; y < height; ++y) {
                if (isWhite(img.getRGB(x, y)) == 1) {  
                    img.setRGB(x, y, Color.WHITE.getRGB());  
                } else {  
                    img.setRGB(x, y, Color.BLACK.getRGB());  
                }  
            }  
        }  
        return img;  
    }  
  
    /**
     * �ָ�ͼƬ
     * @param img
     * @return
     * @throws Exception
     */
    public static List<BufferedImage> splitImage(BufferedImage img)  
            throws Exception {  
        List<BufferedImage> subImgs = new ArrayList<BufferedImage>();  
        subImgs.add(img.getSubimage(10, 6, 8, 10));  
        subImgs.add(img.getSubimage(19, 6, 8, 10));  
        subImgs.add(img.getSubimage(28, 6, 8, 10));  
        subImgs.add(img.getSubimage(37, 6, 8, 10));  
        return subImgs;  
    }  
  
    /**
     * ����ѵ������
     * @return
     * @throws Exception
     */
    public static Map<BufferedImage, String> loadTrainData() throws Exception {  
        Map<BufferedImage, String> map = new HashMap<BufferedImage, String>();  
        File dir = new File("train");  
        File[] files = dir.listFiles();  
        for (File file : files) {  
            map.put(ImageIO.read(file), file.getName().charAt(0) + "");  
        }  
        return map;  
    }  
  
    /**
     * �����ַ�ʶ��
     * @param img
     * @param map
     * @return
     */
    public static String getSingleCharOcr(BufferedImage img,  
            Map<BufferedImage, String> map) {  
        String result = "";  
        int width = img.getWidth();  
        int height = img.getHeight();  
        int min = width * height;  
        for (BufferedImage bi : map.keySet()) {  
            int count = 0;  
            Label1: for (int x = 0; x < width; ++x) {  
                for (int y = 0; y < height; ++y) {  
                    if (isWhite(img.getRGB(x, y)) != isWhite(bi.getRGB(x, y))) {  
                        count++;  
                        if (count >= min)  
                            break Label1;  
                    }  
                }  
            }  
            if (count < min) {  
                min = count;  
                result = map.get(bi);  
            }  
        }  
        return result;  
    }  
  
    public static String getAllOcr(String file) throws Exception {  
        BufferedImage img = removeBackgroud(file);  
        List<BufferedImage> listImg = splitImage(img);  
        Map<BufferedImage, String> map = loadTrainData();  
        String result = "";  
        for (BufferedImage bi : listImg) {  
            result += getSingleCharOcr(bi, map);  
        }  
        ImageIO.write(img, "JPG", new File("result//"+result+".jpg"));  
        return result;  
    }  
  
    public static void downloadImage() {  
        HttpClient httpClient = new HttpClient();  
        GetMethod getMethod = new GetMethod(  
                "http://www.puke888.com/authimg.php");  
        for (int i = 0; i < 30; i++) {  
            try {  
                // ִ��getMethod  
                int statusCode = httpClient.executeMethod(getMethod);  
                if (statusCode != HttpStatus.SC_OK) {  
                    System.err.println("Method failed: "  
                            + getMethod.getStatusLine());  
                }  
                // ��ȡ����  
                String picName = "img//" + i + ".jpg";  
                InputStream inputStream = getMethod.getResponseBodyAsStream();  
                OutputStream outStream = new FileOutputStream(picName);  
                IOUtils.copy(inputStream, outStream);  
                outStream.close();  
                System.out.println("OK!");  
            } catch (Exception e) {  
                e.printStackTrace();  
            } finally {  
                // �ͷ�����  
                getMethod.releaseConnection();  
            }  
        }  
    }  
  
    /** 
     * @param args 
     * @throws Exception 
     */  
    public static void main(String[] args) throws Exception { 
//    	BufferedImage removeBackgroud = removeBackgroud("D:\\A\\55c9d201N7d9cc61a.jpg");
//    	ImageIO.write(removeBackgroud, "JPEG",new File("D:\\images\\55c9d201N7d9cc61a��ȥͼ�񱳾�.jpg"));
    	BufferedImage read = ImageIO.read(new File("D:\\A\\55c9d201N7d9cc61a.jpg"));
    	BufferedImage subimage = read.getSubimage((750*2)/3, 100, 100, 100);
    	ImageIO.write(subimage, "JPEG",new File("D:\\images\\55c9d201N7d9cc61a��ͼ��.jpg"));
    	// downloadImage();
     /*   for (int i = 0; i < 30; ++i) {  
            String text = getAllOcr("img//" + i + ".jpg");  
            System.out.println(i + ".jpg = " + text);  
        }  */
    }  
}  