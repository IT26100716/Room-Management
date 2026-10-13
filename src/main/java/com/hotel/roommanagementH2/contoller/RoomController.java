package com.hotel.roommanagementH2.contoller;

import com.hotel.roommanagementH2.service.RoomService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // create rest API
@CrossOrigin
@RequestMapping(value ="api/v1") // Rest API
public class RoomController {
    private RoomService roomService;


}
