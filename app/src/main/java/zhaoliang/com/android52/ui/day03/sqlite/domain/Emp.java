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
