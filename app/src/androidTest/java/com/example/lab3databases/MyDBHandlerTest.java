package com.example.lab3databases;

import static android.app.PendingIntent.getActivity;
import static org.junit.Assert.*;
import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDBHandlerTest {
    private Context context;
    private MyDBHandler q, b;
    @Before
    public void setUp() {
        context = InstrumentationRegistry.getInstrumentation().getTargetContext();
        q = new MyDBHandler(context);
        b = new MyDBHandler(context);
    }
    @Test
    public void test_Add_item() {
        Product x = new Product("test", 5);
        q.addProduct(x);
        assertEquals(1, q.getSize());
    }

    @Test
    public void test_Delete_item(){
        Product x = new Product("test2", 10);
        b.addProduct(x);
        assertEquals(1, b.getSize());
        b.deleteProduct("test2");
        assertEquals(0, b.getSize());

    }
    @After
    public void tear_down() {
        context = null;
        q.deleteAll();
        b.deleteAll();
        q.close();
        b.close();

    }
}