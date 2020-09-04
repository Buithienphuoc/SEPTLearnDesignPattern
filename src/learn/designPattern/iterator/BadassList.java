package learn.designPattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class BadassList implements ShittyIterator {
    public List<String> badassList = new ArrayList<>();
    int currentShitIndex = 0;
    @Override
    public boolean hasNext() {
        if (currentShitIndex >= badassList.size()){
            currentShitIndex = 0;
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return badassList.get(currentShitIndex++);
    }
}
