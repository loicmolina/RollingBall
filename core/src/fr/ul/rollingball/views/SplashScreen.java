package fr.ul.rollingball.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import fr.ul.rollingball.RollingBall;
import fr.ul.rollingball.dataFactories.TextureFactory;

/**
 * Created by molina9u on 24/01/17.
 */

public class SplashScreen extends ScreenAdapter {
    protected SpriteBatch listeAff;
    protected RollingBall rollBall;

    public SplashScreen(RollingBall rb){
        rollBall=rb;
        listeAff=new SpriteBatch();
    }

    public void render(float delta){
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        listeAff.begin();
        listeAff.draw(TextureFactory.getInstance().getIntro(),0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        listeAff.end();
    }

    public void dispose(){
        listeAff.dispose();
    }
}
