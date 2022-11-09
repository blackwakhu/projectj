public class Miscallenous{
    public static int monthleft;
    public static float interest;
    public static float dividends;
    public static  float items;
    public static int calculateTimetaken(int year1, int month1, int year2, int month2){
        int time1 = (year1 * 12) + month1;
        int time2 = (year2 * 12) + month2;
        monthleft = time1 - time2;
        return monthleft;
    }
    public static float getInterest(int timetaken, float deposit, float rate){
        interest = deposit * timetaken * rate;
        return interest;
    }
    public static float totalItems(float x, float y, float z){
        items = x + y + z;
        return  items;
    }
    public static float sumItems(float x, float y){
        items = x + y;
        return items;
    }
    public static float totatDividends(float shares, float totalshares, float income){
        float shares1 = shares/ totalshares;
        dividends = shares1 * 60/100 * income;
        return  dividends;
    }
}