package arrayop;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;


public class AppTest extends TestCase
{
    private App tdd; 
    public AppTest( String testName )
    {
        super( testName );
        tdd = new App();
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
    

	
	@Before
	public void init() {
		System.out.println("Before");
	}

	@After
	public void teardown() {
		System.out.println("testing done");
	}
	
	public void testRemoveDuplicateElements() {
		int[] arr = new int[] { 1, 1, 1, 2, 3, 3, 3, 4, 3, 3 };
		int[] resultArr = tdd.removeDuplicates(arr);		
		assertArrayEquals(new int[] {1, 2, 3, 4, 3, 0, 0, 0, 0, 0},  resultArr);
	
	}

	
	public void testRemoveAllElement() {
		int[] arr = new int[] { 1, 1, 1, 1, 1, 1 };
		int[] resultArr = tdd.removeDuplicates(arr);		
		assertArrayEquals(new int[] {1, 0, 0, 0, 0, 0},  resultArr);
	}

	
	public void testRemoveOnEmpty() {
		int[] arr = new int[] { };
		int[] resultArr = tdd.removeDuplicates(arr);		
		assertArrayEquals(new int[] {},  resultArr);
	}
	
	public void testRemovalOnDistinctElements() {
		int[] arr = new int[]{ 1, 2, 3, 4, 5, 6 };
		int[] resultArr = tdd.removeDuplicates(arr);
		
		assertArrayEquals(new int[]{ 1, 2, 3, 4, 5, 6 },  resultArr);
	}
}