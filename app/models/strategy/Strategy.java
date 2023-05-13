package models.strategy;

import java.util.stream.IntStream;

public interface Strategy {
    int selectCard(int prizeCard, IntStream hand, int maxCard);
}
