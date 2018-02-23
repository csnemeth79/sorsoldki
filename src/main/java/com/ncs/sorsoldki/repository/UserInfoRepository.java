package com.ncs.sorsoldki.repository;

import com.ncs.sorsoldki.entiry.UserInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {

    @Query("Select u from UserInfo u where displayName=?1")
    UserInfo findByDisplayName(String displayName);

    @Query("Select u from UserInfo u where email=?1")
    UserInfo findByEmail(String email);

    UserInfo save(UserInfo userInfo);
}
