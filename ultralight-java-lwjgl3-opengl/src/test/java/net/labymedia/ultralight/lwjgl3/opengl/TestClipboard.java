/*
 * Ultralight Java - Java wrapper for the Ultralight web engine
 * Copyright (C) 2020 LabyMedia and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package net.labymedia.ultralight.lwjgl3.opengl;

import net.labymedia.ultralight.plugin.clipboard.UltralightClipboard;

import static org.lwjgl.glfw.GLFW.*;

/**
 * Test clipboard using GLFW as backend.
 */
public class TestClipboard implements UltralightClipboard {
    @Override
    public void clear() {
        glfwSetClipboardString(0, "");
    }

    @Override
    public String readPlainText() {
        return glfwGetClipboardString(0);
    }

    @Override
    public void writePlainText(String text) {
        glfwSetClipboardString(0, text);
    }
}