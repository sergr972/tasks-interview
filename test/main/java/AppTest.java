package main.java;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    public void testTruncate() {
        var actual1 = App.truncate("hexlet", 3);
        assertThat(actual1).isEqualTo("hex...");

        var actual2 = App.truncate("Hello, world!", 5);
        assertThat(actual2).isEqualTo("Hello...");
    }
}