package practice18.service;

import java.sql.Connection;
import java.util.List;

import practice18.dataaccess.dao.DepartmentDAO;
import practice18.dataaccess.db.ConnectionManager;
import practice18.dataaccess.value.Department;

/**
 * 
 * [機 能] 部署サービスクラス<br>
 * [説 明] 部署DAOを利用する。<br>
 * [備 考] なし<br>
 * [環 境] JavaSE 8.0 <br>
 * Copyright(c) 2019 Fullness, Inc. All Rights Reserved
 * @author [作 成] 2017/03/06 fullness(fullness)
 */
public class DepartmentService {

    /**
     * 
     * [機 能] 部署テーブルに登録するメソッド<br>
     * [説 明] コネクションを取得し、部署データを部署テーブルに登録する。<br>
     * [備 考] なし
     * @param department 部署
     * @return 登録件数
     */
    public int addDepartment(Department department) {
        ConnectionManager connectionManager = new ConnectionManager();
        try {
            Connection connection = connectionManager.getConnection();
            DepartmentDAO departmentDAO = new DepartmentDAO(connection);
            int result = departmentDAO.insert(department);
            connectionManager.commit();
            return result;
        } catch (RuntimeException e) {
            connectionManager.rollback();
            throw e;
        } finally {
            connectionManager.closeConnection();
        }
    }

    /**
     * 
     * [機 能] 部署テーブルを参照するメソッド<br>
     * [説 明] コネクションを取得し、部署テーブルの全件を参照する。<br>
     * [備 考] なし
     * @return 部署情報のリスト
     */
    public List<Department> getDepartmentList() {
        ConnectionManager connectionManager = new ConnectionManager();
        try {
            Connection connection = connectionManager.getConnection();
            DepartmentDAO departmentDAO = new DepartmentDAO(connection);
            return departmentDAO.selectAll();
        } finally {
            connectionManager.closeConnection();
        }
    }
}
