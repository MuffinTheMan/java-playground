package playground.refactors.seasons;

import java.time.LocalDate;
import javax.annotation.Nonnull;

import static playground.refactors.seasons.Example.*;

public class SeasonedLocalDate {
    private final LocalDate localDate;

    public SeasonedLocalDate(@Nonnull final LocalDate localDate) {
        this.localDate = localDate;
    }

    public boolean isWinter2022() {
        return !localDate.isBefore(WINTER_2022_START) && localDate.isBefore(SPRING_2022_START);
    }

    public boolean isSpring2022() {
        return !localDate.isBefore(SPRING_2022_START) && localDate.isBefore(SUMMER_2022_START);
    }

    public boolean isSummer2022() {
        return !localDate.isBefore(SUMMER_2022_START) && localDate.isBefore(AUTUMN_2022_START);
    }

    public boolean isAutum22022() {
        return !localDate.isBefore(AUTUMN_2022_START) && localDate.isBefore(WINTER_2023_START);
    }
}
