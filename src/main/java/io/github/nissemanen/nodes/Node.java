package io.github.nissemanen.nodes;

public abstract class Node {
    abstract void onReady();
    abstract void onUpdate(float delta);
    abstract void onFixedUpdate(float delta);
}