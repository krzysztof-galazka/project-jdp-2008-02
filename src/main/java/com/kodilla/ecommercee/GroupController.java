package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.GroupDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/v1/group")
public class GroupController {

    @GetMapping("getGroups")
    public List<GroupDTO> getGroups(){

        return new ArrayList<>();
    }

    @PostMapping
    public void createGroup(GroupDTO groupDTO){

    }

    @GetMapping("getGroup")
    public GroupDTO getGroup(Long groupId) throws GroupNotFoundException{

        return new GroupDTO(1L, "test name");
    }

    @PutMapping
    public GroupDTO updateGroup(GroupDTO groupDTO){

        return new GroupDTO(1L, "updated test name");
    }
}
