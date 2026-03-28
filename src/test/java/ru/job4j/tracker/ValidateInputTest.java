package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.MockInput;
import ru.job4j.tracker.input.ValidateInput;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"42"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter number:");
        assertThat(selected).isEqualTo(42);
    }

    @Test
    void whenMultipleValidInputs() {
        Output output = new StubOutput();
        String[] testValues = {"5", "10", "15", "20", "25"};
        Input in = new MockInput(testValues);
        ValidateInput input = new ValidateInput(output, in);

        for (int i = 0; i < testValues.length; i++) {
            int selected = input.askInt("Enter menu:");
            assertThat(selected).isEqualTo(Integer.parseInt(testValues[i]));
        }
    }

    @Test
    void whenNegativeNumberInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"-7"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter number:");
        assertThat(selected).isEqualTo(-7);
    }
}