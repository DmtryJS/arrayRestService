package app.controllers;

import app.dto.MaxValueResponse;
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
public class getMaxValueController {


    private ArrayService arrayService;

    @Autowired
    public getMaxValueController(ArrayService arrayService) {
        this.arrayService = arrayService;
    }

    @RequestMapping(value = "/maxArrayValue", method = RequestMethod.GET)
    public MaxValueResponse getArrayMaxValue(@RequestParam int[] values) {

        int maxValueIndex = arrayService.getMaxValueIndex(values);

        return MaxValueResponse
                .builder()
                .maxValue(maxValueIndex)
                .build();
    }
}
