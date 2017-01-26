package fr.ul.rollingball.models;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by molina9u on 26/01/17.
 */

public class Boule extends MovableElement {
    protected static float RAYONDEFAUT=20;
    protected float rayon;


    public Boule(World mnd, Vector2 vct) {
        super(mnd, vct);
        rayon=RAYONDEFAUT;
    }


    public void draw(SpriteBatch sb) {

    }
}