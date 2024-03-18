package com.tddexample.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import com.tddexample.tdd.model.Employee;
import com.tddexample.tdd.model.User;



@SpringBootTest
class TddExampleApplicationTests {
	@Test
    void testInheritance() {
        assertEquals(User.class, Employee.class.getSuperclass(),
                "Employee should extends User");
    }
	
	
	@ParameterizedTest
    @ValueSource(classes = {Employee.class, User.class})
    void testImplements(Class<?> type) {
        assertTrue(getInterfaces(type).stream()
                        .anyMatch(i -> i == Serializable.class),
                "Class should implements Serializable");
    }
	
	@Test
	  void testEmployeeToString() {
		  long id=1;
		  String email="admin@vpa.com";
		  String password="kY$60#25#IL";
		  String name="Admin";
		  String phone="111-602-23-00";
		  String dateOfBirth="1996-07-03";
		  String expected="Employee{id=1, email='admin@vpa.com', name='Admin', phone='111-602-23-00', dateOfBirth=1996-07-03}";
LocalDate date = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("yyyy-MM-dd"));


String actual = new Employee(id, email, password, name, phone, date).toString();
assertEquals(expected, actual);
}
	static List<Class<?>> getInterfaces(Class<?> type) {
        List<Class<?>> list = new ArrayList<>();
        for (; type != Object.class; type = type.getSuperclass()) {
            list.addAll(Arrays.asList(type.getInterfaces()));
        }
        return list;
    }


}
