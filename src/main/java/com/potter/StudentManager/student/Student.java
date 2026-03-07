//TESTING THE CONFLICT
package com.potter.studentmanager.student;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	private String id;
	private String name;
	private String email;
	private String gender;
}
