package practice18.dataaccess.value;

import java.io.Serializable;

/**
 * 
 * [機 能] 部署クラス<br>
 * [説 明] 部署情報を操作する。<br>
 * [備 考] なし<br>
 * [環 境] JavaSE 8.0 <br>
 * Copyright(c) 2019 Fullness, Inc. All Rights Reserved
 * @author [作 成] 2017/03/06 fullness(fullness)
 */
public class Department implements Serializable {

    /**
     * シリアルID
     */
    private static final long serialVersionUID = 1L;

    /**
     * 部署番号
     */
    private int deptNo;

    /**
     * 部署名
     */
    private String deptName;

    /**
     * 
     * [機 能] 部署番号のゲッター<br>
     * [説 明] 部署番号を取得する。<br>
     * [備 考] なし
     * @return 部署番号
     */
    public int getDeptNo() {
        return deptNo;
    }

    /**
     * 
     * [機 能] 部署番号のセッター<br>
     * [説 明] 部署番号を設定する。<br>
     * [備 考] なし
     * @param deptNo 部署番号
     */
    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    /**
     * 
     * [機 能] 部署名のゲッター<br>
     * [説 明] 部署名を取得する。<br>
     * [備 考] なし
     * @return 部署名
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 
     * [機 能] 部署名のセッター<br>
     * [説 明] 部署名を設定する。<br>
     * [備 考] なし
     * @param deptName 部署名
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
