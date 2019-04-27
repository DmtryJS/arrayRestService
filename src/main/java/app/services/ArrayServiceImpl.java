package app.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by user on 26.04.2019.
 */
@Service
public class ArrayServiceImpl implements ArrayService {
    @Override
    public int getMaxValueIndex(int[] array) {
        int maxIndex = 0;
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
