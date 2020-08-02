package org.activiti;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {
    @Autowired
    private RuntimeService runtimeService;

    @RequestMapping(value = "init", method = RequestMethod.GET)
    public void testInit(){
        runtimeService.startProcessInstanceByKey("Proc1");
        System.out.println(runtimeService.createExecutionQuery().count());
    }
}
