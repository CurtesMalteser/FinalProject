package builditbigger;

import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import static org.junit.Assert.*;

/**
 * Created by António "Curtes Malteser" Bastião on 24/04/2018.
 */
@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    private Context mContext;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void setup() {
        mContext = mActivityRule.getActivity().getApplicationContext();
    }

    @Test
    public void testAsyncTask() {

        String joke;

        try {
            EndpointsAsyncTask jokeTask = new EndpointsAsyncTask();
            jokeTask.execute(mContext);
            joke = jokeTask.get(30, TimeUnit.SECONDS);
            assertEquals(!joke.isEmpty(), !joke.isEmpty());
        } catch (Exception e) {
            fail("Timed out");
        }

    }
}