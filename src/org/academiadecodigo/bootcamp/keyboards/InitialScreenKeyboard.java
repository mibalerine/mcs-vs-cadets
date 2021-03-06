package org.academiadecodigo.bootcamp.keyboards;

import org.academiadecodigo.bootcamp.Game;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import static org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent.KEY_P;

/**
 * Created by codecadet on 19/10/2017.
 */
public class InitialScreenKeyboard implements KeyboardHandler {

    //Properties
    private Keyboard keyboard;
    private Game game;

    //Constructor
    public InitialScreenKeyboard(Game game) {
        this.game = game;
        this.keyboard = new Keyboard(this);

        KeyboardEvent pressP = new KeyboardEvent();
        pressP.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressP.setKey(KEY_P);

        keyboard.addEventListener(pressP);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KEY_P) {

            game.getInitialScreen().stop();
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
