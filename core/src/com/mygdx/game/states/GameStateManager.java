package com.mygdx.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

public class GameStateManager {
    // стэк это струтура данных которая позволяет следить за состояние текущего окна приложения
    // реализуя подход "последний вошёл-первый вышел
    //Stack<State> - State - это уже объект LidGdx
    private Stack<State> states;

    // создаем конструктор
    public GameStateManager(){

        states = new Stack<State>();
    }

    //void - означяет, что метод не возвращяет значений, т.е. нет смысла писать оператор return
    // метод push - будет добавлять окно в конец стека
    public void  push(State state){

        states.push(state);
    }

    public void pop() {
        states.pop().dispose();
    }

    public  void set (State state) {
        states.pop().dispose();
        states.push(state);
    }

    public void update(float dt){

        states.peek().update(dt);
    }

    public void render(SpriteBatch sb){

        states.peek().render(sb);
    }
}
