package dcll.mgri;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mayeul Grivet-Roux on 2/17/2016.
 *
 * réponse à l'exigence 1 car je suis très fort
 *
 */
public class SimpleStackImplTest {

    SimpleStackImpl maPileTest = new SimpleStackImpl();

    @Test
    public void testIsEmpty() throws Exception {
        //Test pile vide
        Assert.assertEquals(true, maPileTest.isEmpty());

        //push un élément puis test pile vide
        int val = 42;
        maPileTest.push(new Item(val));
        Assert.assertEquals(false, maPileTest.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        //test size = 0
        Assert.assertEquals(0, maPileTest.getSize());

        //push deux éléments puis test size = 2
        int val, val2;
        val = 42;
        val2 = 1337;
        maPileTest.push(new Item(val));
        maPileTest.push((new Item(val2)));
        Assert.assertEquals(2, maPileTest.getSize());
    }

    @Test
    public void testPush() throws Exception {
        Item i = new Item(33);
        Assert.assertEquals(0, maPileTest.getSize());
        maPileTest.push(i);
        Assert.assertEquals(1, maPileTest.getSize());
        Item check = maPileTest.peek();
        int val = check.getValue();
        Assert.assertEquals(33, val);
    }

    @Test
    public void testPeek() throws Exception {
        Item i = new Item(6006);
        Assert.assertEquals(0, maPileTest.getSize());
        maPileTest.push(i);
        Assert.assertEquals(1, maPileTest.getSize());
        maPileTest.peek();
        Assert.assertEquals(1, maPileTest.getSize());
    }

    @Test
    public void testPop() throws Exception {
        Item i = new Item(6006);
        Assert.assertEquals(0, maPileTest.getSize());
        maPileTest.push(i);
        Assert.assertEquals(1, maPileTest.getSize());
        maPileTest.pop();
        Assert.assertEquals(0, maPileTest.getSize());
    }
}