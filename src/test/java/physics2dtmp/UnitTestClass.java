package physics2dtmp;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.joml.Vector2f;
import org.junit.Assert;
import org.junit.Test;
import physics2d.physics2dtmp.primitives.Box2D;
import physics2d.physics2dtmp.primitives.Circle;
import physics2d.physics2dtmp.rigidbody.IntersectionDetector2D;
import physics2d.physics2dtmp.rigidbody.Rigidbody2D;
import renderer.Line2D;

public class UnitTestClass {
    private final float EPSILON = 1.0E-6F;

    public UnitTestClass() {
    }

    @Test
    public void pointOnLine2DShouldReturnTrueTest() {
        Line2D line = new Line2D(new Vector2f(0.0F, 0.0F), new Vector2f(12.0F, 4.0F));
        Vector2f point = new Vector2f(0.0F, 0.0F);
        Assert.assertTrue(IntersectionDetector2D.pointOnLine(point, line));
    }

    @Test
    public void pointOnLine2DShouldReturnTrueTestTwo() {
        Line2D line = new Line2D(new Vector2f(0.0F, 0.0F), new Vector2f(12.0F, 4.0F));
        Vector2f point = new Vector2f(12.0F, 4.0F);
        Assert.assertTrue(IntersectionDetector2D.pointOnLine(point, line));
    }

    @Test
    public void pointOnVerticalLineShouldReturnTrue() {
        Line2D line = new Line2D(new Vector2f(0.0F, 0.0F), new Vector2f(0.0F, 10.0F));
        Vector2f point = new Vector2f(0.0F, 5.0F);
        boolean result = IntersectionDetector2D.pointOnLine(point, line);
        Assert.assertTrue(result);
    }

    @Test
    public void pointOnLineShouldReturnTrueTestOne() {
        Line2D line = new Line2D(new Vector2f(0.0F, 0.0F), new Vector2f(12.0F, 4.0F));
        Vector2f point = new Vector2f(0.0F, 0.0F);
        Assert.assertTrue(IntersectionDetector2D.pointOnLine(point, line));
    }

    @Test
    public void pointOnLineShouldReturnTrueTestTwo() {
        Line2D line = new Line2D(new Vector2f(0.0F, 0.0F), new Vector2f(12.0F, 4.0F));
        Vector2f point = new Vector2f(6.0F, 2.0F);
        Assert.assertTrue(IntersectionDetector2D.pointOnLine(point, line));
    }

    @Test
    public void pointOnLineShouldReturnFalseTestOne() {
        Line2D line = new Line2D(new Vector2f(0.0F, 0.0F), new Vector2f(12.0F, 4.0F));
        Vector2f point = new Vector2f(4.0F, 2.0F);
        Assert.assertFalse(IntersectionDetector2D.pointOnLine(point, line));
    }

    @Test
    public void pointOnLineShouldReturnTrueTestThree() {
        Line2D line = new Line2D(new Vector2f(10.0F, 10.0F), new Vector2f(22.0F, 14.0F));
        Vector2f point = new Vector2f(10.0F, 10.0F);
        Assert.assertTrue(IntersectionDetector2D.pointOnLine(point, line));
    }

    @Test
    public void pointOnLineShouldReturnTrueTestFour() {
        Line2D line = new Line2D(new Vector2f(10.0F, 10.0F), new Vector2f(22.0F, 14.0F));
        Vector2f point = new Vector2f(16.0F, 12.0F);
        Assert.assertTrue(IntersectionDetector2D.pointOnLine(point, line));
    }

    @Test
    public void pointOnLineShouldReturnFalseTestTwo() {
        Line2D line = new Line2D(new Vector2f(10.0F, 10.0F), new Vector2f(22.0F, 14.0F));
        Vector2f point = new Vector2f(14.0F, 12.0F);
        Assert.assertFalse(IntersectionDetector2D.pointOnLine(point, line));
    }

