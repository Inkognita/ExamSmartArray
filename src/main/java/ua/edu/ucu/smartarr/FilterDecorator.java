package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

    protected MyPredicate myPredicate;
    public FilterDecorator(SmartArray smartArray, MyPredicate myPredicate) {
        super(smartArray);
        this.myPredicate = myPredicate;
    }

    public Object[] toArray() {
        return smartArray.toArray();
    }

    public String operationDescription() {
        return smartArray.operationDescription();
    }

    public int size() {
        return smartArray.size();
    }
}
