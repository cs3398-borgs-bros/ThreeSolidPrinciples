package borgs;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {

    private Worker w = new Worker();
	/*
    @Test
    @DisplayName("Work Method Test")
    public void testWorkMethod()
    {
        assertEquals(w.work(), "working...", "Mismatch between test text and method text");
    }
	*/
	
	@Test
    @DisplayName("Passing Work Method Test")
    public void newtestWGWorkerPass()
    {
        assertEquals(w.work(), "Worker Walter is working...", "Mismatch between test text and method text");
    }
	
	@Test
    @DisplayName("Failing Work Method Test")
    public void newtestWGWorkerFail()
    {
        assertEquals(w.work(), "Worker Walter is not working...", "Mismatch between test text and method text");
    } 
    
}
