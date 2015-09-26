package br.com.ceduphh.bruno.games;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BRUNO on 29/09/2014.
 */
public class GameSQLiteOpenHelper {

    public List<Game> getGames(){
        getReadableDatabase().query(
                true,
                "GAMES",
                new String[]{"ID","NAME","AGE"},
                null,null,null,null,"NAME",null);
        List<Game> games = new ArrayList<Game>(cursor.getCount());

        int idIndex = cursor.getColumnIndex("ID");
        int nameIndex = cursor.getColumnIndex("NAME");
        int ageIndex = cursor.getColumnIndex("AGE");

cursor.moveTo
        )
    }
}
