package lambdas.dominio;

public class Anime {
    private String title;
    private Integer episodes;


    public Anime(String title, Integer quantity) {
        this.title = title;
        this.episodes = quantity;
    }

    public String getTitle() {
        return title;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", quantity=" + episodes +
                '}';
    }
}
