package dev.alejandra;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WeekTest {
    private Week week;

    @BeforeEach
    void setUp() {
        week = new Week();
    }

    @Test 
   
    public void getDaysOfWeek() {
        List<String> days = week.getDaysOfWeek();
        assertEquals(7, days.size());
        assertTrue(days.contains("Monday"));
    }

}
