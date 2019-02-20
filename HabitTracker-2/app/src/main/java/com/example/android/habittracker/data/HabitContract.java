package com.example.android.habittracker.data;

import android.provider.BaseColumns;

/**
 * API Contract for the Habit Tracker app.
 */
public final class HabitContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private HabitContract() {}

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class HabitEntry implements BaseColumns {

        /** Name of database table for habit */
        public static final String TABLE_NAME = "habits";

        /**
         * Unique ID number for the pet (only for use in the database table).
         */
        public static final String _ID = BaseColumns._ID;

        /**
         * Name of exercise
         */
        public static final String COLUMN_NAME ="name";

        /**
         * Duration of exercise
         */
        public static final String COLUMN_DURATION = "duration";

        /**
         * Frequency of exercise
         *
         * The only possible values are {@link #FREQUENCY_NEVER}, {@link #FREQUENCY_DAILY},
         * or {@link #FREQUENCY_WEEKLY}.
         *
         * Type: INTEGER
         */
        public static final String COLUMN_FREQUENCY = "frequency";



        /**
         * Possible values for the frequency of the activity
         */
        public static final int FREQUENCY_NEVER = 0;
        public static final int FREQUENCY_DAILY = 1;
        public static final int FREQUENCY_WEEKLY = 2;
    }
}
