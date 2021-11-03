package exe8_prob4_Froggy;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    private List<Integer> lake;

    public Lake(List<Integer> lake) {
        this.lake = lake;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    class Frog implements Iterator<Integer> {
        int index = 0;
        boolean finishedFirstIteration = false;

        @Override
        public boolean hasNext() {
            return this.index < lake.size();
        }

        @Override
        public Integer next() {
            int currentIndex = index;
            index += 2;
            if (this.index >= lake.size() && !finishedFirstIteration) {
                index = 1;
                finishedFirstIteration = true;
            }
            return lake.get(currentIndex);
        }
    }
}
