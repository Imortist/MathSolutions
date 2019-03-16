import java.util.BitSet;
import java.util.stream.IntStream;

 class MathSolutions {


     static IntStream stream() {
        final int limit = 100_000_000;
        final BitSet sieve = new BitSet(limit + 1);
        return IntStream.rangeClosed(2, limit)
                .filter(x -> !sieve.get(x))
                .peek(x -> {
                    if (x * x < limit)
                        for (int i = x; i <= limit; i += x)
                            sieve.set(i);
                });
    }
}
