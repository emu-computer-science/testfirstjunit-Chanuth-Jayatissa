package testingDates;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DateSetDateTest {

    // Test a legal change: change the date to a valid date.
    @Test
    public void testLegalSetDate() {
        // Start with a valid date using the int-based constructor: January 15, 2020.
        Date date = new Date(1, 15, 2020);
        // Set to a legal date: March 12, 2021.
        date.setDate("March", 12, 2021);
        // Create an expected date using the int-based constructor (assuming March is month 3).
        Date expected = new Date(3, 12, 2021);
        assertEquals("Legal date change did not update the date as expected.", expected, date);
    }
    
    // Test an illegal change: attempting to set February 30 (illegal since February always has 28 days).
    @Test
    public void testIllegalSetDate_February30() {
        // Start with a valid February date, say February 10, 2020.
        Date date = new Date(2, 10, 2020);
        // Attempt to change to an illegal date: February 30, 2020.
        date.setDate("February", 30, 2020);
        // The date should remain unchanged.
        Date expected = new Date(2, 10, 2020);
        assertEquals("Illegal date (February 30) should not alter the original date.", expected, date);
    }
    
    // Test another illegal change: setting November 31, when November has only 30 days.
    @Test
    public void testIllegalSetDate_November31() {
        // Start with a valid November date, for example November 15, 2020.
        Date date = new Date(11, 15, 2020);
        // Attempt to change to an illegal date: November 31, 2020.
        date.setDate("November", 31, 2020);
        // The original date should remain unchanged.
        Date expected = new Date(11, 15, 2020);
        assertEquals("Illegal date (November 31) should not alter the original date.", expected, date);
    }
    
    // Additional test: legal change to the end of the month.
    @Test
    public void testLegalSetDate_EndOfMonth() {
        // Start with a valid date, for example April 10, 2020.
        Date date = new Date(4, 10, 2020);
        // Set to a legal date: April 30, 2020 (April has 30 days).
        date.setDate("April", 30, 2020);
        // Expected date is April 30, 2020.
        Date expected = new Date(4, 30, 2020);
        assertEquals("Legal change to the end of the month did not update correctly.", expected, date);
    }
}
