/*

Exercise 17 — Current Time (GMT)
Description: Display the current time in GMT (Greenwich Mean Time) using the system
clock. The program uses the value of System.currentTimeMillis() which returns the mil
liseconds elapsed since January 1, 1970 (UTC epoch), and converts it to current hours, min
utes, and seconds. Input: *No user input.* Output: The current time in hours:minutes:seconds
(GMT). Sample run:

Current time (GMT): 15:40:30

===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 17 - Current Time (GMT)
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-17
 Description: This program calculates the current time 
              in GMT by converting total milliseconds 
              since the Unix Epoch (Jan 1, 1970) into 
              hours, minutes, and seconds.
===================================================
*/

public class Exercise17 {
    public static void main(String[] args) {
        
        // 1. الحصول على إجمالي الملي ثواني من النظام 
        long totalMilliseconds = System.currentTimeMillis();

        // 2. تحويل الملي ثواني إلى إجمالي ثواني 
        long totalSeconds = totalMilliseconds / 1000;

        // 3. استخراج الثواني الحالية (باقي القسمة على 60) 
        int currentSecond = (int) (totalSeconds % 60);

        // 4. تحويل إجمالي الثواني إلى إجمالي دقائق 
        long totalMinutes = totalSeconds / 60;

        // 5. استخراج الدقائق الحالية (باقي القسمة على 60) 
        int currentMinute = (int) (totalMinutes % 60);

        // 6. تحويل إجمالي الدقائق إلى إجمالي ساعات 
        long totalHours = totalMinutes / 60;

        // 7. استخراج الساعة الحالية (باقي القسمة على 24 للحصول على نظام 24 ساعة) 
        int currentHour = (int) (totalHours % 24);

        // 8. عرض النتيجة النهائية بتوقيت جرينتش 
        System.out.println("Current time (GMT): " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}