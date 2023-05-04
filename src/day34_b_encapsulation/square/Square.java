package day34_b_encapsulation.square;

public class Square {
    //Data: instance variable- called side

    private int side;




    //Make constructor- accepts one argue- side

    public Square (int side) {
        if (side > 0) {
            this.side = side;
        }
    }






    //assign value to the instance variable - side indirectly : this means it needs to be private.
    //if side is over 0

    public int getSide () {
        return side;
    }

    public int calculateArea () {
        return side * side;
    }


    public int calculatePerimeter () {
        return 4 * side;
    }











}
