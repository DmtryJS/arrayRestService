package app.controllers;

import app.dto.MaxValueIndexResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import app.services.ArrayService;

/**
 * Created by user on 26.04.2019.
 */
@RestController
public class ArrayController {


    private ArrayService arrayService;

    @Autowired
    public ArrayController(ArrayService arrayService) {
        this.arrayService = arrayService;
    }

    @RequestMapping(value = "/maxValueIndex", method = RequestMethod.GET)
    public MaxValueIndexResponse getArrayMaxValue(@RequestParam int[] values) {

        int maxValueIndex = arrayService.getMaxValueIndex(values);

        return MaxValueIndexResponse
                .builder()
                .index(maxValueIndex)
                .build();
    }
}
