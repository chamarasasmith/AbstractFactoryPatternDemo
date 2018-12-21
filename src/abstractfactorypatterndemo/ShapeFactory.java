/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypatterndemo;

/**
 *
 * @author chama
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }

        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();

        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }

}
