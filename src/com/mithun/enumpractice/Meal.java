package com.mithun.enumpractice;

/**
 * <h1>Constant anonymous class practice</h1>
 * Created by Mithun Kumer Ghose on 3/31/2016.
 */
public enum Meal {

    BREAKFAST(7,30) {
        @Override
        double mealPrices(Day day) {
            double breakfastPrice = 10.50;
            if (day.equals(Day.SATURDAY) || day == Day.SUNDAY)
                breakfastPrice *= 1.5;
            return breakfastPrice;
        }

        @Override
        public String toString() {
            return "Breakfast";
        }
    },

    LAUNCH(2,45) {
        @Override
        double mealPrices(Day day) {
            double lunchPrice = 20.50;
            switch (day) {
                case SATURDAY: case SUNDAY:
                    lunchPrice *= 2.0;
            }
            return lunchPrice;
        }

        @Override
        public String toString() {
            return "Lunch";
        }
    },

    DINNER (8,30) {
        @Override
        double mealPrices(Day day) {
            double dinnerPrice = 30.50;
            switch (day) {
                case SATURDAY:
                case SUNDAY:
                    dinnerPrice *= 3.0;
            }
            return dinnerPrice;
        }

        @Override
        public String toString() {
            return "Dinner";
        }
    };

    //Enum constructor
    Meal(int hour, int  minute) {
        assert (hour >= 0 && hour <= 23) : "Illegal hour.";
        assert (minute >= 0 && minute <= 59) : "Illegal minute.";
        this.hour = hour;
        this.minute = minute;
    }

    abstract double mealPrices (Day day);
    //Enum fields
    private int hour;
    private int minute;

    /**
     * Returns the value of hour of the specific meal.
     * @return {@link Integer} hour of the meal.
     */
    public int getHour() {
        return hour;
    }

    /**
     * Returns the value of minute of the specific meal.
     * @return {@link Integer} minute of the meal.
     */
    public int getMinute() {
        return minute;
    }
}
