package src.service.vehicle.features.car.segment.model;

public enum DefaultCarSegment {

    ECONOMIC("Ekonomik"),
    BUSINESS("Ticari"),
    PREMIUM("Premium"),
    VAN("Van"),
    SPORT("Spor");

    private final String label;

    DefaultCarSegment(String label) {
        this.label = label;
    }

    public static DefaultCarSegment[] getAll() {
        return values();
    }

    public String getLabel() {
        return label;
    }
}
