package email_sorting;

import java.time.LocalDateTime;

public class Email implements Comparable<Email> {
    private long mailid;
    private String from;
    private String subject;
    private String body;
    private LocalDateTime rec_time;

    public Email(long mailid, String from, String subject, String body, LocalDateTime rec_time) {
        this.mailid = mailid;
        this.from = from;
        this.subject = subject;
        this.body = body;
        this.rec_time = rec_time;
    }

    @Override
    public String toString() {
        return "mailid = " + mailid +
               "\t mail from=" + from +
               "\t subject=" + subject +
               "\t body=" + body +
               "\t rec_time=" + rec_time + "]";
    }

    @Override
    public int compareTo(Email o) {
        return o.rec_time.compareTo(this.rec_time);
    }
}

