package industries.kvmo.services.controllers;

import industries.kvmo.services.helpers.ProcessorContext;
import industries.kvmo.services.workflow.AddScheduleWorkflow;
import industries.kvmo.v1.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * This Controller is used to add games to the schedule
 */
@RestController
@RequestMapping("v1/schedule")
public class PostScheduleController {

    @Autowired
    private AddScheduleWorkflow workflow;

    @RequestMapping(method = RequestMethod.POST)
    public void post(@RequestBody Schedule requestSchedule ) {
        ProcessorContext context = new ProcessorContext();
        context.set("REQUST_SCHEDULE", requestSchedule);
        if (didWorkflowFail(context)) {
            throw new RuntimeException("Oh shit!");
        }

    }

    private boolean didWorkflowFail(ProcessorContext context) {
        return !workflow.process(context);
    }
}
