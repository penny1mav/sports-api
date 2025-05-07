package com.example.sportsapi.entity;

import com.example.sportsapi.entity.enums.Sport;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity

@Table(name="matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    //TODO: add table's variable name
    @Column(name = "description")
    private String description;

    @Column(name = "match_date")
    private LocalDate matchDate;

    private LocalTime matchTime;

    private String teamA;

    private String teamB;

    private Sport sport;


    public Match(String description, LocalDate matchDate, LocalTime matchTime, String teamA, String teamB, Sport sport) {
        this.description = description;
        this.matchDate = matchDate;
        this.matchTime = matchTime;
        this.teamA = teamA;
        this.teamB = teamB;
        this.sport = sport;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public LocalTime getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(LocalTime matchTime) {
        this.matchTime = matchTime;
    }

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

}
