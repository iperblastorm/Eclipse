package resourceData;


import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;


public class Resource {	
	
	public static Image immaginePlus() {
		
		try (InputStream is = Resource.class.getResourceAsStream("/resourceData/plusIcon.png");
				){
			BufferedImage bi = ImageIO.read(is);
			BufferedImage result = new BufferedImage(19, 19, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g = result.createGraphics();
			g.drawImage(bi, 0, 0, 19, 19, null);
			g.dispose();
			
			return result;
			
			} catch (Exception e) {
			System.err.println(e);
			return null;
		}
		
		
	}


}
