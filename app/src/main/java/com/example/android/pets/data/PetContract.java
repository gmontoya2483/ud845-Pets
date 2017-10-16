package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by montoya on 16.10.2017.
 */

public final class PetContract {

    public PetContract() {
    }

    public static final class PetEntry implements BaseColumns{

        public final static String TABLE_NAME = "pets";

        //COLUMNS
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_PET_NAME = "name";
        public final static String COLUMN_PET_BREED = "breed";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT = "weight";

        //GENDER CONSTANTS
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;



    }





}
