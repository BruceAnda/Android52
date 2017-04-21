package zhaoliang.com.android52.ui.day03.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Sqlite打开帮助器类
 * Created by zhaoliang on 2017/4/19.
 */

public class EmpOpenHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "emp.db";
    private static final int DB_VERSION = 1;

    public EmpOpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table emp(_id Integer primary key autoincrement, name varhcar(20), dept varchar(50), salary Double, phone varhcar(20))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
