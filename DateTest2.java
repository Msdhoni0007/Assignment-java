import java.util.*;
public class DateTest2 {
private int month;
private int day;
private int year;
public DateTest2(int myDay,int myMonth, int myYear) {

month = myMonth;
day = myDay;
year = myYear;
}

public void setMonthDate(int myMonth) {
month = myMonth;
}

public int getMonthDate() {
return month;
}

public void setDayDate(int myDay) {
day = myDay;
}

public int getDayDate() {
return month;
}

public void setYearDate(int myYear) {
year = myYear;
}

public int getYearDate() {
return year;
}

public void displayDate() {
System.out.printf("%d/%d/%d", day,month,year);
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
DateTest2 myDate = new DateTest2(9, 11, 1986);
System.out.println("The default date is:");
myDate.displayDate();
System.out.println();

System.out.println("Enter The Day");
int myDay = input.nextInt();
myDate.setDayDate(myDay);

System.out.println("Enter the Month");
int myMonth = input.nextInt();
myDate.setMonthDate(myMonth);

System.out.println("Enter the year");
int myYear = input.nextInt();
myDate.setYearDate(myYear);
System.out.println("The new date is: "+myDate.displayDate());

}
}


