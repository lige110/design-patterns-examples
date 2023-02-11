package org.patterns.behavior.templateMethods.data;

public class DBDataRenderer extends DataRenderer{
    @Override
    public String readData() {
        return "Database Data";
    }

    @Override
    public String processData(String data) {
        return "Processed " + data;
    }
}
