//Normal
try {

            SQLiteDatabase eventsDB = this.openOrCreateDatabase("Events", MODE_PRIVATE, null);

            eventsDB.execSQL("CREATE TABLE IF NOT EXISTS events (event VARCHAR, year INT(4))");

            eventsDB.execSQL("INSERT INTO events (event, year) VALUES ('End Of WW2', 1945)");

            eventsDB.execSQL("INSERT INTO events (event, year) VALUES ('Wham split up', 1986)");

            Cursor c = eventsDB.rawQuery("SELECT * FROM events", null);

            int eventIndex = c.getColumnIndex("event");
            int yearIndex = c.getColumnIndex("year");

            c.moveToFirst();

            while (c != null) {

                Log.i("Results - event", c.getString(eventIndex));
                Log.i("Results - year", Integer.toString(c.getInt(yearIndex)));

                c.moveToNext();
            }


        }
        catch (Exception e) {

            e.printStackTrace();

}

//Advanced
try{
            SQLiteDatabase eventsDB = this.openOrCreateDatabase("Users", MODE_PRIVATE, null);


            eventsDB.execSQL("CREATE TABLE IF NOT EXISTS newUsers (name VARCHAR, age INTEGER(3), id INTEGER PRIMARY KEY)");

            //eventsDB.execSQL("INSERT INTO newUsers (name, age) VALUES ('Kirsten', 21)");

            //eventsDB.execSQL("INSERT INTO newUsers (name, age) VALUES ('Ralphie', 1)");

            eventsDB.execSQL("DELETE FROM newUsers WHERE id = 1");

            Cursor c = eventsDB.rawQuery("SELECT * FROM newUsers", null);

            int nameIndex = c.getColumnIndex("name");
            int ageIndex = c.getColumnIndex("age");
            int idIndex = c.getColumnIndex("id");

            c.moveToFirst();

            while (c != null) {

                Log.i("UserResults - name", c.getString(nameIndex));
                Log.i("UserResults - age", Integer.toString(c.getInt(ageIndex)));
                Log.i("UserResults - id", Integer.toString(c.getInt(idIndex)));

                c.moveToNext();
            }


        } catch (Exception e) {

            e.printStackTrace();

        }

	