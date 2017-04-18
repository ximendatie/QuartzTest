package test;

import org.quartz.SchedulerException;

import test.Schedule;

public class Main{
	public static void main(String[] args) throws SchedulerException{
		Schedule mySchedule = new Schedule(); 
		mySchedule.doSchedule();
	}
}