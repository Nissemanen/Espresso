package io.github.nissemanen.core.windows;

import org.lwjgl.glfw.GLFW;

public class Window {
    private long pWindow;
    private int width, height;
    private String title;
    private boolean vSync;

    public void setContextCurrent() { GLFW.glfwMakeContextCurrent(pWindow); }

    public boolean shouldClose() { return GLFW.glfwWindowShouldClose(pWindow); }

    public void update() { GLFW.glfwSwapBuffers(pWindow); }
}
