public class SquareAndSum {

    static int squareEachAndSum(int bound) {
        int sum = 0;

        for (int i = 1; i <= bound; i++) {
            sum += i * i;
        }
        return sum;
    }

    static int sumAndSquare(int bound) {
        int sum = 0;

        for (int i = 1; i <= bound; i++) {
            sum += i;
        }
        return sum * sum;
    }

    static int differenceMethods(int bound) {

        return sumAndSquare(bound) - squareEachAndSum(bound);

    }

}
