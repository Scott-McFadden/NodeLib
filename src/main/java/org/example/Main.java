package org.example;

import lib.BoardObjectType;
import lib.NodeBoard;

import java.awt.*;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        BoardObjectType d = new BoardObjectType(new Point(4,4), UUID.randomUUID());

        NodeBoard b = new NodeBoard();

        b.setBoardHeight(10);
        b.setBoardWidth(10);
        b.setNodes(8);
        b.InitializeBoard();
        System.out.println(b.PrintBoard());
    }
}