package onboarding;

import java.util.List;

class Problem1 {

    private static final int pobiWin = 1;
    private static final int crongWin = 2;
    private static final int draw = 0;
    private static final int exception = -1;

    public static int solution(List<Integer> pobi, List<Integer> crong) {

        Integer exception1 = exceptionOccur(pobi, crong);
        if (exception1 != null){
            return exception1;
        }

        int pobiValue = maxValue(pobi);
        int crongValue = maxValue(crong);

        if (pobiValue < crongValue){
            return crongWin;
        }

        if (pobiValue > crongValue){
            return pobiWin;
        }

        return draw;
    }

    private static Integer exceptionOccur(List<Integer> pobi, List<Integer> crong) {
        if (pobi.size() != 2 || crong.size() !=2){
            return exception;
        }
        if (Math.abs(pobi.get(1) - pobi.get(0)) != 1 || Math.abs(crong.get(1) - crong.get(0)) != 1){
            return exception;
        }
        return null;
    }

    public static int maxValue(List<Integer> pageNumbers){
        int sumValue = sum(pageNumbers);
        int multipleValue = multiple(pageNumbers);

        if(sumValue < multipleValue){
            return multipleValue;
        }

        else{
            return sumValue;
        }
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