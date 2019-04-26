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
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        int maxValue = sortedArray[sortedArray.length - 1];
        return IntStream.range(0, array.length)
                .filter(i -> array[i] == maxValue)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("fds"));
    }
}
