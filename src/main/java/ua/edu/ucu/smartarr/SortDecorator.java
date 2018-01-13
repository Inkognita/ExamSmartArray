package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    protected MyComparator myComparator;
    public SortDecorator(SmartArray smartArray, MyComparator myComparator) {
        super(smartArray);
        this.myComparator = myComparator;
    }

    @Override
    public Object[] toArray() {
        Object[] obj = smartArray.toArray();
        Arrays.sort(obj, myComparator);
        return obj;
    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription();
    }

}
