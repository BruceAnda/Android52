package zhaoliang.com.android52.junit;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhaoliang on 2017/4/19.
 */
@RunWith(AndroidJUnit4.class)
public class UseJunit {

    @Test
    public void testAssert() {
        //assertEquals(3, 4);
        assertEquals(3, 3);
    }
}
