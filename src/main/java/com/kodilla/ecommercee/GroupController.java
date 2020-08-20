package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.GroupDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/group")
public class GroupController {

    @RequestMapping(method = RequestMethod.GET, value = "getGroups")
    public List<GroupDTO> getGroups(){

        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.POST, value = "createGroup")
    public void createGroup(GroupDTO groupDTO){

    }

    @RequestMapping(method = RequestMethod.GET, value = "getGroup")
    public GroupDTO getGroup(Long groupId){

        return new GroupDTO(1L, "test name");
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateGroup")
    public GroupDTO updateGroup(GroupDTO groupDTO){

        return new GroupDTO(1L, "updated test name");
    }

}
