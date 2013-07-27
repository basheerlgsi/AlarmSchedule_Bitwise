package ex.alarm;

public class Schedule {

	private int scheduleDay;
	private int scheduleMinutes;

	public Schedule(int day, int minutes) {
		this.scheduleDay = day;
		this.scheduleMinutes = minutes;
	}

	public boolean CheckDayandTime(int currentDay, int currentMinute) {

		return (((currentDay & scheduleDay) == currentDay) && (currentMinute == scheduleMinutes));

	}
}