    @Test
    public void pointInCircleShouldReturnTrueTestOne() {
        Circle circle = new Circle();
        circle.setRadius(5.0F);
        Rigidbody2D body = new Rigidbody2D();
        circle.setRigidbody(body);
        Vector2f point = new Vector2f(3.0F, -2.0F);
        boolean result = IntersectionDetector2D.pointInCircle(point, circle);
        Assert.assertTrue(result);
    }

    @Test
    public void pointInCircleShouldReturnTrueTestTwo() {
        Circle circle = new Circle();
        circle.setRadius(5.0F);
        Rigidbody2D body = new Rigidbody2D();
        circle.setRigidbody(body);
        Vector2f point = new Vector2f(-4.9F, 0.0F);
        boolean result = IntersectionDetector2D.pointInCircle(point, circle);
        Assert.assertTrue(result);
    }

    @Test
    public void pointInCircleShouldReturnFalseTestOne() {
        Circle circle = new Circle();
        circle.setRadius(5.0F);
        Rigidbody2D body = new Rigidbody2D();
        circle.setRigidbody(body);
        Vector2f point = new Vector2f(-6.0F, -6.0F);
        boolean result = IntersectionDetector2D.pointInCircle(point, circle);
        Assert.assertFalse(result);
    }

    @Test
    public void pointInCircleShouldReturnTrueTestFour() {
        Circle circle = new Circle();
        circle.setRadius(5.0F);
        Rigidbody2D body = new Rigidbody2D();
        body.setTransform(new Vector2f(10.0F));
        circle.setRigidbody(body);
        Vector2f point = new Vector2f(13.0F, 8.0F);
        boolean result = IntersectionDetector2D.pointInCircle(point, circle);
        Assert.assertTrue(result);
    }

    @Test
    public void pointInCircleShouldReturnTrueTestFive() {
        Circle circle = new Circle();
        circle.setRadius(5.0F);
        Rigidbody2D body = new Rigidbody2D();
        body.setTransform(new Vector2f(10.0F));
        circle.setRigidbody(body);
        Vector2f point = new Vector2f(5.1F, 10.0F);
        boolean result = IntersectionDetector2D.pointInCircle(point, circle);
        Assert.assertTrue(result);
    }

    @Test
    public void pointInCircleShouldReturnFalseTestTwo() {
        Circle circle = new Circle();
        circle.setRadius(5.0F);
        Rigidbody2D body = new Rigidbody2D();
        body.setTransform(new Vector2f(10.0F));
        circle.setRigidbody(body);
        Vector2f point = new Vector2f(4.0F, 4.0F);
        boolean result = IntersectionDetector2D.pointInCircle(point, circle);
        Assert.assertFalse(result);
    }

    @Test
    public void pointInBox2DShouldReturnTrueTestOne() {
        Box2D box = new Box2D();
        box.setSize(new Vector2f(10.0F));
        Rigidbody2D body = new Rigidbody2D();
        box.setRigidbody(body);
        Vector2f point = new Vector2f(4.0F, 4.3F);
        Assert.assertTrue(IntersectionDetector2D.pointInBox2D(point, box));
    }

    @Test
    public void pointInBox2DShouldReturnTrueTestTwo() {
        Box2D box = new Box2D();
        box.setSize(new Vector2f(10.0F));
        Rigidbody2D body = new Rigidbody2D();
        box.setRigidbody(body);
        Vector2f point = new Vector2f(-4.9F, -4.9F);
        Assert.assertTrue(IntersectionDetector2D.pointInBox2D(point, box));
    }

    @Test
    public void pointInBox2DShouldReturnFalseTestOne() {
        Box2D box = new Box2D();
        box.setSize(new Vector2f(10.0F));
        Rigidbody2D body = new Rigidbody2D();
        box.setRigidbody(body);
        Vector2f point = new Vector2f(0.0F, 5.1F);
        Assert.assertFalse(IntersectionDetector2D.pointInBox2D(point, box));
    }

    @Test
    public void pointInBox2DShouldReturnTrueTestThree() {
        Box2D box = new Box2D();
        box.setSize(new Vector2f(10.0F));
        Rigidbody2D body = new Rigidbody2D();
        body.setTransform(new Vector2f(10.0F));
        box.setRigidbody(body);
        Vector2f point = new Vector2f(14.0F, 14.3F);
        Assert.assertTrue(IntersectionDetector2D.pointInBox2D(point, box));
    }

