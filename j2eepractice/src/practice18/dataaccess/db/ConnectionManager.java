package practice18.dataaccess.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * [機 能] コネクション管理クラス<br>
 * [説 明] コネクションとトラザクションの管理を行う。<br>
 * [備 考] なし<br>
 * [環 境] JavaSE 8.0 <br>
 * Copyright(c) 2019 Fullness, Inc. All Rights Reserved
 * @author [作 成] 2017/03/06 fullness(fullness)
 */
public class ConnectionManager {
    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("ドライバのロードに失敗しました", e);
        }
    }

    /**
     * コネクション
     */
    private Connection connection;

    /**
     *
     * [機 能] コネクションのゲッター<br>
     * [説 明] コネクションを接続し、返す。<br>
     * [備 考] なし
     * @return コネクション
     */
    public Connection getConnection() {
        if (connection == null) {
            try {
                String url = "jdbc:postgresql://localhost:5432/j2ee";
                String user = "j2ee";
                String password = "j2ee";

                connection = DriverManager.getConnection(url, user, password);
                connection.setAutoCommit(false);
            } catch (SQLException e) {
                throw new RuntimeException("データベースの接続に失敗しました", e);
            }
        }
        return connection;
    }

    /**
     *
     * [機 能] コネクションの切断メソッド<br>
     * [説 明] コネクションを切断する。<br>
     * [備 考] なし
     */
    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("データベースの切断に失敗しました", e);
        }
    }

    /**
     *
     * [機 能] コミットメソッド<br>
     * [説 明] トランザクションをコミットする。<br>
     * [備 考] なし
     */
    public void commit() {
        try {
            if (connection != null) {
                connection.commit();
            }
        } catch (SQLException e) {
            throw new RuntimeException("トランザクションをコミットに失敗しました", e);
        }
    }

    /**
     *
     * [機 能] ロールバックメソッド<br>
     * [説 明] トランザクションをロールバックする。<br>
     * [備 考] なし
     */
    public void rollback() {
        try {
            if (connection != null) {
                connection.rollback();
            }
        } catch (SQLException e) {
            throw new RuntimeException("トランザクションをロールバックに失敗しました", e);
        }
    }

}
