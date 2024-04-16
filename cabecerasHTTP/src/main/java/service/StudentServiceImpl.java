package service;

import DTO.StudentDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentServiceImpl implements  StudentService{
    private List<StudentDto> students;
    public StudentServiceImpl(){
        students = new ArrayList<>(Arrays.asList(
                new StudentDto(12L,"samuel","samuel","cuarto");
                new StudentDto(12L,"santiago","santiago@gmail.com","cuarto");
        ));
    }

    @Override
    public List<StudentDto> listar() {
        return students;
    }
}
