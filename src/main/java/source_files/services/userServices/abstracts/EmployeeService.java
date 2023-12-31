package source_files.services.userServices.abstracts;


import source_files.data.DTO.userDTOs.EmployeeDTO;
import source_files.data.requests.userRequests.AddEmployeeRequest;
import source_files.data.requests.userRequests.UpdateEmployeeRequest;

import java.util.List;

public interface EmployeeService {

    EmployeeDTO add(AddEmployeeRequest addEmployeeRequest);

    EmployeeDTO update(UpdateEmployeeRequest updateEmployeeRequest);

    EmployeeDTO getById(int id);

    List<EmployeeDTO> getAll();

    List<EmployeeDTO> findAllBySalaryBetween(double salary1, double salary2);

    List<EmployeeDTO> getAllByIsDeletedFalse();

    List<EmployeeDTO> getAllByIsDeletedTrue();

    EmployeeDTO getByPhoneNumber(String phoneNumber);

    void delete(int id, boolean hardDelete);

    void hardDelete(int id);

    void softDelete(int id);
}
