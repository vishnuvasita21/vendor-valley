package com.group10.Model;

public class Category
{
    private int categoryId;
    private String categoryName;
    private String categoryDescription;
    private int totalServices;
    private String base64Image;

    // also add the images to the database and the correpsonding field here


    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public int getTotalServices() {
        return totalServices;
    }

    public String getBase64Image() {
        return base64Image;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public void setTotalServices(int totalServices) {
        this.totalServices = totalServices;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }
}
