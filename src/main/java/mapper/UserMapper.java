package mapper;

import model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM user")
    List<User> findAllUsers();

    @Select("SELECT * FROM user WHERE user.name = #{name}")
    User findOneUser(String name);

    @Select("SELECT user.id FROM user")
    List<String> ids();

    @Insert("INSERT INTO user (id, name, role_id, position_id) VALUES (#{id}, #{name}, role_id, position_id)")
    void insert(User user);
}
