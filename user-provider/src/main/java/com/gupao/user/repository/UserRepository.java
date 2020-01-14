package com.gupao.user.repository;

import com.gupao.user.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UserRepository {

    private ConcurrentHashMap<Long, User> repostory = new ConcurrentHashMap<>();

    private static final AtomicLong idGenerator = new AtomicLong();

    public Collection<User> findAll(){
       return repostory.values();
    }

    public boolean save(User user){
        Long id = idGenerator.incrementAndGet();
        user.setId(id);
        repostory.putIfAbsent(id,user);
        return false;
    }

}
