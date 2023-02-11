package org.patterns.behavior.templateMethods.data;

public abstract class DataRenderer {
    public void render(){
        String data = readData();
        data = processData(data);

        System.out.println(data);
    }

    public abstract String readData();

    public abstract String processData(String data);
}
