package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    protected MyFunction myFunction;
    public MapDecorator(SmartArray smartArray, MyFunction myFunction) {
        super(smartArray);
        this.myFunction = myFunction;
    }
}
