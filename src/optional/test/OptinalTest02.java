package optional.test;

import optional.dominio.Manga;
import optional.repository.MangaRespository;

import java.util.Optional;

public class OptinalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRespository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Manga manga = MangaRespository.findById(1).orElseThrow(IllegalArgumentException::new);

        Manga newManga = MangaRespository.findByTitle("Drifeters")
                .orElse(new Manga(3, "Drifters", 100));
        System.out.println(newManga);

        Manga newManga2 = MangaRespository.findByTitle("Komi san can't communicate")
                .orElseGet(() -> new Manga(4, "Komi san can't communicate", 300));

        System.out.println(newManga2);
    }
}
