package com.hotel.roommanagementH2.service;

import com.hotel.roommanagementH2.repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service

public class RoomService {
    private RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }


}
