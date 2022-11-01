package playground.refactors.seasons;

import java.time.LocalDate;
import javax.annotation.Nonnull;

public class SeasonedLocalDate {
    private final LocalDate localDate;

    public SeasonedLocalDate(@Nonnull final LocalDate localDate) {
        this.localDate = localDate;
    }

    public boolean isWinter2022() {
        return Example.isWinter2022(localDate);
    }

    public boolean isSpring2022() {
        return Example.isSpring2022(localDate);
    }

    public boolean isSummer2022() {
        return Example.isSummer2022(localDate);
    }

    public boolean isAutum22022() {
        return Example.isAutum22022(localDate);
    }
}
