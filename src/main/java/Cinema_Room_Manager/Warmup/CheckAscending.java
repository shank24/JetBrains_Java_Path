package Cinema_Room_Manager.Warmup;

public class CheckAscending {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,9,7,8};

        System.out.println(checkBroken(numbers));
    }

    private static boolean checkBroken(int[] numbers) {
        boolean broken = false;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
               broken = true;
               break;
            }
        }

        if(broken) {
            return true;
        }
        else{
            return false;
        }

    }
}
