package SqiSchedule.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import SqiSchedule.demo.dto.ScheduleDto;
import SqiSchedule.demo.entity.ScheduleEntity;
import SqiSchedule.demo.repository.ScheduleRepository;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService{
	@Autowired
	private ScheduleRepository scheduleRepository;

	@Override
	public ResponseEntity<?> getSchedule() {
		// TODO Auto-generated method stub
		List<ScheduleEntity> scheduleEntities = scheduleRepository.findAll();
		return ResponseEntity.ok(scheduleEntities);
	}

	@Override
	public ScheduleEntity addSchedule(ScheduleDto dto) {
		ScheduleEntity scheduleEntity = convertToScheduleEntity(dto);
		scheduleRepository.save(scheduleEntity);
		return scheduleEntity;
	}

	@Override
	public ScheduleEntity updateSchedule(Integer id, ScheduleDto dto) {
		// TODO Auto-generated method stub
		ScheduleEntity scheduleEntities = scheduleRepository.findById(id).get();
		scheduleEntities.setTask(dto.getTask());
		scheduleEntities.setApp(dto.getApp());
		scheduleEntities.setFromDate(dto.getFromDate());
		scheduleEntities.setFromTime(dto.getFromTime());
		scheduleEntities.setToDate(dto.getToDate());
		scheduleEntities.setToTime(dto.getToTime());
		scheduleEntities.setColor(dto.getColor());
		return scheduleEntities;
	}

	@Override
	public ScheduleEntity deleteSchedule(Integer id) {
		// TODO Auto-generated method stub
		ScheduleEntity scheduleEntity = scheduleRepository.findById(id).get();
		scheduleRepository.delete(scheduleEntity);
		return scheduleEntity;
	}
	
	//convertDTO
	public ScheduleEntity convertToScheduleEntity(ScheduleDto dto) {
		ScheduleEntity scheduleEntity = new ScheduleEntity();
		scheduleEntity.setTask(dto.getTask());
		scheduleEntity.setApp(dto.getApp());
		scheduleEntity.setFromDate(dto.getFromDate());
		scheduleEntity.setFromTime(dto.getFromTime());
		scheduleEntity.setToDate(dto.getToDate());
		scheduleEntity.setToTime(dto.getToTime());
		scheduleEntity.setColor(dto.getColor());
		return scheduleEntity;
	}

	@Override
	public ResponseEntity<?> getScheduleId(Integer id) {
		// TODO Auto-generated method stub
		ScheduleEntity scheduleEntity = scheduleRepository.findById(id).get();
		return ResponseEntity.ok(scheduleEntity);
		
	}
	
}
