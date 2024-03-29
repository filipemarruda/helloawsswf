/**
 * This code was generated from {@link helloWorld.HelloWorldWorkflow.GreeterWorkflow}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package helloWorld.HelloWorldWorkflow;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientFactoryBase;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public class GreeterWorkflowClientFactoryImpl extends WorkflowClientFactoryBase<GreeterWorkflowClient> implements GreeterWorkflowClientFactory {
    
    public GreeterWorkflowClientFactoryImpl() {
        this(null, null, null);
    }

    public GreeterWorkflowClientFactoryImpl(StartWorkflowOptions startWorkflowOptions) {
        this(startWorkflowOptions, null, null);
    }

    public GreeterWorkflowClientFactoryImpl(StartWorkflowOptions startWorkflowOptions, DataConverter dataConverter) {
        this(startWorkflowOptions, dataConverter, null);
    }

    public GreeterWorkflowClientFactoryImpl(StartWorkflowOptions startWorkflowOptions, DataConverter dataConverter,
            GenericWorkflowClient genericClient) {
        super(startWorkflowOptions, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), genericClient);
    }
    
    @Override
    protected GreeterWorkflowClient createClientInstance(WorkflowExecution execution,
            StartWorkflowOptions options, DataConverter dataConverter, GenericWorkflowClient genericClient) {
        WorkflowType workflowType = new WorkflowType();
        workflowType.setName("GreeterWorkflow.greet");
        workflowType.setVersion("1.0");
        return new GreeterWorkflowClientImpl(execution, workflowType, options, dataConverter, genericClient);
    }
   
}