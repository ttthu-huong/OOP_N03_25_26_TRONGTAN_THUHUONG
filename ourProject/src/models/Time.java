import java.time.LocalTime;
import java.time.Duration;

public class Time {
    private LocalTime start;
    private LocalTime end;

    public Time(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    public LocalTime getStart() { return start; }
    public LocalTime getEnd() { return end; }

    public void setStart(LocalTime start) { this.start = start; }
    public void setEnd(LocalTime end) { this.end = end; }

    // Trả về khoảng thời gian theo phút (end - start)
    public long getDurationMinutes() {
        return Duration.between(start, end).toMinutes();
    }

    // Kiểm tra start < end
    public boolean isStartBeforeEnd() {
        return start.isBefore(end);
    }

    // Cộng thêm phút vào start hoặc end
    public void addMinutesToStart(long minutes) {
        this.start = this.start.plusMinutes(minutes);
    }
    public void addMinutesToEnd(long minutes) {
        this.end = this.end.plusMinutes(minutes);
    }

    public void showTime() {
        System.out.println("Start: " + start + " | End: " + end + " | Duration: " + getDurationMinutes() + " minutes");
    }
}
