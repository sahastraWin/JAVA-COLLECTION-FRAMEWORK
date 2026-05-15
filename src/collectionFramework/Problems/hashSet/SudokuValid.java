package collectionFramework.Problems.hashSet;

import java.util.*;
public class SudokuValid {
    public static boolean isValid(char[][] b) {
        HashSet<String> s = new HashSet<>();
        for(int i=0; i<9; i++) for(int j=0; j<9; j++) {
            char c=b[i][j];
            if(c!='.' && (!s.add(c+"r"+i) || !s.add(c+"c"+j) || !s.add(c+"b"+i/3+j/3))) return false;
        }
        return true;
    }
}