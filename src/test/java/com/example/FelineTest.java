package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void testEatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
    @Test
    public void testGetFamily() {
        feline.getFamily();
        Mockito.verify(feline, Mockito.times(1)).getFamily();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        feline.getKittens();
        Mockito.verify(feline).getKittens(1);
        assertEquals(1, feline.getKittens());
    }
    @Test
    public void testGetKittensCount() {
        int kittensCount = 3;
        feline.getKittens(kittensCount);
        Mockito.verify(feline).getKittens(Mockito.anyInt());
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }

}
