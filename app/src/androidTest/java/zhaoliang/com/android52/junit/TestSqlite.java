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
            empDao.insertApi(new Emp("李四" + i, "技术部" + i, 99999, "12432894723"));
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
