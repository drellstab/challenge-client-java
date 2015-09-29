package com.zuehlke.jasschallenge.client.game.mode;

import com.zuehlke.jasschallenge.client.game.Move;
import com.zuehlke.jasschallenge.client.game.Player;
import com.zuehlke.jasschallenge.client.game.cards.Card;
import com.zuehlke.jasschallenge.client.game.cards.Color;

import java.util.List;
import java.util.Set;

public interface Mode {

    static Mode topdown() { return new TopDownMode(); }
    static Mode trump(Color color) { return new TrumpfColorMode(color); }

    TrumpfName getTrumpfName();

    Color getTrumpfColor();

    int calculateScore(Set<Card> playedCards);

    Player determineWinner(List<Move> moves);

    boolean canPlayCard(Card card, Set<Card> alreadyPlayedCards, Color currentRoundColor, Set<Card> playerCards);
}