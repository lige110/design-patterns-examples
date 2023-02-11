package org.patterns.behavior.templateMethods.data;

public class Test {
    public static void main(String[] args) {
        RendererFactory factory = new RendererFactory();
        DataRenderer renderer = factory.getRenderer(RendererFactory.RendererType.DATABASE);

        renderer.render();
    }
}
