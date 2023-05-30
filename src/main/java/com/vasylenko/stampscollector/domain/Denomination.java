package com.vasylenko.stampscollector.domain;

import java.util.EnumMap;
import java.util.Map;

public class Denomination {

  public enum CharacterList {
    P,
    L,
    G,
    M,
    V,
    F,
    X,
    T,
    H,
    D,
    Z,
    W,
    U,
    A
  }

    public static final EnumMap<CharacterList, String> denominationMap = new EnumMap<>(Map.ofEntries(
            Map.entry(CharacterList.P, "2,00 USD"),
            Map.entry(CharacterList.L, "15,00 UAH"),
            Map.entry(CharacterList.G, "0,80 USD"),
            Map.entry(CharacterList.M, "18,00 UAH"),
            Map.entry(CharacterList.V, "12,00 UAH"),
            Map.entry(CharacterList.F, "23,00 UAH"),
            Map.entry(CharacterList.X, "40,00 UAH"),
            Map.entry(CharacterList.T, "6,00 UAH"),
            Map.entry(CharacterList.H, "0,50 UAH"),
            Map.entry(CharacterList.D, "11,00 UAH"),
            Map.entry(CharacterList.Z, "1 дол. USD"),
            Map.entry(CharacterList.W, "1,5 USD"),
            Map.entry(CharacterList.U, "12,00 USD"),
            Map.entry(CharacterList.A, "1 USD")
    ));
}
