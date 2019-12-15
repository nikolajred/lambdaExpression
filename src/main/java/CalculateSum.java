@FunctionalInterface
interface CalculateSum {
    int calcSum(int a, int b);

    default void print() {
        System.out.println("default method");
    }

}