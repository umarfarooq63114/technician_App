package com.example.umar.technician_app.Model;

public class Technician {
    private String name;
    private int image;
    private String category;
    private float ratingBar;
    private String status;

    public Technician(String name, int image, String category, float ratingBar, String status) {
        this.name = name;
        this.image = image;
        this.category = category;
        this.ratingBar = ratingBar;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getRatingBar() {
        return ratingBar;
    }

    public void setRatingBar(float ratingBar) {
        this.ratingBar = ratingBar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
