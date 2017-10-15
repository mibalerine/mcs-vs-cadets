package org.academiadecodigo.bootcamp.entity;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.GridPosition;

/**
 * Created by codecadet on 13/10/2017.
 */
public class MC extends GameEntity {

    //Properties


    //Constructor
    public MC(Grid grid) {
        super.setGrid(grid);
        super.setGridPosition(getPosition(grid));
    }


    private GridPosition getPosition(Grid grid) {

        int col = (int)(Math.floor(grid.getWidth() / 2));
        int row = grid.getHeight();

        return new GridPosition(col, row);
    }

    public void shoot() {

        throw new UnsupportedOperationException();
    }

    @Override
    public void move() {

        throw new UnsupportedOperationException();
    }
}
