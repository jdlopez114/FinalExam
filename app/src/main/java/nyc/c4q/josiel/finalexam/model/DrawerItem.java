package nyc.c4q.josiel.finalexam.model;


public class DrawerItem {

    public int drawerDescription;
    public int imageId;

    public DrawerItem(int imageId, int drawerDescription) {
        this.imageId = imageId;
        this.drawerDescription = drawerDescription;
    }

    public int getDrawerDescription() {
        return drawerDescription;
    }

    public void setDrawerDescription(int drawerDescription) {
        this.drawerDescription = drawerDescription;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}