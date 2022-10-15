package cn.itnanls.studyspringboot;

import cn.itnanls.studyspringboot.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(UserSelector.class)
public class StudySpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringbootApplication.class, args);
	}

}
