import niel905g.Linie;
import niel905g.Punkt;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author niels on 01-Oct-18.
 */
public class TestIt {

    @Test
    public void testLength() throws Exception {

        Punkt punkt1 = new Punkt(3, 0);
        Punkt punkt2 = new Punkt(0, 4);

        Linie linie = new Linie(punkt1, punkt2);

        Assert.assertEquals(5, linie.length(), 0);

    }

    // En test metode til at teste om punkt1 X bliver hentet rigtigt
    @Test
    public void testpunkt1getX() throws Exception {

        Punkt punkt1 = new Punkt(3, 0);

        Assert.assertEquals(3, punkt1.getX(), 0);

    }

    // En test metode til at teste om punkt1 Y bliver hentet rigtigt
    @Test
    public void testpunkt1getY() throws Exception {

        Punkt punkt1 = new Punkt(3, 0);

        Assert.assertEquals(0, punkt1.getY(), 0);

    }

    // En test metode til at teste om punkt2 X bliver hentet rigtigt
    @Test
    public void testpunkt2getX() throws Exception {

        Punkt punkt2 = new Punkt(0, 4);

        Assert.assertEquals(0, punkt2.getX(), 0);

    }

    // En test metode til at teste om punkt2 Y bliver hentet rigtigt
    @Test
    public void testpunkt2getY() throws Exception {

        Punkt punkt2 = new Punkt(0, 4);

        Assert.assertEquals(4, punkt2.getY(), 0);

    }
}
