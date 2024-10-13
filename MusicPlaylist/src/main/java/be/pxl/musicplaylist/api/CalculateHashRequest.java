package be.pxl.musicplaylist.api;

public class CalculateHashRequest {
    private String algorithm;
    private String text;

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
