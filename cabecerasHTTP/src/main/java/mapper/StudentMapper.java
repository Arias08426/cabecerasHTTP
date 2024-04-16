package mapper;

import DTO.StudentDto;
import model.StudentXLS;

public class StudentMapper {
    public static StudentDto mapfrom (StudentXLS student){
        return new StudentDto(student.getId(),student.getName(),student.getEmail(),student.getSemester());
    }
    public static StudentXLS mapfrom (StudentXLS student) {
        return StudentXLS.builder()
                .id(student.id())
                .name(student.name())
                .email(student.email())
                .semester(student.semester())
                .build();
    }
}
