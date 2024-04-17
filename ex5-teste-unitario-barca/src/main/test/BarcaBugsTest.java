package com.bcopstein.ex5testeunitariobarca;

import java.beans.Transient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BarcaBugsTest {
    BarcaBugs BarcaBugs = new BarcaBugs();

    @Test
    public void Test1() {
        int result = BarcaBugs.ocupaLugar(F02A32);
        Assertions.assertEquals(3, result);
    }
    
}