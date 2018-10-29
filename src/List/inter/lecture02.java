package List.inter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class lecture02 {

    static void addRandomValue(List<Integer> list, int count) {
        Random random = new Random();
        for (int i = 0; i < count; ++i)
            list.add(random.nextInt(100));
    }
    // 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // bubble sort
    static void bubbleSort(int[] a) {
        for (int i = a.length - 1; i >= 1; --i) {
            for (int j = 0; j < i; ++j) {
                if (a[j] > a[j + 1])
                    swap(a, j, j + 1);
            }
        }
    }

    
	public static void main(String[] args) {
		ArrayList<Integer> ai = new ArrayList<Integer>();
		
		addRandomValue(ai, 200);

		Collections.sort(ai);
		System.out.println(ai);
		
	}
}
