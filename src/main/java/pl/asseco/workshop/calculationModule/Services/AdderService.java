package pl.asseco.workshop.calculationModule.Services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.asseco.workshop.calculationModule.Aspects.LoggingObject;

/**
 * Created by krzysztof.bogucki on 24 lip 2017.
 */
@Service
public class AdderService {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Autowired
    private AdderProvider adderProvider;

    @LoggingObject
    public void sum(){

        Integer sum = 0;
        for (Integer item: adderProvider.getItems()) {
            sum += item;
        }
        logger.info("Obliczono sumę w serwisie i wynosi ona " + sum.toString());
    }

}
