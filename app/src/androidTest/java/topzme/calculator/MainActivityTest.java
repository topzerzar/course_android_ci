package topzme.calculator;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    static final String ONE = "1";
    static final String TWO = "2";
    static final String RESULT_PLUS = "3.0";
    static final String RESULT_MINUS = "1.0";
    static final String RESULT_MULTIPLY = "2.0";
    static final String RESULT_DIVIDE = "1.0";

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void add() {
        onView(withId(R.id.operand_one_edit_text)).perform(typeText(TWO));
        onView(withId(R.id.operand_two_edit_text)).perform(typeText(ONE));
        onView(withId(R.id.plus_button)).perform(click());
        onView(withId(R.id.text_result)).check(matches(withText(RESULT_PLUS)));
    }

    public void minus() {
        onView(withId(R.id.operand_one_edit_text)).perform(typeText(TWO));
        onView(withId(R.id.operand_two_edit_text)).perform(typeText(ONE));
        onView(withId(R.id.minus_button)).perform(click());
        onView(withId(R.id.text_result)).check(matches(withText(RESULT_MINUS)));
    }

    public void multiply() {
        onView(withId(R.id.operand_one_edit_text)).perform(typeText(ONE));
        onView(withId(R.id.operand_two_edit_text)).perform(typeText(ONE));
        onView(withId(R.id.multiply_button)).perform(click());
        onView(withId(R.id.text_result)).check(matches(withText(RESULT_MULTIPLY)));
    }

    public void divide() {
        onView(withId(R.id.operand_one_edit_text)).perform(typeText(ONE));
        onView(withId(R.id.operand_two_edit_text)).perform(typeText(ONE));
        onView(withId(R.id.divide_button)).perform(click());
        onView(withId(R.id.text_result)).check(matches(withText(RESULT_DIVIDE)));
    }

}