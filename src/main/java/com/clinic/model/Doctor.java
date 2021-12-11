package com.clinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_bacsi")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

	@Id
	private int doctorId;
	private String nameLogin;
	private String name;
	private String specialist;
}
