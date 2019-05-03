package borgs;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {

    private Worker w = new Worker();

    @Test
    @DisplayName("Work Method Test")
    public void testWorkMethod()
    {
        assertEquals(w.work(), "working...", "Mismatch between test text and method text");
    }

    @Test
    @DisplayName("Worker Eat + Sick Method Test")
    public void newtestDLWorkerPass() 
    {
        String msg = w.eat() + w.sick();
        assertTrue(msg.equals("eating...sick..."));
    }
    
    @Test
    @DisplayName("Worker Object NULL Test")
    public void newtestDLWorkerFail() 
    {
        assertNull(w);
    }
}
