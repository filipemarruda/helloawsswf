/**
 * This code was generated from {@link helloWorld.HelloWorldWorkflow.GreeterWorkflow}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package helloWorld.HelloWorldWorkflow;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientBase;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

class GreeterWorkflowClientImpl extends WorkflowClientBase implements GreeterWorkflowClient {

    public GreeterWorkflowClientImpl(WorkflowExecution workflowExecution, WorkflowType workflowType,  
            StartWorkflowOptions options, DataConverter dataConverter, GenericWorkflowClient genericClient) {
        super(workflowExecution, workflowType, options, dataConverter, genericClient);
    }
    
    @Override
    public final Promise<Void> greet() {
        return greet((StartWorkflowOptions)null);
    }

    @Override
    public final Promise<Void> greet(Promise<?>... waitFor) {
        return greet((StartWorkflowOptions)null, waitFor);
    }
    
    @Override
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public final Promise<Void> greet(StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        return (Promise) startWorkflowExecution(new Object[0], optionsOverride, Void.class, waitFor);
    }
    	

}