package playground.refactors.seasons;

import java.time.LocalDate;
import javax.annotation.Nonnull;

public class Example {
    private enum Season {
        WINTER_2022,
        SPRING_2022,
        SUMMER_2022,
        AUTUMN_2022,
    }
    private final static LocalDate WINTER_2022_START = LocalDate.of(2021, 12, 21); // Dec 21
    private final static LocalDate SPRING_2022_START = LocalDate.of(2022, 3, 20); // Mar 20
    private final static LocalDate SUMMER_2022_START = LocalDate.of(2022, 6, 21); // Jun 21
    private final static LocalDate AUTUMN_2022_START = LocalDate.of(2022, 9, 22); // Sep 22
    private final static LocalDate WINTER_2023_START = LocalDate.of(2022, 12, 21); // Dec 21

    static void doSeasonalThingsSimpleConditional(@Nonnull final LocalDate date) {
        if (!date.isBefore(WINTER_2022_START) && date.isBefore(SPRING_2022_START)) {
            // It's winter 2022!
        } else if (!date.isBefore(SPRING_2022_START) && date.isBefore(SUMMER_2022_START)) {
            // It's spring 2022!
        } else if (!date.isBefore(SUMMER_2022_START) && date.isBefore(AUTUMN_2022_START)) {
            // It's summer 2022!
        } else if (!date.isBefore(AUTUMN_2022_START) && date.isBefore(WINTER_2023_START)) {
            // It's autumn 2022!
        }
    }

    static void doSeasonalThingsDecomposedConditional(@Nonnull final LocalDate date) {
        if (isWinter2022(date)) {
            // It's winter 2022!
        } else if (isSpring2022(date)) {
            // It's spring 2022!
        } else if (isSummer2022(date)) {
            // It's summer 2022!
        } else if (isAutum22022(date)) {
            // It's autumn 2022!
        }
    }

    static void doSeasonalThingsDecomposedConditionalComposition(@Nonnull final SeasonedLocalDate date) {
        if (date.isWinter2022()) {
            // It's winter 2022!
        } else if (date.isSpring2022()) {
            // It's spring 2022!
        } else if (date.isSummer2022()) {
            // It's summer 2022!
        } else if (date.isAutum22022()) {
            // It's autumn 2022!
        }
    }

    static void doSeasonalThingsEnumSwitch(@Nonnull final LocalDate date) {
        switch (getSeason(date)) {
            case WINTER_2022:
                // It's winter 2022!
                break;
            case SPRING_2022:
                // It's spring 2022!
                break;
            case SUMMER_2022:
                // It's summer 2022!
                break;
            case AUTUMN_2022:
                // It's autumn 2022!
                break;
        }
    }

    public static boolean isWinter2022(@Nonnull final LocalDate date) {
        return !date.isBefore(WINTER_2022_START) && date.isBefore(SPRING_2022_START);
    }

    public static boolean isSpring2022(@Nonnull final LocalDate date) {
        return !date.isBefore(SPRING_2022_START) && date.isBefore(SUMMER_2022_START);
    }

    public static boolean isSummer2022(@Nonnull final LocalDate date) {
        return !date.isBefore(SUMMER_2022_START) && date.isBefore(AUTUMN_2022_START);
    }

    public static boolean isAutum22022(@Nonnull final LocalDate date) {
        return !date.isBefore(AUTUMN_2022_START) && date.isBefore(WINTER_2023_START);
    }

    private static Season getSeason(@Nonnull final LocalDate date) {
        if (!date.isBefore(WINTER_2022_START) && date.isBefore(SPRING_2022_START)) {
            return Season.WINTER_2022;
        } else if (!date.isBefore(SPRING_2022_START) && date.isBefore(SUMMER_2022_START)) {
            return Season.SPRING_2022;
        } else if (!date.isBefore(SUMMER_2022_START) && date.isBefore(AUTUMN_2022_START)) {
            return Season.SUMMER_2022;
        } else if (!date.isBefore(AUTUMN_2022_START) && date.isBefore(WINTER_2023_START)) {
            return Season.AUTUMN_2022;
        }
        throw new RuntimeException("Unknown season");
    }
}
