package com.example.tomas1207.resturante;

import com.example.tomas1207.resturante.Core.Admin;
import com.example.tomas1207.resturante.Core.Pessoas;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void AdminCheck_Isadmin_true(){
        Admin admin = new Admin();
        assertTrue(admin.AdminCheck(new Pessoas("Tomas","Fernandes",20,true)));
    }
}