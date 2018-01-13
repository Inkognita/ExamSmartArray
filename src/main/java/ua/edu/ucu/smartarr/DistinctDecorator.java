package ua.edu.ucu.smartarr;

import java.util.*;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
    }

    @Override
    public Object[] toArray() {
        List<Object> list = new ArrayList<>();
        boolean br = false;
        for (Object o : smartArray.toArray()) {
            br = false;
            for (Object o1 : list) {
                if(o1.equals(o))
                {
                    br = true;
                    break;
                }
            }
            if(br){
                continue;
            }
            list.add(o);
        }
        return list.toArray();
    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription();
    }

    @Override
    public int size() {
        return toArray().length;
    }
}
