package org.patterns.behavior.templateMethods.data;

public class RendererFactory {

    public DataRenderer getRenderer(RendererType type) {
        if (type.equals(RendererType.XML)) {
            return new XMLDataRenderer();
        } else if (type.equals(RendererType.DATABASE)) {
            return new DBDataRenderer();
        }
        throw new IllegalArgumentException();
    }

    enum RendererType {
        XML, DATABASE
    }

}