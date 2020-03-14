package com.mygdx.game.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public abstract class State {
    protected OrthographicCamera camera;
    protected Vector3 mouse;

    protected GameStateManager gsm;

    /// конструктор классов. служит для получение значений из других классов
    public State(GameStateManager gsm2) {
        /// this - это контраст, означающий, что мы работает с данными в пределах класса
        this.gsm = gsm2;
        camera = new OrthographicCamera();
        mouse = new Vector3();
    }

    protected abstract void handleInput();
    public abstract void update(float dt);
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();
}
