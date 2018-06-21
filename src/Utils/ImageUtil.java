package Utils;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author kienle
 */
public class ImageUtil {

    public ImageIcon resizePic(String picPath, byte[] BLOBpic, int wdth, int hgt) {
        ImageIcon myImg;
        if (picPath != null){
            myImg = new ImageIcon(picPath);
        } else {
            myImg = new ImageIcon(BLOBpic);
        }
        Image img = myImg.getImage().getScaledInstance(wdth, hgt, Image.SCALE_SMOOTH);
        ImageIcon myPic = new ImageIcon(img);
        return myPic;
    }

    public String browseImage(JLabel lbl) {
        String path = "";
        JFileChooser filec = new JFileChooser();
        filec.setCurrentDirectory(new File(System.getProperty("user.home")));

        //file extension
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*.Images", "jpg", "png", "gif");
        filec.addChoosableFileFilter(fileFilter);

        int fileState = filec.showSaveDialog(null);

        //if user select a file
        if (fileState == JFileChooser.APPROVE_OPTION) {
            File selectedFile = filec.getSelectedFile();
            path = selectedFile.getAbsolutePath();
//            imagePth = path;
            //display the image in the jlabel using resized image
            lbl.setIcon(resizePic(path, null, lbl.getWidth(), lbl.getHeight()));
//            jLabelPic.setIcon(new ImageIcon(path));
        } else if (fileState == JFileChooser.CANCEL_OPTION) {
            // if user cancel
            System.out.println("No Image Selected");
        }
        return path;
    }
}
