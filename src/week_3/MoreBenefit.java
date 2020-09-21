package week_3;

public class MoreBenefit {

    public static void main(String[] args) {
        int paidByFirstWay = 0;
        float paidBySecond = 0;
        int i = 0;
        float housSallary = 0.1f;
        while(paidBySecond <= paidByFirstWay){
            paidByFirstWay += 10; //paidByFirstWay = paidByFirstWay + 10
            paidBySecond += housSallary;
            housSallary *= 2;
            i++;
        }
        System.out.println(i);
    }

}
