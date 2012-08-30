package mikera.vector;

import static org.junit.Assert.*;
import mikera.vector.Vector;

import org.junit.Test;


public class TestVector {
	@Test public void testSubVectors() {
		double[] data=new double[100];
		for (int i=0; i<100; i++) data[i]=i;
		
		Vector v=new Vector(data);
		assertEquals(10,v.get(10),0.0);
		
		Vector v2=v.subVector(5, 90);
		assertEquals(90,v2.length);
		assertEquals(15,v2.get(10),0.0);
		
		Vector v3=v2.subVector(5,80);
		assertEquals(20,v3.get(10),0.0);
		
		v3.set(10, -99);
		assertEquals(-99,v.get(20),0.0);

	}
}
