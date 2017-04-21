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
