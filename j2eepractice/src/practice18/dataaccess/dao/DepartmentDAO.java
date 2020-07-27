package practice18.dataaccess.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import practice18.dataaccess.value.Department;

/**
 * 
 * [機 能] 部署DAOクラス<br>
 * [説 明] 部署テーブルのアクセスを行う。<br>
 * [備 考] なし<br>
 * [環 境] JavaSE 8.0 <br>
 * Copyright(c) 2019 Fullness, Inc. All Rights Reserved
 * @author [作 成] 2017/03/06 fullness(fullness)
 */
public class DepartmentDAO extends BaseDAO {

    /**
     * 
     * [機 能] コンストラクタ<br>
     * [説 明] 引数の値をフィールドに設定する。<br>
     * [備 考] なし
     * @param connection コネクション
     */
    public DepartmentDAO(Connection connection) {
        super(connection);
    }

    /**
     * クエリ文字列
     */
    private static String INSERT = "INSERT INTO DEPARTMENT (DEPT_NO ,DEPT_NAME) VALUES (?,?)";

    /**
     * 
     * [機 能] レコードを登録するメソッド<br>
     * [説 明] 引数の部署データを部署テーブルに登録する。<br>
     * [備 考] なし
     * @param department 部署
     * @return 登録件数
     */
    public int insert(Department department) {
        int result = 0;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = getConnection().prepareStatement(INSERT);
            preparedStatement.setInt(1, department.getDeptNo());
            preparedStatement.setString(2, department.getDeptName());
            result = preparedStatement.executeUpdate();
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    /**
     * クエリ文字列
     */
    private static String SELECT_ALL = "SELECT DEPT_NO ,DEPT_NAME FROM  DEPARTMENT ORDER BY DEPT_NO";

    /**
     * 
     * [機 能] 全件参照するメソッド<br>
     * [説 明] 部署テーブルの全件を参照する。<br>
     * [備 考] なし
     * @return 部署情報のリスト
     */
    public List<Department> selectAll() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = getConnection().prepareStatement(SELECT_ALL);
            resultSet = preparedStatement.executeQuery();
            List<Department> departmentList = new ArrayList<Department>();
            while (resultSet.next()) {
                Department department = new Department();
                department.setDeptNo(resultSet.getInt("DEPT_NO"));
                department.setDeptName(resultSet.getString("DEPT_NAME"));
                departmentList.add(department);
            }
            return departmentList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
