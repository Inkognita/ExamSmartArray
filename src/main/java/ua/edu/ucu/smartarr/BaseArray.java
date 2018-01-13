package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] collection;

    public BaseArray(Object[] collection){
        this.collection = collection;
    }

    @Override
    public Object[] toArray() {
        return collection;
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return collection.length;
    }
}
