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
    @DisplayName("Should get the days of the week")
    public void testgetDaysOfWeek() {
        List<String> days = week.getDaysOfWeek();
        assertEquals(7, days.size());
        assertTrue(days.contains("Monday"));
    }

    @Test 
    @DisplayName("Should get the size of the list")
    public void testGetListSize() {
        assertEquals(7, week.getListSize());
    }

    @Test 
    @DisplayName("Should delete a day")
    public void testDeleteDay() {
        assertTrue(week.deleteDay("Monday"));
    }

    @Test
    public void testSort() {
        week.sort();
        List <String> days = week.getDaysOfWeek();
        assertEquals("Friday", days.get(0));
        assertEquals("Wednesday", days.get(6));
    }

}
