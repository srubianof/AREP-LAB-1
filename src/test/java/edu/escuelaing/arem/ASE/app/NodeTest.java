package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.app.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NodeTest {
    public Node node;

    @Test
    public void shouldCreateEmptyNode(){
        node = new Node();
        Assert.assertEquals(0.0, node.getData(),0);
        Assert.assertEquals(null,node.getNext());
    }
    @Test
    public void shouldBeAbleToAddDataToNode(){
        node = new Node();
        node.setData(50);
        Assert.assertEquals(50.0, node.getData(),0);
    }

    @Test
    public void shouldBeAbleToAddNextNode(){
        node = new Node();
        node.setData(10);
        Node node2 = new Node();
        node2.setData(20);
        node.setNext(node2);
        Assert.assertEquals(20,node.getNext().getData(),0);
    }
}
