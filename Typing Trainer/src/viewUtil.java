/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Sulakshana Ranawake
 */
public class viewUtil {
    
    public static ImageIcon getScaledImage(int x,int y,URL imgURL) throws MalformedURLException, IOException{
        Image img = ImageIO.read(imgURL);
        img = img.getScaledInstance(x, y, Image.SCALE_DEFAULT);
        ImageIcon icon =  new ImageIcon(img);
        return icon;
    }
}
