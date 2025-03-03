package org.thebungine.engine.render;

import lombok.experimental.UtilityClass;
import org.thebungine.engine.render.buffer.VertexArray;

@UtilityClass
public class RenderCommand {

    public void setClearColor(float red, float green, float blue, float alpha) {
        RendererAPI.getInstance().setClearColor(red, green, blue, alpha);
    }

    public void clear() {
        RendererAPI.getInstance().clear();
    }

    public void drawIndexed(VertexArray vertexArray) {
        RendererAPI.getInstance().drawIndexed(vertexArray);
    }

    public static void init() {
        RendererAPI.getInstance().init();
    }
}
