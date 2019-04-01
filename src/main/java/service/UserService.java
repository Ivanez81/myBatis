package service;

import mapper.UserMapper;
import model.User;

import java.io.IOException;
import java.util.List;

public class UserService extends AbstractService {

    private final UserMapper userMapper;

    public UserService() throws IOException {
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    public List<User> findAll() {
        return userMapper.findAllUsers();
    }

    public User findOne(String name) {
        return userMapper.findOneUser(name);
    }

    public List<String> findAllIDs() {
        return userMapper.ids();
    }
}
