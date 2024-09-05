package projectj.jdbc;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.sql.*;

/**
 * @author Yale
 */
public class JdbcExample {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/test";
        String username = "root";
        String password = "123456";

        // SQL查询语句
        String query = "SELECT * FROM tb_user";

        // JDBC对象
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        DruidDataSource ds = new DruidDataSource();
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword("123456");

        try {
            // 建立数据库连接
//            connection = DriverManager.getConnection(url, username, password);
            connection = ds.getConnection();
            connection.setAutoCommit(false);

            // 创建Statement对象
            statement = connection.createStatement();

            // 执行查询
            resultSet = statement.executeQuery(query);

            // 处理结果集
            while (resultSet.next()) {
                // 从结果集中获取数据
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                // 在这里对数据进行处理
                System.out.println("ID: " + id + ", Name: " + name);
            }
            connection.commit();
        } catch (
                SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
