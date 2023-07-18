package com.quest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    private String name;
    private int gamesPlayed;
    public void incrementGamesPlayed() {
        gamesPlayed++;
    }
}
