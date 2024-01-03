//package ProblemSolving;
//
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import javax.imageio.ImageIO;
//import com.google.zxing.BinaryBitmap;
//import com.google.zxing.LuminanceSource;
//import com.google.zxing.MultiFormatReader;
//import com.google.zxing.NotFoundException;
//import com.google.zxing.RGBLuminanceSource;
//import com.google.zxing.Reader;
//import com.google.zxing.Result;
//import com.google.zxing.common.HybridBinarizer;
//
//public class QRCodeScanner {
//    public static void main(String[] args) {
//        String filePath = "path_to_qr_code_image.png"; // Replace with the path to your QR code image
//
//        try {
//            File qrCodeImage = new File(filePath);
//            BufferedImage bufferedImage = ImageIO.read(qrCodeImage);
//
//            LuminanceSource source = new RGBLuminanceSource(bufferedImage.getWidth(), bufferedImage.getHeight(), getRGBPixels(bufferedImage));
//            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
//
//            Reader reader = new MultiFormatReader();
//            Result result = reader.decode(bitmap);
//
//            System.out.println("QR Code text: " + result.getText());
//        } catch (IOException | NotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static int[] getRGBPixels(BufferedImage image) {
//        int width = image.getWidth();
//        int height = image.getHeight();
//        int[] pixels = new int[width * height];
//        image.getRGB(0, 0, width, height, pixels, 0, width);
//        return pixels;
//    }
//}
//
