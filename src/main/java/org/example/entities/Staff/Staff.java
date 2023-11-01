package org.example.entities.Staff;

import org.example.entities.User;
import org.example.enums.Roles;

import javax.management.relation.Role;
import java.math.BigDecimal;
import java.time.LocalDate;


public abstract class Staff extends User {

    private Long id;
    private Role role;
    private BigDecimal staffSalary;
    public static final BigDecimal SALARY_1 = new BigDecimal(22000);
    public static final BigDecimal SALARY_2 = new BigDecimal(10000);
    public static final BigDecimal SALARY_3 = new BigDecimal(400000);


}
