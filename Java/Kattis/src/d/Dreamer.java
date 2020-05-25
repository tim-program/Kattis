package d;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dreamer {
    public static String builder = "";
    public static int numValid = 0;
    public static int[] earliestDate = { 99, 99, 9999 };
    public static Set set = new HashSet<String>();

    public static void main(String[] args) {
        //incorrect
        Scanner console = new Scanner(System.in);
        int cases = console.nextInt();//between 1 and 50 both inclusive
        //int cases = 1;
        for (int i = 0; i < cases; i++) {
            String date = console.next() + console.next() + console.next();
            numValidDates(date);
            if (earliestDate[0] == 99) {
                System.out.println(numValid);
            } else {
                System.out.printf("%d %02d %02d %d%n", set.size(),
                        earliestDate[1], earliestDate[0], earliestDate[2]);
            }

            numValid = 0;
            builder = "";
            earliestDate[0] = 99;
            earliestDate[1] = 99;
            earliestDate[2] = 9999;
            set = new HashSet<String>();
        }
    }

    public static void numValidDates(String date) {

        for (int i = 0; i < date.length(); i++) {
            String next = (date.substring(i) + date.substring(0, i));
            builder += next.charAt(0);

            if (builder.length() == 8) {
                int dd = Integer.parseInt(builder.substring(0, 2));
                int mm = Integer.parseInt(builder.substring(2, 4));
                int yyyy = Integer.parseInt(builder.substring(4));
                if (isValidDate(mm, dd, yyyy)) {
                    set.add(builder);
                    ed(mm, dd, yyyy);
                }
            }

            numValidDates(next.substring(1));
            builder = builder.substring(0, builder.length() - 1);
        }
    }

    public static boolean isValidDate(int month, int day, int year) {
        if (year >= 2000) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day >= 1 && day <= 31) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day >= 1 && day <= 30) {
                        return true;
                    }
                    break;
                case 2:
                    if ((year % 400 == 0)
                            || !(year % 100 == 0 && year % 400 != 0)
                            || (year % 4 == 0 && year % 100 != 0)
                            || !(year % 4 == 0)) {
                        if (day >= 1 && day <= 29) {//is leap year
                            return true;
                        } else {
                            if (day >= 1 && day <= 28) {//isn't leap year
                                return true;
                            }
                        }
                    }

                    break;
                default:
                    return false;

            }
        }
        return false;
    }

    public static void ed(int month, int day, int year) {
        if (year < earliestDate[2]) {
            earliestDate[0] = month;
            earliestDate[1] = day;
            earliestDate[2] = year;
        }
        if (year == earliestDate[2] && month < earliestDate[0]) {
            earliestDate[0] = month;
            earliestDate[1] = day;
            earliestDate[2] = year;
        }
        if (year == earliestDate[2] && month == earliestDate[0]) {
            if (day <= earliestDate[1]) {
                earliestDate[0] = month;
                earliestDate[1] = day;
                earliestDate[2] = year;
            }
        }
    }

}
