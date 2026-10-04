package date_equality;

class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Date other = (Date) obj;
        return this.day == other.day &&
               this.month == other.month &&
               this.year == other.year;
    }
    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

