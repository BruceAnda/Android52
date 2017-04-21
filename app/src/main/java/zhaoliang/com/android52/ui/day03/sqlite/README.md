# HelloWorld
### 截图
![截图](https://github.com/BruceAnda/Android52/blob/master/screenshot/day03/pic/pic3.png)

### 布局代码
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="zhaoliang.com.android52.ui.day03.sqlite.SqliteActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="@string/day03_values2"/>
</RelativeLayout>
```
### Java代码
1. SqliteActivity
```
package zhaoliang.com.android52.ui.day03.sqlite;

import android.app.Activity;
import android.os.Bundle;

import zhaoliang.com.android52.R;

/**
 * Sqlite 的使用
 */
public class SqliteActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);
    }
}
```
2. Emp
```
package zhaoliang.com.android52.ui.day03.sqlite.domain;

/**
 * 员工类
 * Created by zhaoliang on 2017/4/19.
 */

public class Emp {

    public int _id;        // 员工号
    public String name;    // 员工名称
    public String dept;    // 部门
    public double salary;  // 薪水
    public String phone;   // 手机

    public Emp() {
    }

    public Emp(int _id, String name, String dept, double salary, String phone) {
        this._id = _id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.phone = phone;
    }

    public Emp(String name, String dept, double salary, String phone) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "_id=" + _id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                '}';
    }
}
```
3. EmpOpenHelper
```
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
```
4. IEmpDao
```
package zhaoliang.com.android52.ui.day03.sqlite.db;

import java.util.List;

import zhaoliang.com.android52.ui.day03.sqlite.domain.Emp;

/**
 * dao接口
 * Created by zhaoliang on 2017/4/19.
 */

public interface IEmpDao {

    void setUp();

    void release();

    void insertSql(Emp emp);

    void insertApi(Emp emp);

    void deleteSql(int id);

    void deleteApi(int id);

    void updateSql(Emp emp);

    void updateApi(Emp emp);

    Emp selectOneSql(int id);

    Emp selectOneApi(int id);

    List<Emp> selectAllSql();

    List<Emp> selectAllApi();

    List<Emp> selectPageSql(int page, int pageSize);

    List<Emp> selectPageApi(int page, int pageSize);

    void transaction(Emp emp, Emp emp2);
}
```
5. EmpDaoImpl
```
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
```
6. TestSqlite
```
package zhaoliang.com.android52.junit;

import android.database.sqlite.SQLiteDatabase;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import zhaoliang.com.android52.ui.day03.sqlite.db.EmpDaoImpl;
import zhaoliang.com.android52.ui.day03.sqlite.db.EmpOpenHelper;
import zhaoliang.com.android52.ui.day03.sqlite.db.IEmpDao;
import zhaoliang.com.android52.ui.day03.sqlite.domain.Emp;

/**
 * 使用Junit测试Sqlite的使用
 * Created by zhaoliang on 2017/4/19.
 */
@RunWith(AndroidJUnit4.class)
public class TestSqlite {

    private EmpOpenHelper openHelper;
    private SQLiteDatabase database;
    private IEmpDao empDao;

    @Test
    public void testEmpOenHelper() {
        openHelper = new EmpOpenHelper(InstrumentationRegistry.getTargetContext());
        database = openHelper.getWritableDatabase();
    }

    @Before
    public void setUp() throws Exception {
        empDao = new EmpDaoImpl(InstrumentationRegistry.getTargetContext());
        empDao.setUp();
    }

    @After
    public void tearDown() throws Exception {
        empDao.release();
    }

    @Test
    public void testInsertSql() {
        for (int i = 0; i < 20; i++) {
            empDao.insertSql(new Emp("张三" + i, "技术部" + i, 99999, "16161616616"));
        }
    }

    @Test
    public void testInsertApi() {
        for (int i = 0; i < 20; i++) {
            empDao.insertSql(new Emp("李四" + i, "技术部" + i, 99999, "12432894723"));
        }
    }

    @Test
    public void testDeleteSql() {
        empDao.deleteSql(40);
    }

    @Test
    public void testDeleteApi() {
        empDao.deleteApi(39);
    }

    @Test
    public void testUpdateSql() {
        empDao.updateSql(new Emp(38, "张三", "财务部", 97777, "1284930293"));
    }

    @Test
    public void testUpdataApi() {
        empDao.updateApi(new Emp(37, "王五", "财务部", 98888, "328304923"));
    }

    @Test
    public void testSelectOneSql() {
        Emp emp = empDao.selectOneSql(1);
        System.out.println(emp);
    }

    @Test
    public void testSelectOneApi() {
        Emp emp = empDao.selectOneApi(2);
        System.out.println(emp);
    }

    @Test
    public void testSelectAllSql() {
        List<Emp> emps = empDao.selectAllSql();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }

    @Test
    public void testSelectAllApi() {
        List<Emp> emps = empDao.selectAllApi();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }

    @Test
    public void testSelectPageSql() {
        List<Emp> emps = empDao.selectPageSql(3, 3);
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }

    @Test
    public void testSelectPageApi() {
        List<Emp> emps = empDao.selectPageApi(3, 3);
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }

    @Test
    public void testTransaction() {
        empDao.transaction(
                new Emp(1, "李四", "财务部", 989898, "9230840923"),
                new Emp(2, "李四", "财务部", 983209823, "293084029384")
        );
    }
}
```