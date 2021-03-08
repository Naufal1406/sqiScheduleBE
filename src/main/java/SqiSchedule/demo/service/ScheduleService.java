package SqiSchedule.demo.service;

import org.springframework.http.ResponseEntity;

import SqiSchedule.demo.dto.ScheduleDto;
import SqiSchedule.demo.entity.ScheduleEntity;

public interface ScheduleService {
	ResponseEntity<?> getSchedule();
	ResponseEntity<?> getScheduleId(Integer id);
	ScheduleEntity addSchedule(ScheduleDto dto);
	ScheduleEntity updateSchedule(Integer id, ScheduleDto dto);
	ScheduleEntity deleteSchedule(Integer id);
}
