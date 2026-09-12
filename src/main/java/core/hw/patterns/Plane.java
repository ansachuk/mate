package core.hw.patterns;

public class Plane {
    String name;
    int engines;
    int seats;
    String color;
    boolean isAvailable;

    private Plane(String name, int engines, int seats, String color, boolean isAvailable) {
        this.engines = engines;
        this.name = name;
        this.seats = seats;
        this.color = color;
        this.isAvailable = isAvailable;
    }

    static class Builder {
        String name;
        int engines;
        int seats;
        String color;
        boolean isAvailable;

        public void setName(String name) {
            this.name = name;
        }

        public void setEngines(int engines) {
            this.engines = engines;
        }

        public void setSeats(int seats) {
            this.seats = seats;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }

        public Plane build() {
            return new Plane(name, engines, seats, color, isAvailable);
        }
    }
}
