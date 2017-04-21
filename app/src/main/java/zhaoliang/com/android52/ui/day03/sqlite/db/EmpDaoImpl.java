package zhaoliang.com.android52.ui.day03.sqlite.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import zhaoliang.com.android52.ui.day03.sqlite.domain.Emp;

/**
 * Emp dao的实现类
 * Created by zhaoliang on 2017/4/19.
 */

public class EmpDaoImpl implements IEmpDao {

    private EmpOpenHelper empOpenHelper;
    private SQLiteDatabase db;
    private Context context;

    public EmpDaoImpl(Context context) {
        this.context = context;
    }

    public void setUp() {
        empOpenHelper = new EmpOpenHelper(context);
        db = empOpenHelper.getWritableDatabase();
    }

    public void release() {
        if (db != null && db.isOpen()) {
            db.close();
            db = null;
            empOpenHelper = null;
        }
    }

    @Override
    public void insertSql(Emp emp) {
        db.execSQL("insert into emp(name, dept, salary, phone) values(?, ?, ?, ?)", new String[]{
                emp.name,
                emp.dept,
                String.valueOf(emp.salary),
                emp.phone
        });
    }

    @Override
    public void insertApi(Emp emp) {
        ContentValues values = new ContentValues();
        values.put("name", emp.name);
        values.put("dept", emp.dept);
        values.put("salary", String.valueOf(emp.salary));
        values.put("phone", emp.phone);
        db.insert("emp", null, values);
    }

    @Override
    public void deleteSql(int id) {
        db.execSQL("delete from emp where _id = ?", new String[]{String.valueOf(id)});
    }

    @Override
    public void deleteApi(int id) {
        db.delete("emp", "_id = ?", new String[]{String.valueOf(id)});
    }

    @Override
    public void updateSql(Emp emp) {
        db.execSQL("update emp set name = ?, dept = ?, salary = ?, phone = ? where _id = ?", new String[]{
                emp.name,
                emp.dept,
                String.valueOf(emp.salary),
                emp.phone,
                String.valueOf(emp._id)
        });
    }

    @Override
    public void updateApi(Emp emp) {
        ContentValues values = new ContentValues();
        values.put("name", emp.name);
        values.put("dept", emp.dept);
        values.put("salary", String.valueOf(emp.salary));
        values.put("phone", emp.phone);
        db.update("emp", values, "_id = ?", new String[]{String.valueOf(emp._id)});
    }

    @Override
    public Emp selectOneSql(int id) {
        Emp emp = null;
        Cursor cursor = db.rawQuery("select * from emp where _id = ?", new String[]{String.valueOf(id)});
        if (cursor.moveToNext()) {
            emp = new Emp();
            emp._id = cursor.getInt(cursor.getColumnIndex("_id"));
            emp.name = cursor.getString(cursor.getColumnIndex("name"));
            emp.dept = cursor.getString(cursor.getColumnIndex("dept"));
            emp.salary = cursor.getDouble(cursor.getColumnIndex("salary"));
            emp.phone = cursor.getString(cursor.getColumnIndex("phone"));
        }
        return emp;
    }

    @Override
    public Emp selectOneApi(int id) {
        Emp emp = null;
        Cursor cursor = db.query("emp", null, "_id = ?", new String[]{String.valueOf(id)}, null, null, null);
        if (cursor.moveToNext()) {
            emp = new Emp();
            emp._id = cursor.getInt(cursor.getColumnIndex("_id"));
            emp.name = cursor.getString(cursor.getColumnIndex("name"));
            emp.dept = cursor.getString(cursor.getColumnIndex("dept"));
            emp.salary = cursor.getDouble(cursor.getColumnIndex("salary"));
            emp.phone = cursor.getString(cursor.getColumnIndex("phone"));
        }
        return emp;
    }

    @Override
    public List<Emp> selectAllSql() {
        List<Emp> emps = new ArrayList<>();
        Emp emp = null;
        Cursor cursor = db.rawQuery("select * from emp", null);
        while (cursor.moveToNext()) {
            emp = new Emp();
            emp._id = cursor.getInt(cursor.getColumnIndex("_id"));
            emp.name = cursor.getString(cursor.getColumnIndex("name"));
            emp.dept = cursor.getString(cursor.getColumnIndex("dept"));
            emp.salary = cursor.getDouble(cursor.getColumnIndex("salary"));
            emp.phone = cursor.getString(cursor.getColumnIndex("phone"));
            emps.add(emp);
        }
        return emps;
    }

    @Override
    public List<Emp> selectAllApi() {
        List<Emp> emps = new ArrayList<>();
        Emp emp = null;
        Cursor cursor = db.query("emp", null, null, null, null, null, null);
        while (cursor.moveToNext()) {
            emp = new Emp();
            emp._id = cursor.getInt(cursor.getColumnIndex("_id"));
            emp.name = cursor.getString(cursor.getColumnIndex("name"));
            emp.dept = cursor.getString(cursor.getColumnIndex("dept"));
            emp.salary = cursor.getDouble(cursor.getColumnIndex("salary"));
            emp.phone = cursor.getString(cursor.getColumnIndex("phone"));
            emps.add(emp);
        }
        return emps;
    }

    @Override
    public List<Emp> selectPageSql(int page, int pageSize) {
        List<Emp> emps = new ArrayList<>();
        Emp emp = null;
        Cursor cursor = db.rawQuery("select * from emp limit ?, ?", new String[]{String.valueOf((page - 1) * pageSize), String.valueOf(pageSize)});
        while (cursor.moveToNext()) {
            emp = new Emp();
            emp._id = cursor.getInt(cursor.getColumnIndex("_id"));
            emp.name = cursor.getString(cursor.getColumnIndex("name"));
            emp.dept = cursor.getString(cursor.getColumnIndex("dept"));
            emp.salary = cursor.getDouble(cursor.getColumnIndex("salary"));
            emp.phone = cursor.getString(cursor.getColumnIndex("phone"));
            emps.add(emp);
        }
        return emps;
    }

    @Override
    public List<Emp> selectPageApi(int page, int pageSize) {
        List<Emp> emps = new ArrayList<>();
        Emp emp = null;
        Cursor cursor = db.query("emp", null, null, null, null, null, null, (page - 1) * page + ", " + pageSize);
        while (cursor.moveToNext()) {
            emp = new Emp();
            emp._id = cursor.getInt(cursor.getColumnIndex("_id"));
            emp.name = cursor.getString(cursor.getColumnIndex("name"));
            emp.dept = cursor.getString(cursor.getColumnIndex("dept"));
            emp.salary = cursor.getDouble(cursor.getColumnIndex("salary"));
            emp.phone = cursor.getString(cursor.getColumnIndex("phone"));
            emps.add(emp);
        }
        return emps;
    }

    @Override
    public void transaction(Emp emp, Emp emp2) {
        try {
            db.beginTransaction();
            updateSql(emp);
            //int result = 3 / 0;     // 这里设置个异常，查看事务的执行结果
            updateApi(emp2);
            db.setTransactionSuccessful();
        } catch (Exception e) {

        } finally {
            db.endTransaction();
        }
    }
}
