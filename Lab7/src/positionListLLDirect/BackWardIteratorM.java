package positionListLLDirect;

import positionInterfaces.PositionList;

import java.util.Iterator;

public class BackWardIteratorM<E> implements PositionListIteratorMaker<E> {
    @Override
    public Iterator makeIterator(PositionList pl) {
        return new PositionListElementsBackwardIterator<E>(pl);
    }
}
