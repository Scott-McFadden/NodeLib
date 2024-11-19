package lib;

import java.awt.*;
import java.util.List;
import java.util.*;

public class NodeBoard {

    private StateType state = StateType.constructing;
    private int BoardWidth = 0;


    public NodeBoard(){

        state = StateType.ready;
    }
    public int getBoardWidth() {
        return BoardWidth;
    }

    public void setBoardWidth(int boardWidth) {
        BoardWidth = boardWidth;
    }

    private int BoardHeight = 0;

    public int getBoardHeight() {
        return BoardHeight;
    }

    public void setBoardHeight(int boardHeight) {
        BoardHeight = boardHeight;

    }

    private  int nodes=0;

    public HashMap<UUID, BoardObjectType>  ObjectList = new HashMap<>();
    public String[][] board;
    public void InitializeBoard(){
        state=StateType.buildingBoard;
        AddNodes(nodes);
        state=StateType.ready;
    }
    public void AddNodes(int x){
        List<Point> pointList = new ArrayList<Point>();

        for(int a=0; a<x; a++) {
            UUID id = UUID.randomUUID();
            int v = RandomNumber(getBoardWidth());
            int y = RandomNumber(getBoardHeight());
            Point p = new Point(v,y);
            if (!pointList.contains(p)) {
                pointList.add(p);
                ObjectList.put(id, new BoardObjectType(v, y, id));
            }
            else
                a--;
        }

    }

    private Random rn = new Random();
    public int RandomNumber(int x)
    {
        int n = x;
        int r = rn.nextInt() % n;

        return   r  >0 ? r : -r ;
    }


    public String PrintBoard(){
        board = new String[BoardHeight][BoardWidth];
        for(int a=0; a<BoardWidth; a++)
            for (int b=0; b<BoardHeight; b++)
                board[a][b] = ".";
        for( BoardObjectType v : ObjectList.values())
        {
            board[v.Location.x][v.Location.y] = v.Symbol;
        }
        StringBuilder sb = new StringBuilder();
        for(int a=0; a<BoardWidth; a++) {
            sb.append(a);
            sb.append(" ");
            for (int b=0; b<BoardHeight; b++)
                sb.append(board[a][b]);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public int getNodes() {
        return ObjectList.size();
    }

    public void setNodes(int nodes) {
        this.nodes = nodes;
    }
}

