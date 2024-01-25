package Dto;

import java.util.Objects;

public class WordDto {
    private String word;
    private  Integer count;

    public WordDto(String word, Integer count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WordDto that)) return false;
        return Objects.equals(word, that.word) && Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, count);
    }

    @Override
    public String toString() {
        return "WordDto{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }
}
