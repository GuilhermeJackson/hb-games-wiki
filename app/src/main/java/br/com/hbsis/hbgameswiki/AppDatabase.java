package br.com.hbsis.hbgameswiki;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Game.class, User.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract GameDao gameDao();

    public abstract UserDao userDao();
}
