package zhaoliang.com.android52.ui.day02.operatorxml;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Xml;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import zhaoliang.com.android52.R;
import zhaoliang.com.android52.ui.day02.operatorxml.domain.Person;

/**
 * 序列化和解析XML
 */
public class OperatorXMLActivity extends Activity {

    // 声明控件
    private ListView mListView;
    private String mPath;
    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator_xml);
        mListView = (ListView) findViewById(R.id.list_view);
        mPath = Environment.getExternalStorageDirectory() + File.separator + "persons.xml";
        persons = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            persons.add(new Person("张三" + i, 10 + i, "北京" + i));
        }
    }

    /**
     * 按钮点击事件
     *
     * @param view
     */
    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn_write:
                write();
                break;
            case R.id.btn_read:
                read();
                break;
        }
    }

    /**
     * 序列化XML
     */
    private void write() {
        XmlSerializer xmlSerializer = Xml.newSerializer();
        try {
            xmlSerializer.setOutput(new FileOutputStream(mPath), "utf-8");  // 设置输出流，和文件对接
            xmlSerializer.startDocument("utf-8", true);     // 文档开始
            xmlSerializer.startTag(null, "persons");

            for (Person person : persons) {
                xmlSerializer.startTag(null, "person");

                xmlSerializer.startTag(null, "name");
                xmlSerializer.text(person.name);
                xmlSerializer.endTag(null, "name");

                xmlSerializer.startTag(null, "age");
                xmlSerializer.text(String.valueOf(person.age));
                xmlSerializer.endTag(null, "age");

                xmlSerializer.startTag(null, "address");
                xmlSerializer.text(person.address);
                xmlSerializer.endTag(null, "address");

                xmlSerializer.endTag(null, "person");
            }

            xmlSerializer.endTag(null, "persons");
            xmlSerializer.endDocument();        // 文档结束
            Toast.makeText(this, "序列化成功！", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 解析XML
     */
    private void read() {
        XmlPullParser xmlPullParser = Xml.newPullParser();  // xml解析器
        try {
            List<Person> personList = null;
            Person person = null;
            xmlPullParser.setInput(new FileInputStream(mPath), "utf-8");
            int eventType = xmlPullParser.getEventType();       // 事件类型
            while (eventType != xmlPullParser.END_DOCUMENT) {   // 循环解析每一行
                String name = xmlPullParser.getName();// 获取标签的名字
                switch (eventType) {        // 判断事件类型是开始还是结束标签
                    case XmlPullParser.START_TAG:
                        if ("persons".equals(name)) {
                            personList = new ArrayList<>();
                        }
                        if ("person".equals(name)) {
                            person = new Person();
                        }
                        if ("name".equals(name)) {
                            person.name = xmlPullParser.nextText();
                        }
                        if ("age".equals(name)) {
                            person.age = Integer.parseInt(xmlPullParser.nextText());
                        }
                        if ("address".equals(name)) {
                            person.address = xmlPullParser.nextText();
                        }
                        break;
                    case XmlPullParser.END_TAG:
                        if ("person".equals(name)) {
                            personList.add(person);
                        }
                        break;
                }
                eventType = xmlPullParser.next();
            }
            Toast.makeText(this, "解析完成！", Toast.LENGTH_SHORT).show();
            mListView.setAdapter(new ArrayAdapter<Person>(this, android.R.layout.simple_list_item_1, personList));
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
