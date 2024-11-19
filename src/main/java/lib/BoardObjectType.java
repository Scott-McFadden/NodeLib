package lib;

import java.awt.*;
import java.util.UUID;



public class BoardObjectType {

//    public BoardObjectType(int x, int y){
//        Location.x   =  x;
//        Location.y = y;
//    }
//
    public BoardObjectType(){}
    public BoardObjectType(Point p, UUID id ){
        this.Location = p;
        this.Id = id;
    }
    public BoardObjectType(int x, int y, UUID id ){
        this.Location = new Point(x,y);
        this.Id = id;
    }

    public Point Location = new Point();

    public UUID Id = UUID.randomUUID();

    public String Symbol = "*";


}

