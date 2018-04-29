package pieces;

import java.awt.Image;
import java.awt.Point;

/**
 * The Class Piece.
 */
public class Piece {

    /** The next X. */
    protected int nextX;

    /** The next Y. */
    protected int nextY;

    /** The pixel point. */
    protected Point pixelPoint = new Point();

    /** The pixel X. */
    protected int pixelX;

    /** The pixel Y. */
    protected int pixelY;

    /** The havelife. */
    protected boolean havelife = true;

    /** The piece icon. */
    protected PieceIcon pieceIcon;

    /** The updated position. */
    protected Point updatedPosition = new Point();

    /** The old. */
    protected Point old = new Point();

    /**
     * Instantiates a new piece.
     *
     * @param nameIcon
     *            the name icon
     * @param startX
     *            the start X
     * @param startY
     *            the start Y
     */
    public Piece(String nameIcon, int startX, int startY) {

        this.pieceIcon = new PieceIcon(nameIcon);

        this.nextX = startX;
        this.nextY = startY;
        this.updatedPosition.x = this.nextX;
        this.updatedPosition.y = this.nextY;
    }

    /**
     * Return piece image.
     *
     * @return the image
     */
    public Image returnPieceImage() {
        return this.pieceIcon.returnPieceIcon();
    }

    /**
     * Return postion.
     *
     * @return the point
     */
    public Point returnPostion() {
        return (Point) this.updatedPosition.clone();
    }

    /**
     * Return X.
     *
     * @return the int
     */
    public int returnX() {
        return this.nextX;
    }

    /**
     * Sets the pixels.
     *
     * @param newpixelX
     *            the newpixel X
     * @param newpixelY
     *            the newpixel Y
     */
    public void setPixels(int newpixelX, int newpixelY) {
        this.pixelPoint.x = newpixelX;
        this.pixelPoint.y = newpixelY;
    }

    /**
     * Gets the pixel X.
     *
     * @return the pixel X
     */
    public int getPixelX() {
        return this.pixelX;
    }

    /**
     * Gets the pixel Y.
     *
     * @return the pixel Y
     */
    public int getPixelY() {
        return this.pixelY;
    }

    /**
     * Gets the pixel point.
     *
     * @return the pixel point
     */
    public Point getpixelPoint() {
        return this.pixelPoint;
    }

    /**
     * Return Y.
     *
     * @return the int
     */
    public int returnY() {
        return this.nextY;
    }

    /**
     * Sets the point.
     *
     * @param newPoint
     *            the new point
     */
    public void setPoint(Point newPoint) {
        this.old.x = this.updatedPosition.x;
        this.old.y = this.updatedPosition.y;
        this.nextX = this.updatedPosition.x = newPoint.x;
        this.nextY = this.updatedPosition.y = newPoint.y;

        // updatedPosition.x = newPoint.x;
        //
        // updatedPosition.y = newPoint.y;
        // nextX = updatedPosition.x;
    }

    /**
     * Sets the x.
     *
     * @param newX
     *            the new x
     */
    public void setX(int newX) {
        this.nextX = newX;
        this.updatedPosition.x = this.nextX;
    }

    /**
     * Return old.
     *
     * @return the point
     */
    public Point returnOld() {
        return this.old;
    }

    /**
     * Sets the y.
     *
     * @param newY
     *            the new y
     */
    public void setY(int newY) {
        this.nextY = newY;
        this.updatedPosition.y = this.nextY;
    }

    /**
     * To old.
     *
     * @param old
     *            the old
     */
    public void toOld(Point old) {

        this.updatedPosition.x = old.x;
        this.updatedPosition.y = old.y;

    }

    /**
     * Return life.
     *
     * @return true, if successful
     */
    public boolean returnLife() {
        return this.havelife;
    }

    /**
     * In this position.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @return true, if successful
     */
    public boolean inThisPosition(int x, int y) {
        if (this.updatedPosition.x == x && this.updatedPosition.y == y) {
            return true;
        }
        return false;
    }
}
