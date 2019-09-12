package com.demo.repositoryimpl;

import com.demo.mode.User;
import com.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

/**
 * @program: Spring-Boot
 * @description: UesrRepository
 * @author: lau
 * @create: 2019-09-10 15:47
 **/
@Component
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 创建对象
     *
     * @param user
     */
    @Override
    public void saveUser(User user) {
        mongoTemplate.save(user);
    }

    @Override
    public User findUserByUserName(String strName) {
        Query query = new Query(Criteria.where("userName").is(strName));
        return mongoTemplate.findOne(query, User.class);
    }
}
