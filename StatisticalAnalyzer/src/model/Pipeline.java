package model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Pipeline {
    private List<Step> pipelineSteps = new ArrayList<>();
    private Object firstStepInput;

    public Pipeline(Object firstStepInput) {
        this.firstStepInput = firstStepInput;
    }

    public void addStep(Step step) {
        pipelineSteps.add(step);
    }

    public Object execute() {
        for (Step step : pipelineSteps) {
            Object out =  step.execute(firstStepInput);
            firstStepInput = out;
        }
        return firstStepInput;
    }
}
