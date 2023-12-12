package phone.entitys;

public class PhoneCover {
    private String coverMaterial;
    private String coverColor;

    public PhoneCover(String coverMaterial, String coverColor) {
        this.coverMaterial = coverMaterial;
        this.coverColor = coverColor;
    }

    public String getCoverMaterial() {
        return coverMaterial;
    }

    public String getCoverColor() {
        return coverColor;
    }
}
