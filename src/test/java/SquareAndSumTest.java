import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SquareAndSumTest {

    @Test
    void squareEachAndSum3() {
        //given
        int bound = 3;

        //when
        int sum = SquareAndSum.squareEachAndSum(bound);

        //try
        Assert.assertThat(sum, CoreMatchers.is(14));

    }

    @Test
    void sumAndSquare3() {
        //given
        int bound = 3;

        //when
        int sum = SquareAndSum.sumAndSquare(bound);

        //try
        Assert.assertThat(sum, CoreMatchers.is(36));
    }

    @Test
    void differenceMethods3() {
        //given
        int bound = 3;

        //when
        int difference = SquareAndSum.differenceMethods(bound);

        //try
        Assert.assertThat(difference, CoreMatchers.is(22));
    }

    @Test
    void squareEachAndSum10() {
        //given
        int bound = 10;

        //when
        int sum = SquareAndSum.squareEachAndSum(bound);

        //try
        Assert.assertThat(sum, CoreMatchers.is(385));

    }

    @Test
    void sumAndSquare10() {
        //given
        int bound = 10;

        //when
        int sum = SquareAndSum.sumAndSquare(bound);

        //try
        Assert.assertThat(sum, CoreMatchers.is(3025));
    }

    @Test
    void differenceMethods10() {
        //given
        int bound = 10;

        //when
        int difference = SquareAndSum.differenceMethods(bound);

        //try
        Assert.assertThat(difference, CoreMatchers.is(2640));
    }

    @Test
    void squareEachAndSum6() {
        //given
        int bound = 6;

        //when
        int sum = SquareAndSum.squareEachAndSum(bound);

        //try
        Assert.assertThat(sum, CoreMatchers.is(91));

    }

    @Test
    void sumAndSquare6() {
        //given
        int bound = 6;

        //when
        int sum = SquareAndSum.sumAndSquare(bound);

        //try
        Assert.assertThat(sum, CoreMatchers.is(441));
    }

    @Test
    void differenceMethods6() {
        //given
        int bound = 6;

        //when
        int difference = SquareAndSum.differenceMethods(bound);

        //try
        Assert.assertThat(difference, CoreMatchers.is(350));
    }

}