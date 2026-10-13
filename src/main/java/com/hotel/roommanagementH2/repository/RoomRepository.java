package com.hotel.roommanagementH2.repository;

import com.hotel.roommanagementH2.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,String> {
}
