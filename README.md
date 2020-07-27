# 開発演習

## 成果物

- クラス図
- ソースコード
- Javadocドキュメント
- 発表資料

## フォルダ構成

eclipseで動的Webプロジェクトを新規作成し、プロジェクト名は`bookinfo`にする。

```
├── README.md
├── WebContent
│   ├── META-INF
│   │   └── MANIFEST.MF
│   ├── WEB-INF
│   │   ├── jsp
│   │   │   └── xxxx.jsp
│   │   └── lib
│   │       ├── jstl-api-1.2.jar
│   │       ├── jstl-impl-1.2.jar
│   │       └── postgresql-42.2.8.jar
│   └── css
│       └── style.css
├── doc
│   └──（JavaDoc形式ドキュメント）
├── src
│   ├── controller
│   │   └── XxxServlet.java
│   ├── model
│   │   ├── dao
│   │   │   └── XxxDAO.java
│   │   ├── db
│   │   │   └── ConnectionManager.java
│   │   └── value
│   │       └── Xxx.java
│   └── service
│       └── XxxService.java
└── plan
    ├── uml
    │   ├── class-all.plantuml
    │   ├── class-all.png
    │   ├── class-package-controller.plantuml
    │   ├── class-package-controller.png
    │   ├── class-package-dao.plantuml
    │   ├── class-package-dao.png
    │   ├── class-package-db.plantuml
    │   ├── class-package-db.png
    │   ├── class-package-service.plantuml
    │   ├── class-package-service.png
    │   ├── class-package-value.plantuml
    │   └── class-package-value.png
    └── sql
        ├── create_table.sql
        └── create_user.sql
```

## DB定義

**create_user.sql**

```
create user bookinfo with password 'bookinfo';
create database bookinfo owner bookinfo;
```

**create_table.sql**

```
create table t_book(
	id integer primary key,
	title varchar(100),
	author varchar(200),
	status varchar(2),
	start_date date,
	end_date date
);

create table t_user(
	id integer primary key,
	password varchar(10),
	name varchar(40)
);
```

## 毎日の進め方

- お昼は12:00〜13:00は固定
- それ以外は1hに10分ほどの休憩は可

## 演習評価基準

- 学習したスキルを使っているか
- 品質（Quality）
    - 設計
        - 正確性
        - わかりやすさ・見やすさ
        - 統一感
    - ソースコード
        - バグのないコードになっているか
        - 不要なコードが含まれていないか
        - わかりやすいクラス名、変数名・メソッド名になっているか
        - インデントレベルはあっているか
        - Javaのコーディング規約を守っているか
            - [パッケージ](https://future-architect.github.io/coding-standards/documents/forJava/Java%E3%82%B3%E3%83%BC%E3%83%87%E3%82%A3%E3%83%B3%E3%82%B0%E8%A6%8F%E7%B4%84.html#%E3%83%91%E3%83%83%E3%82%B1%E3%83%BC%E3%82%B8)
            - [クラス](https://future-architect.github.io/coding-standards/documents/forJava/Java%E3%82%B3%E3%83%BC%E3%83%87%E3%82%A3%E3%83%B3%E3%82%B0%E8%A6%8F%E7%B4%84.html#%E3%82%AF%E3%83%A9%E3%82%B9)
            - [メソッド](https://future-architect.github.io/coding-standards/documents/forJava/Java%E3%82%B3%E3%83%BC%E3%83%87%E3%82%A3%E3%83%B3%E3%82%B0%E8%A6%8F%E7%B4%84.html#%E3%83%A1%E3%82%BD%E3%83%83%E3%83%89)
    - セキュリティ・脆弱性
        - 認証・認可（セッション周り）
        - SQLインジェクション
        - クロスサイトスクリプティング
    - ユーザビリティ
    - 見栄え・デザイン
- 納期（Delivery）
    - 期限までに完成できるか

## 機能追加について

- まずは要件通りのものを開発する
    - 要件通りのものが完成したら`bookinfo-v1.zip`という名前でプロジェクトをzip圧縮する
- 要件通りのものが完成したら機能追加を検討する
    - 機能追加版は`bookinofo-v2.zip`でzip圧縮する
    - 機能追加版はDB定義の変更をしてもよい
        - その場合は`create_user.sql`、`create_table.sql`は修正する

## 納品方法

- `bookinfo-v1.zip`（機能追加がある場合は`bookinfo-v2.zip`も）を提出する