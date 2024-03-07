public class House {
    private float floorArea;
    private int floors;
    private boolean balcony;

    public House( float floorArea, int floors, boolean balcony){
        this.floorArea = floorArea;
        this.floors = floors;
        this.balcony = balcony;
    }

    //ToDo: 2 weitere Konstruktoren die weniger Werte annehmen
    // und die restlichen Werte als Standard setzen
    public House( float floorArea){
        this.floorArea = floorArea;
        this.floors = 2;
        this.balcony = false;
    }

    public House( float floorArea, int floors){
        this.floorArea = floorArea;
        this.floors = floors;
        this.balcony = false;
    }

    public void setFloors(int floors){
        this.floors = floors;
    }
     


}
