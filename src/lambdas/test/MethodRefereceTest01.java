package lambdas.test;

import lambdas.dominio.Anime;
import lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to a static method
public class MethodRefereceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berkserk", 75), new Anime("One piece", 1000), new Anime("Nartuo", 500), new Anime("Komi san can't communicate", 22)));
        //Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        //animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
