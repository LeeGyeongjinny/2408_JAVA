package oop.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO extends MyDAO {
    private MyDAO myDao; // MyDAO 를 저장할 객체 생성

    public UserDAO() {
        this.myDao = new MyDAO(); // myDao 를 다시 인스턴스
    }

    public List<UserDTO> getUsers(int limit, int offset) {
        List<UserDTO> users = new ArrayList<>();
        String sql = "select * from users limit ? offset ?"; // php 와 동일한 방법으로 prepared statement 세팅

        try (
                Connection conn = this.myDao.getConnection(); // connection 객체 획득
                PreparedStatement ps = conn.prepareStatement(sql);
            ) {
            ps.setInt(1, limit);
            ps.setInt(2, offset);

            try (ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    UserDTO user = new UserDTO();
                    user.setUserId(rs.getLong("user_id")); // "user_id" 는 db의 컬럼명, db에 bigInt 로 저장되어있어서 getLong 으로 가져옴
                    user.setName(rs.getString("name"));
                    user.setPassword(rs.getString("password"));
                    user.setAccount(rs.getString("account"));
                    user.setProfile(rs.getString("profile"));
                    user.setGender(rs.getString("gender"));
                    user.setRefreshToken(rs.getString("refresh_token"));
                    user.setCreatedAt(rs.getString("created_at"));
                    user.setUpdatedAt(rs.getString("updated_at"));
                    user.setDeletedAt(rs.getString("deleted_at"));

                    users.add(user); // 루프 돌면서 list 에 추가
                    // rs.next 는 다음 레코드가 없으면 false 가 되어 자동으로 루프 종료
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return users;
    }
}
