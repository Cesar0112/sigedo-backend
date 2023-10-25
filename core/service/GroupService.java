package cu.edu.cujae.backend.core.service;

import java.util.ArrayList;
import cu.edu.cujae.backend.core.dto.*;


public interface GroupService {
     ArrayList<GroupDto> getGroups();
     void createGroup(GroupDto group);
     void updateGroup(GroupDto group);
}
