public class Main {
    public static void main(String[] args) {
        int[] analytics = {1, 4, 7, 9};
        SalesManager salesManager = new SalesManager(analytics);
        System.out.println(salesManager.trimmedMean());
    }
}
