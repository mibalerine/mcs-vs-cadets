package org.academiadecodigo.bootcamp.sound;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by codecadet on 21/10/17.
 */
public class SoundManager {

    private static HashMap<SoundType, Sound> SOUNDMAP = new HashMap<>();

    public SoundManager() {

        for (SoundType soundType : SoundType.values()) {
            try {
                SOUNDMAP.put(soundType, new Sound(soundType.getPath()));

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void playSound(SoundType soundType){
        Sound currSound = SOUNDMAP.get(soundType);

        if(currSound == null) {
            System.out.println("No sound available");
            return;
        }
        currSound.play(true);
    }

    public static void playGameOverSound() {
        Sound gameOverSound;
        int random = (int)(Math.random() * 3);

        switch (random) {
            case 0:
                gameOverSound = SOUNDMAP.get(SoundType.BATATA_ARREBENTADA);
                break;
            case 1:
                gameOverSound = SOUNDMAP.get(SoundType.BATATA_PORRA);
                break;
            default:
                gameOverSound = SOUNDMAP.get(SoundType.PURE);
        }

        gameOverSound.play(true);
    }

    public static void playBatataSound() {
        Sound batataSound;
        int random = (int)(Math.random() * 2);

        if(random == 0) {
            batataSound = SOUNDMAP.get(SoundType.BATATA);
        } else {
            batataSound = SOUNDMAP.get(SoundType.BATATAS);
        }

        batataSound.play(true);
    }

    public static void playMCSound() {
        Sound mcSound;
        int random = (int)(Math.random() * 2);

        if(random == 0) {
            mcSound = SOUNDMAP.get(SoundType.FODA_SE);
        } else {
            mcSound = SOUNDMAP.get(SoundType.CONO);
        }

        mcSound.play(true);
    }
}
