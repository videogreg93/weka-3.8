package weka;

import junit.framework.Test;
import junit.framework.TestSuite;
import weka.clusterers.SimpleKMeansTest;
import weka.core.Debug;

public class TP1Tests extends TestSuite{

    public static Test suite() {
        TestSuite suite = new TestSuite();



        return suite;
    }

    public static void main(String[] args) {
        //junit.textui.TestRunner.run(suite());
        SimpleKMeansTest simpleKMeansTest = new SimpleKMeansTest("simpleKMeansTest");
        try {
            simpleKMeansTest.testRegression();
        } catch (Exception e) {
            System.out.println("simpleKMeans");
        }
    }
}
