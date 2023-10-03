package lambdas.test;

import lambdas.dominio.Anime;
import lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instace method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berkserk", 75), new Anime("One piece", 1000), new Anime("Nartuo", 500), new Anime("Komi san can't communicate", 22)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

    }
}
