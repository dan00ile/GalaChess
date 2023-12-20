package ru.vsu.cs.shul;

import java.util.HashMap;
import java.util.Map;

public class ChessBoard {
    private final Map<String, ChessCell> cells;

    public ChessBoard() {
        cells = new HashMap<>();
        initializeGraph();
    }
    private void initializeGraph() {
        for (int i = 1; i <= 10; i++) {
            for (char j = 'a'; j <= 'j'; j++) {
                String key = j + Integer.toString(i);
                ChessCell vertex = new ChessCell(j, i);
                cells.put(key, vertex);
            }
        }

        for (int i = 1; i <= 10; i++) {
            for (char j = 'a'; j <= 'j'; j++) {
                String key = j + Integer.toString(i);
                ChessCell vertex = cells.get(key);

                addEdge(vertex, j, i + 1);
                addEdge(vertex, j, i - 1);
                addEdge(vertex, (char) (j + 1), i);
                addEdge(vertex, (char) (j - 1), i);

                addEdge(vertex, (char) (j + 1), i + 1);
                addEdge(vertex, (char) (j - 1), i + 1);
                addEdge(vertex, (char) (j + 1), i - 1);
                addEdge(vertex, (char) (j - 1), i - 1);
            }
        }
    }

    private void addEdge(ChessCell from, char toX, int toY) {
        if (toX >= 'a' && toX <= 'j' && toY >= 1 && toY <= 10) {
            String toKey = toX + Integer.toString(toY);
            ChessCell toVertex = cells.get(toKey);
            from.addConnection(toVertex);
        }
    }

    public void makeMove(String from, String to) {




    }

    public void printBoard() {

    }

}
