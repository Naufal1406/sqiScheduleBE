package SqiSchedule.demo.dto;

import java.time.LocalDateTime;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class ScheduleDto {
	private Integer id;
	private String task;
	private String app;
	private String fromDate;
	private String toDate;
	private String fromTime;
	private String toTime;
	private String color;
	
	public ScheduleDto() {
		super();
	}

	public ScheduleDto(Integer id, String task, String app, String fromDate, String toDate, String fromTime,
			String toTime, String color) {
		super();
		this.id = id;
		this.task = task;
		this.app = app;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.fromTime = fromTime;
		this.toTime = toTime;
		this.color = color;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getFromTime() {
		return fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getToTime() {
		return toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
