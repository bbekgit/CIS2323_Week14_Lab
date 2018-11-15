package android.database.sqlite.SQLiteOpenHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME="TASKS";
    private static final String DB_COLUMN="TASKNAME";
    private static final int DB_VER=1;

    public DBHelper(Context context) {
        super(context,DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL ("CREATE TABLE TASKS (ID INTEGER PRIMARY KEY AUTOINCREMENT, TASKNAME NOT NULL);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DELETE TABLE IF EXISTS TASK");
        onCreate(db);
    }
}
