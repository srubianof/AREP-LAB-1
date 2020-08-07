package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.app.LinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class LinkedListTest {

    public LinkedList linkedList;

    @Test
    public void shouldCreateEmptyLinkedList(){
        linkedList = new LinkedList();
        Assert.assertEquals(null, linkedList.getHead());
        Assert.assertEquals(null, linkedList.getTail());
    }
    @Test
    public void shouldCreateLinkedListAndBeAbleToAddNumbers(){
        linkedList = new LinkedList();
        for (int i = 1; i<4;i++ ){
            linkedList.insertNode(i);
        }
        Assert.assertEquals((double) 1,linkedList.getHead().getData(),0);
        Assert.assertEquals((double) 2,linkedList.getHead().getNext().getData(),0);
        Assert.assertEquals((double) 3,linkedList.getTail().getData(),0);
    }

}
