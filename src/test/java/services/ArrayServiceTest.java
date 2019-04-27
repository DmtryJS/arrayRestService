package services;

import app.services.ArrayService;
import app.services.ArrayServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class ArrayServiceTest {

    @TestConfiguration
    static class ArrayServiceImplTestContextConfiguration {

        @Bean
        public ArrayService employeeService() {
            return new ArrayServiceImpl();
        }
    }

    @Autowired
    private ArrayService arrayService;

    @Test
    public void setArrayServicePositiveValuesTest() {
        assertThat(arrayService.getMaxValueIndex(0,1,33,16)).isEqualTo(2);
    }

    @Test
    public void setArrayServiceNegativeValuesTest() {
        assertThat(arrayService.getMaxValueIndex(-10,-3,-5,-1)).isEqualTo(3);
    }

    @Test
    public void setArrayServiceMixValuesTest() {
        assertThat(arrayService.getMaxValueIndex(-10,0,10,-1)).isEqualTo(2);
    }
}
