
package pieces;

import chessgame.Chess;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;


/**
 * The Class PieceIcon.
 */
public class PieceIcon {

    /** The kit. */
    private Toolkit kit = Toolkit.getDefaultToolkit();

    /** The image. */
    private Image image;

    /**
     * Instantiates a new piece icon.
     *
     * @param nameIcon
     *            the name icon
     */
    // throws IO Exception?
    public PieceIcon(String nameIcon) {
        try {
            URL url = Chess.class.getResource(nameIcon);
            this.image = this.kit.getImage(url);
        } catch (SecurityException s) {
           System.out.println("Sec error with images.");
        }
    }

    /**
     * Return piece icon.
     *
     * @return the image
     */
    public Image returnPieceIcon() {
        return this.image;
    }

}
