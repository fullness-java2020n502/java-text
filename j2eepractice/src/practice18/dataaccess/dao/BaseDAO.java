package practice18.dataaccess.dao;

import java.sql.Connection;

/**
 * 
 * [機 能] BaseDaoクラス<br>
 * [説 明] コネクションを取得する。<br>
 * [備 考] なし<br>
 * [環 境] JavaSE 8.0 <br>
 * Copyright(c) 2019 Fullness, Inc. All Rights Reserved
 * @author [作 成] 2017/03/06 fullness(fullness)
 */
public class BaseDAO {

    /**
     * コネクション
     */
    private Connection connection = null;

    /**
     * 
     * [機 能] コンストラクタ<br>
     * [説 明] 引数の値をフィールドに設定する。<br>
     * [備 考] なし
     * @param connection コネクション
     */
    public BaseDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * 
     * [機 能] コネクションのゲッター<br>
     * [説 明] コネクションを取得する。<br>
     * [備 考] なし
     * @return コネクション
     */
    public Connection getConnection() {
        return connection;
    }
}
