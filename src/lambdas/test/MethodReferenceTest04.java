package lambdas.test;

import lambdas.dominio.Anime;
import lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators  animeComparators = newAnimeComparators.get();

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berkserk", 75), new Anime("One piece", 1000), new Anime("Nartuo", 500), new Anime("Komi san can't communicate", 22)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);

        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("The Duck of the death and his maid", 22));
    }
}
