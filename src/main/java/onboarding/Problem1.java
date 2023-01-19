package onboarding;

import java.util.List;

class Problem1 {

    private static final int pobiWin = 1;
    private static final int crongWin = 2;
    private static final int draw = 0;
    private static final int exception = -1;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        return 0;
    }

    public static int sum(List<Integer> pageNumbers){
        int maxSumNumber = 0;
        for(int i=0; i< pageNumbers.size(); i++){
            int pageNumber = pageNumbers.get(i);
            int sum = 0;
            while(true){
                if (pageNumber<=0){
                    break;
                }
                sum += pageNumber%10;
                pageNumber = (int)(pageNumber/10);
            }
            maxSumNumber = sum;
        }
        return maxSumNumber;
    }

    public static int multiple(List<Integer> pageNumbers){
        int maxMultiplyNumber = 0;
        for(int i=0; i< pageNumbers.size(); i++){
            int pageNumber = pageNumbers.get(i);
            int sum = 1;
            while(true){
                if (pageNumber<=0){
                    break;
                }
                sum *= pageNumber%10;
                pageNumber = (int)(pageNumber/10);
            }
            maxMultiplyNumber = sum;
        }
        return maxMultiplyNumber;
    }
}