
package pieces;

import java.awt.Image;
import java.awt.Toolkit;

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

        this.image = this.kit.getImage(nameIcon);
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
