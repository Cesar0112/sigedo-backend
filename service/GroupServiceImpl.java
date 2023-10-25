package cu.edu.cujae.backend.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import cu.edu.cujae.backend.core.dto.*;
import cu.edu.cujae.backend.core.service.*;

@Service
public class GroupServiceImpl implements GroupService{

	@Override
	public ArrayList<GroupDto> getGroups() {
		ArrayList<GroupDto> groups = new ArrayList<>();
		groups.add(new GroupDto(1,1,1));
		groups.add(new GroupDto(2,1,2));
		groups.add(new GroupDto(3,2,1));
		groups.add(new GroupDto(4,2,2));
		groups.add(new GroupDto(5,3,1));
		groups.add(new GroupDto(6,3,2));
		
		return groups;
	}


	@Override
	public void createGroup(GroupDto group) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGroup(GroupDto group) {
		// TODO Auto-generated method stub
		
	}

}
