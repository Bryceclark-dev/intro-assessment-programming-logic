package com.kenzie.app;

import com.kenzie.app.Main;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeAll
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @BeforeEach
    public void setTestInput() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void test_Largest(){
        Main.main(new String[]{});
        assertThat(outContent.toString(), containsString("Largest Number: 940"));
    }

    @Test
    public void test_Smallest(){
        Main.main(new String[]{});
        assertThat(outContent.toString(), containsString("Smallest Number: 20"));
    }

    @Test
    public void test_Sum(){
        Main.main(new String[]{});
        assertThat(outContent.toString(), containsString("Sum: 9096"));
    }

    @Test
    public void test_Average(){
        Main.main(new String[]{});
        assertThat(outContent.toString(), containsString("Average: 454.8"));
    }

    @Test
    public void test_EvenNumbers(){
        Main.main(new String[]{});
        assertThat(outContent.toString(), containsString("Even Numbers: [244, 758, 450, 302, 20, 712, 456, 398, 882, 848, 940, 472]"));
    }

    @Test
    public void test_OddNumbers(){
        Main.main(new String[]{});
        assertThat(outContent.toString(), containsString("Odd Numbers: [469, 755, 245, 71, 21, 339, 179, 535]"));
    }

    @Test
    public void test_NumbersDivisibleByEight(){
        Main.main(new String[]{});
        assertThat(outContent.toString(), containsString("Numbers divisible by 8: [712, 456, 848, 472]"));
    }
}
