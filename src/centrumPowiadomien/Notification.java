package centrumPowiadomien;

import java.util.Objects;

abstract class Notification implements Sendable {
    private String message;

    Notification(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(message);
    }

    @Override
    public String toString() {
        return ": " + message;
    }
}
