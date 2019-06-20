package com.rtp.app.dao;

import com.rtp.app.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by avila on 6/19/2019.
 */
@Repository
public interface UsersRepo extends JpaRepository<Users,Long> {


}
