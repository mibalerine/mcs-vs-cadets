package org.academiadecodigo.bootcamp.grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 13/10/2017.
 */
public class Grid {

    public static int CELL_SIZE = 20;
    private int width;
    private int height;
    public static int PADDING = 10;

    //Constructor
    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

}