    @Test
    public void pointInBox2DShouldReturnTrueTestFour() {
        Box2D box = new Box2D();
        box.setSize(new Vector2f(10.0F));
        Rigidbody2D body = new Rigidbody2D();
        body.setTransform(new Vector2f(10.0F));
        box.setRigidbody(body);
        Vector2f point = new Vector2f(5.1F, 5.1F);
        Assert.assertTrue(IntersectionDetector2D.pointInBox2D(point, box));
    }

    @Test
    public void pointInBox2DShouldReturnFalseTestTwo() {
        Box2D box = new Box2D();
        box.setSize(new Vector2f(10.0F));
        Rigidbody2D body = new Rigidbody2D();
        body.setTransform(new Vector2f(10.0F));
        box.setRigidbody(body);
        Vector2f point = new Vector2f(10.0F, 15.1F);
        Assert.assertFalse(IntersectionDetector2D.pointInBox2D(point, box));
    }

    @Test
    public void pointInRotatedBox2DShouldReturnTrueTestOne() {
        Box2D box = new Box2D();
        box.setSize(new Vector2f(10.0F));
        Rigidbody2D body = new Rigidbody2D();
        body.setTransform(new Vector2f(0.0F), 45.0F);
        box.setRigidbody(body);
        Vector2f point = new Vector2f(-1.0F, -1.0F);
        Assert.assertTrue(IntersectionDetector2D.pointInBox2D(point, box));
    }

    @Test
    public void pointInRotatedShouldReturnTrueTestTwo() {
        Box2D box = new Box2D();
        box.setSize(new Vector2f(10.0F));
        Rigidbody2D body = new Rigidbody2D();
        body.setTransform(new Vector2f(0.0F), 45.0F);
        box.setRigidbody(body);
        Vector2f point = new Vector2f(-3.435534F, 3.435534F);
        Assert.assertTrue(IntersectionDetector2D.pointInBox2D(point, box));
    }

    @Test
    public void pointInRotatedShouldReturnFalseTestOne() {
        Box2D box = new Box2D();
        box.setSize(new Vector2f(10.0F));
        Rigidbody2D body = new Rigidbody2D();
        body.setTransform(new Vector2f(10.0F), 45.0F);
        box.setRigidbody(body);
        Vector2f point = new Vector2f(-3.6355338F, 3.6355338F);
        Assert.assertFalse(IntersectionDetector2D.pointInBox2D(point, box));
    }

    @Test
    public void pointInRotatedBox2DShouldReturnTrueTestThree() {
        Box2D box = new Box2D();
        box.setSize(new Vector2f(10.0F));
        Rigidbody2D body = new Rigidbody2D();
        body.setTransform(new Vector2f(10.0F), 45.0F);
        box.setRigidbody(body);
        Vector2f point = new Vector2f(9.0F, 9.0F);
        Assert.assertTrue(IntersectionDetector2D.pointInBox2D(point, box));
    }

    @Test
    public void pointInRotatedShouldReturnTrueTestFour() {
        Box2D box = new Box2D();
        box.setSize(new Vector2f(10.0F));
        Rigidbody2D body = new Rigidbody2D();
        body.setTransform(new Vector2f(10.0F), 45.0F);
        box.setRigidbody(body);
        Vector2f point = new Vector2f(6.564466F, 13.435534F);
        Assert.assertTrue(IntersectionDetector2D.pointInBox2D(point, box));
    }

    @Test
    public void pointInRotatedShouldReturnFalseTestTwo() {
        Box2D box = new Box2D();
        box.setSize(new Vector2f(10.0F));
        Rigidbody2D body = new Rigidbody2D();
        body.setTransform(new Vector2f(10.0F), 45.0F);
        box.setRigidbody(body);
        Vector2f point = new Vector2f(6.364466F, 13.635534F);
        Assert.assertFalse(IntersectionDetector2D.pointInBox2D(point, box));
    }
}
