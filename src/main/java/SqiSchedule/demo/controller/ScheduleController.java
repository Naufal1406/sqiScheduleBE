package SqiSchedule.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SqiSchedule.demo.dto.ScheduleDto;
import SqiSchedule.demo.entity.ScheduleEntity;
import SqiSchedule.demo.service.ScheduleServiceImpl;

@RestController
@RequestMapping("/sqi-schedule")
@CrossOrigin(origins="http://localhost:3000")
//@CrossOrigin
public class ScheduleController {
	
	@Autowired
	ScheduleServiceImpl scheduleService;
	
	@GetMapping("/get-schedule")
	public ResponseEntity<?> getSchedule(){
		return scheduleService.getSchedule();
	}
	
	@GetMapping("get-scheduleById/{id}")
	public ResponseEntity<?> getScheduleById(@PathVariable Integer id){
		return scheduleService.getScheduleId(id);
	}
	
	@PostMapping("/add-schedule")
	public ResponseEntity<?> addSchedule(@RequestBody ScheduleDto dto){
		ScheduleEntity scheduleEntity = scheduleService.addSchedule(dto);
		return ResponseEntity.ok(scheduleEntity);
	}
	
	@PutMapping("/update-schedule/{id}")
	public ResponseEntity<?> updateSchedule(@PathVariable Integer id,
			@RequestBody ScheduleDto dto){
		ScheduleEntity scheduleEntity = scheduleService.updateSchedule(id, dto);
		return ResponseEntity.ok(scheduleEntity);
		
	}
	
	@DeleteMapping("delete-schedule/{id}")
	public ResponseEntity<?> deleteSchedule(@PathVariable Integer id){
		ScheduleEntity scheduleEntity = scheduleService.deleteSchedule(id);
		return ResponseEntity.ok(scheduleEntity);
		
	}
}
