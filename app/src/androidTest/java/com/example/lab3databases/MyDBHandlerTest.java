package com.example.lab3databases;

import static android.app.PendingIntent.getActivity;
import static org.junit.Assert.*;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;

public class MyDBHandlerTest {

    //@Before
    //public void setUp() {
    //    Context context = ApplicationProvider.getApplicationContext();
    //}
    @Test
    public void test_Add_item() {
        MyDBHandler db = new MyDBHandler(InstrumentationRegistry.getInstrumentation().getTargetContext());
        Product x = new Product("test", 5);
        db.addProduct(x);
        assertEquals(1, db.getSize());
    }
}