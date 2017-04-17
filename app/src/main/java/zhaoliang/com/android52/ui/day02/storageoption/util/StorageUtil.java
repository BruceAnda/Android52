package zhaoliang.com.android52.ui.day02.storageoption.util;

import android.content.SharedPreferences;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 存储工具类
 * Created by zhaoliang on 2017/4/17.
 */

public class StorageUtil {

    /**
     * 保存账户信息到文件
     *
     * @param path
     * @param username
     * @param password
     * @return
     */
    public static boolean saveAccount(String path, String username, String password) {
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(path);
            outputStream.write((username + "##" + password).getBytes());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    /**
     * 读取账户信息
     *
     * @param path
     * @return
     */
    public static Map<String, String> readAccount(String path) {
        Map<String, String> account = new HashMap<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            String readLine = reader.readLine();
            String[] split = readLine.split("##");
            account.put("username", split[0]);
            account.put("password", split[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return account;
    }

    /**
     * 保存账户信息
     *
     * @param sharedPreferences
     * @param username
     * @param password
     * @return
     */
    public static boolean saveAccount(SharedPreferences sharedPreferences, String username, String password) {
        sharedPreferences.edit().putString("username", username).putString("password", password).commit();
        return true;
    }

    /**
     * 读取账户信息
     *
     * @param sharedPreferences
     * @return
     */
    public static Map<String, String> readAccount(SharedPreferences sharedPreferences) {
        Map<String, String> account = new HashMap<>();
        account.put("username", sharedPreferences.getString("username", ""));
        account.put("password", sharedPreferences.getString("password", ""));
        return account;
    }
}
