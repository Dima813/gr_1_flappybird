package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.FlappyBird;

public class MenuState extends State{

    private Texture background;
    private Texture playbtn;

    public MenuState(GameStateManager gsm2) {
        super(gsm2);
        background = new Texture("bg.png");
        playbtn = new Texture("playbtn.png");
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
        }

    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0,0, FlappyBird.WIDTH, FlappyBird.HEIGHT);
        sb.draw(playbtn, FlappyBird.WIDTH/2 - playbtn.getWidth()/2, FlappyBird.HEIGHT/2 - playbtn.getHeight());
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playbtn.dispose();

    }
}
