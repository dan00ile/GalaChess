package ru.vsu.cs.shul;

import java.util.ArrayList;
import java.util.List;

public class ChessCell {
    private final char x;
    private final int y;
    private final List<ChessCell> connections;

    public ChessCell(char x, int y) {
        this.x = x;
        this.y = y;
        connections = new ArrayList<>();
    }

    public void addConnection(ChessCell cell) {
        connections.add(cell);
    }

    public List<ChessCell> getConnections(ChessCell cell) {
        return connections;
    }

    @Override
    public String toString() {
        return String.valueOf(x) + y;
    }
}
