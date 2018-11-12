/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingbackend.dto;

/**
 *
 * @author Saurabh
 */
public class Category {

  private int  id;
  private String  name;
  private String imageURL;
  private String description;
  private boolean active = true;   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", imageURL=" + imageURL + ", description=" + description
				+ ", active=" + active + "]";
	}
    
}

