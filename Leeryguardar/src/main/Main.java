
package main;

import view.ViewLeeryguardar;
import model.ModelLeeryguardar;
import controller.ControllerLeeryguardar;

public class Main {
    private static ViewLeeryguardar viewLeeryguardar;
    private static ModelLeeryguardar modelLeeryguardar;
    private static ControllerLeeryguardar controllerLeeryguardar;
    
    public static void main(String[] args)
    {
        viewLeeryguardar = new ViewLeeryguardar();
        modelLeeryguardar = new ModelLeeryguardar();
        controllerLeeryguardar = new ControllerLeeryguardar(viewLeeryguardar, modelLeeryguardar);
    }
}