package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.ArrayList;
import java.util.List;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    protected MyFunction myFunction;
    public MapDecorator(SmartArray smartArray, MyFunction myFunction) {
        super(smartArray);
        this.myFunction = myFunction;
    }

    @Override
    public Object[] toArray() {
        Object[] obj = smartArray.toArray();
        for (int i = 0; i < obj.length; i++) {
            obj[i] = myFunction.apply(obj[i]);
        }
        return obj;
    }
}
