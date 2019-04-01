package mapper;

import model.Role;
import org.apache.ibatis.annotations.Select;

public interface RoleMapper {

    @Select("SELECT * FROM role WHERE role.uuid = #{uuid}")
    Role getRole(String uuid);

}
