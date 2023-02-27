public class fiboocinumber {
    public static void main(String[] args) {
        int n = 6, firstnum = 0, secondnum = 1;
        System.out.println("Fibonacci yill" + n + "terms");
        int i;
        for (i = 1; i<=n ; ++i){
            System.out.println(firstnum + ",");
            int nextnum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextnum;

        }
    }
}
