package uk.ac.westminster.products_api.dto;

public class DigitalProduct {

    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct(String downloadUrl, double fileSizeMB) {
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }
}
