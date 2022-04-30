package com.mp.sapp.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.mp.sapp.model.Student;

@Component
public class StudentListener {
    
	@KafkaListener(topics="netsurfingzone-topic-1",groupId="lbs")
	public void listenStudentTopic(Student student) {
		System.out.println("------------");
		System.out.println(student);
	}
	
}
