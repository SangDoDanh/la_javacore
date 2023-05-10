package lab.Buoi_5.bai3._3_3;

import java.util.Objects;

public class Word {
    private String word;
    private String mean;
    private String type;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word1 = (Word) o;
        return Objects.equals(word, word1.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public Word(String word, String type, String mean) {
        this.mean = mean;
        this.word = word;
        this.type = type;
    }

    public Word() {
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
