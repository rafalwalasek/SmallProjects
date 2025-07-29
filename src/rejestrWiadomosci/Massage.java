package rejestrWiadomosci;

import java.util.Objects;

abstract class Massage implements Sendable {
    private String content;

    Massage(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Massage massage = (Massage) o;
        return Objects.equals(content, massage.content);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(content);
    }

    @Override
    public String toString() {
        return " " + content;
    }
}
