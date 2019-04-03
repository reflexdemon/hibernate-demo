package io.vpv.hibernatedemo.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "department")
public class Department {
    @Column(name = "department_id")
    @Id
    private String id;

    @Column(name = "department_name")
    private String departmentName;

}
