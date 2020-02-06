import static java.lang.System.out;

public class codingbat{
    public static void main(String[] args){
        codingbat test = new codingbat();
        out.print(test.makeBricks(3,2,10));
    }
    public boolean makeBricks(int small, int big, int goal) {
        int totalSmallInches = small*1;
        int totalBigInches = big*5;
        boolean bothExist = (small > 0 && big > 0);
        boolean bigBiggerThanGoal = totalBigInches >= goal;
        boolean smallBiggerThanGoal = totalSmallInches >= goal;
        int total = totalSmallInches+totalBigInches;

        //I want to do a for loop now, or a while loop. Maybe recursion?
        while 

        // if (totalSmallInches >= goal)
        //     return true;
        // else if (bothExist && (goal-totalSmallInches)%5 == 0)
        //     return true;
        // else if (bigBiggerThanGoal && goal%5 == 0)
        //     return true;
        // return false;
    }

}