package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    protected MyComparator myComparator;
    public SortDecorator(SmartArray smartArray, MyComparator myComparator) {
        super(smartArray);
        this.myComparator = myComparator;
    }
}
