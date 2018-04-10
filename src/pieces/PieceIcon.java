
package pieces;

import java.awt.Image;
import java.awt.Toolkit;

public class PieceIcon {
    private Toolkit kit = Toolkit.getDefaultToolkit();
    private Image image;

    //throws IO Exception?
    public PieceIcon(String nameIcon) {

        image = kit.getImage(nameIcon);
    }

    public Image returnPieceIcon() {
        return image;
    }

}
