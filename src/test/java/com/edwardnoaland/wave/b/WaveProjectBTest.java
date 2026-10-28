package com.edwardnoaland.wave.b;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaveProjectBTest {
    @Test
    public void shouldDescribeTheCalculatedValue() {
        assertEquals("project-b:7", WaveProjectB.describe(3));
    }

    @Test
    public void shouldCalculateZero() {
        assertEquals(1, WaveProjectB.calculate(0));
    }
}
