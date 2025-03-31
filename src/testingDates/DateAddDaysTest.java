package testingDates;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DateAddDaysTest {

    // Test adding a day within the same month.
    @Test
    public void testStayInSameMonth() {
        Date startDate = new Date("June", 10, 2019);
        startDate.addOneDay();
        Date expectedDate = new Date("June", 11, 2019);
        assertEquals("The date should advance one day within the same month.", 
                     expectedDate, startDate);
    }
    
    // Test that the method returns the updated Date object when staying in the same month.
    @Test
    public void testReturnValueSameMonth() {
        Date startDate = new Date("June", 10, 2019);
        Date returnedDate = startDate.addOneDay();
        Date expectedDate = new Date("June", 11, 2019);
        assertEquals("addOneDay() should return the updated date.", 
                     expectedDate, returnedDate);
    }
    
    // Test crossing the boundary of a month (e.g., May 31 to June 1).
    @Test
    public void testCrossMonthBoundary() {
        Date startDate = new Date("May", 31, 2019);
        startDate.addOneDay();
        Date expectedDate = new Date("June", 1, 2019);
        assertEquals("The date should roll over to the next month.", 
                     expectedDate, startDate);
    }
    
    // Test crossing the boundary of a year (e.g., December 31 to January 1 of the next year).
    @Test
    public void testCrossYearBoundary() {
        Date startDate = new Date("December", 31, 2019);
        startDate.addOneDay();
        Date expectedDate = new Date("January", 1, 2020);
        assertEquals("The date should roll over to the next year.", 
                     expectedDate, startDate);
    }
}
