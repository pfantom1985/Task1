package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class VotingResults {
//TODO singleton
    private static List<Vote> votes;

    public VotingResults(List<Vote> votes) {
        this.votes = votes;
    }
/*
    public VotingResults() {
    }

    public String getBestSinger() {
        Map<String, Long> singerVotes = votes.stream()
                .collect(Collectors.groupingBy(Vote::getArtist, Collectors.counting()));
        return singerVotes.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public String getBestGenre() {
        Map<String, Long> genreVotes = votes.stream()
                .collect(Collectors.groupingBy(Vote::getGenre, Collectors.counting()));
        return genreVotes.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public List<Vote> getSortedVotesByDateTime() {
        return votes.stream()
                .sorted(Comparator.comparing(Vote::getDateTime))
                .collect(Collectors.toList());
    }

    public void printSummary() {
        System.out.println("Лучший музыкальный исполнитель: " + getBestSinger());
        System.out.println("Лучший музыкальный жанр: " + getBestGenre());
        System.out.println("Краткий текст отсортированный по дате и времени голосования:");
        getSortedVotesByDateTime().forEach(vote ->
                System.out.println(vote.getDateTime() + " - " + vote.getAbout() + " проголосовал за " + vote.getArtist()));
    }
 */
}