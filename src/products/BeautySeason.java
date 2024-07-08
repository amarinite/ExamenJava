package products;

public enum BeautySeason {
    spring,
    summer,
    autumn,
    winter;

    public String getSeason() {
        return switch (this) {
            case spring -> "spring";
            case summer -> "summer";
            case autumn -> "autumn";
            case winter -> "winter";
            default -> null;
        };
    }
}