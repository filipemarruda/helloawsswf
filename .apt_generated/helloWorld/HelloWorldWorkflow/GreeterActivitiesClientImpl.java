/**
 * This code was generated from {@link helloWorld.HelloWorldWorkflow.GreeterActivities}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package helloWorld.HelloWorldWorkflow;

import com.amazonaws.services.simpleworkflow.flow.ActivitiesClientBase;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public class GreeterActivitiesClientImpl extends ActivitiesClientBase implements GreeterActivitiesClient {

	public GreeterActivitiesClientImpl() {
        this(null, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public GreeterActivitiesClientImpl(GenericActivityClient genericClient) {
        this(genericClient, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }
    
    public GreeterActivitiesClientImpl(GenericActivityClient genericClient, 
            DataConverter dataConverter, ActivitySchedulingOptions schedulingOptions) {
            
        super(genericClient, dataConverter, schedulingOptions);
    }
    
    @Override
    public final Promise<java.lang.String> getName() {
        return getNameImpl((ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<java.lang.String> getName(Promise<?>... waitFor) {
        return getNameImpl((ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<java.lang.String> getName(ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return getNameImpl(optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<java.lang.String> getNameImpl(final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("GreeterActivities.getName");
		activityType.setVersion("1.0");

        Promise[] _input_ = new Promise[0];

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, java.lang.String.class, waitFor);
    }

    @Override
    public final Promise<java.lang.String> getGreeting(java.lang.String name) {
        return getGreetingImpl(Promise.asPromise(name), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<java.lang.String> getGreeting(java.lang.String name, Promise<?>... waitFor) {
        return getGreetingImpl(Promise.asPromise(name), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<java.lang.String> getGreeting(java.lang.String name, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return getGreetingImpl(Promise.asPromise(name), optionsOverride, waitFor);
    }

    @Override
    public final Promise<java.lang.String> getGreeting(Promise<java.lang.String> name) {
        return getGreetingImpl(name, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<java.lang.String> getGreeting(Promise<java.lang.String> name, Promise<?>... waitFor) {
        return getGreetingImpl(name, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<java.lang.String> getGreeting(Promise<java.lang.String> name, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return getGreetingImpl(name, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<java.lang.String> getGreetingImpl(final Promise<java.lang.String> name, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("GreeterActivities.getGreeting");
		activityType.setVersion("1.0");

        Promise[] _input_ = new Promise[1];
        _input_[0] = name;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, java.lang.String.class, waitFor);
    }

    @Override
    public final Promise<Void> say(java.lang.String what) {
        return sayImpl(Promise.asPromise(what), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Void> say(java.lang.String what, Promise<?>... waitFor) {
        return sayImpl(Promise.asPromise(what), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Void> say(java.lang.String what, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return sayImpl(Promise.asPromise(what), optionsOverride, waitFor);
    }

    @Override
    public final Promise<Void> say(Promise<java.lang.String> what) {
        return sayImpl(what, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Void> say(Promise<java.lang.String> what, Promise<?>... waitFor) {
        return sayImpl(what, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Void> say(Promise<java.lang.String> what, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return sayImpl(what, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<Void> sayImpl(final Promise<java.lang.String> what, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("GreeterActivities.say");
		activityType.setVersion("1.0");

        Promise[] _input_ = new Promise[1];
        _input_[0] = what;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, Void.class, waitFor);
    }

}