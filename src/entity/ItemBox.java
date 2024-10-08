package entity;

import engine.DrawManager;

import java.awt.*;

/**
 * Implement an item box that activates an item when destroyed.
 *
 * @author Seochan Moon
 *
 */

public class ItemBox extends Entity {
    /**
     * Constructor, establishes the entity's generic properties.
     *
     * @param positionX Initial position of the entity in the X axis.
     * @param positionY Initial position of the entity in the Y axis.
     */
    public ItemBox(int positionX, int positionY) {
        super(positionX, positionY, 7 * 2, 7 * 2, Color.YELLOW);

        this.spriteType = DrawManager.SpriteType.ItemBox;
    }
}
