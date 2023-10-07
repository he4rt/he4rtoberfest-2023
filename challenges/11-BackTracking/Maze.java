package Java.Youtube.BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(pathRetDiagonal("" ,3, 3));

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        pathRestrictions("", maze,0, 0);
    }

    static int count(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        int left = count(row - 1, col);
        int right = count(row, col - 1);
        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + 'D' , r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list  = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans  = new ArrayList<>();

        if (r > 1) {
            ans.addAll(pathRet(p + 'D' , r - 1, c));
        }
        if (c > 1) {
            ans.addAll(pathRet(p + 'R', r, c - 1));
        }
        return ans;
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list  = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans  = new ArrayList<>();

        if (c > 1 && r > 1) {
            ans.addAll(pathRetDiagonal(p + 'D', r - 1, c - 1));
        }

        if (r > 1) {
            ans.addAll(pathRetDiagonal(p + 'V' , r - 1, c));
        }
        if (c > 1) {
            ans.addAll(pathRetDiagonal(p + 'H', r, c - 1));
        }
        return ans;
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1&& c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            pathRestrictions(p + 'D' , maze, r + 1, c);
        }
        if (c < maze.length - 1) {
            pathRestrictions(p + 'R', maze, r, c + 1);
        }
    }
}