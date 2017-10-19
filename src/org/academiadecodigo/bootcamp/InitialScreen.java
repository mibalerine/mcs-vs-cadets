package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 18/10/2017.
 */
public class InitialScreen {

    //Properties
    private Picture background;
    private Picture letters;
    private boolean drawn = false;
    private boolean notStarted = true;

    //Constructor
    public InitialScreen() {
        background = new Picture(10, 10, "logo.png");
        background.draw();
        letters = new Picture(10, 10, "insert.png");
        letters.grow(-700, -20);
        letters.translate(-600, 0);
    }

    public void show() {

        while (notStarted) {
            try {
                if (drawn) {
                    letters.delete();
                    drawn = false;
                    Thread.sleep(750);
                } else {
                    letters.draw();
                    drawn = true;
                    Thread.sleep(750);
                }
            } catch (InterruptedException e) {
                System.out.println("deu merda");
            }
        }

        System.out.println("delete");
        background.delete();
        letters.delete();
    }


    public void stop() {
        System.out.println("stop");
        notStarted = false;
    }

}
