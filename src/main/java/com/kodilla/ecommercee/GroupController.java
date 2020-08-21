package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.GroupDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/group")
public class GroupController {

    @GetMapping(value = "getGroups")
    public List<GroupDTO> getGroups(){

        return new ArrayList<>();
    }

    @PostMapping("createGroup")
    public void createGroup(GroupDTO groupDTO){

    }

    @GetMapping("getGroup")
    public GroupDTO getGroup(Long groupId){

        return new GroupDTO(1L, "test name");
    }

    @PutMapping("updateGroup")
    public GroupDTO updateGroup(GroupDTO groupDTO){

        return new GroupDTO(1L, "updated test name");
    }
}
