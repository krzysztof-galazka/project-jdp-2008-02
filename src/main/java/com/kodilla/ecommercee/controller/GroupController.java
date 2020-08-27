package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.GroupDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/group")
public class GroupController {

    @GetMapping
    public List<GroupDTO> getGroups(){
        return new ArrayList<>();
    }

    @PostMapping
    public GroupDTO createGroup(@RequestBody GroupDTO groupDTO){
        return new GroupDTO(1L, "test create");
    }

    @GetMapping("/{groupId}")
    public GroupDTO getGroup(@PathVariable Long groupId){
        return new GroupDTO(1L, "test get");
    }

    @PutMapping
    public GroupDTO updateGroup(@RequestBody GroupDTO groupDTO){
        return new GroupDTO(1L, "test update");
    }
}
