package uk.co.gamma.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@Configuration
public class ApplicationConfig {

    @Autowired
    private Environment environment;

    private boolean blackListingEnabled;

    private int retry;

    @PostConstruct
    private void populateProperties(){
        blackListingEnabled = environment.getProperty("addresses.blackListing.enabled",Boolean.class);
        retry = environment.getProperty("addresses.blackListing.retry",Integer.class);
    }

    public boolean isBlackListingEnabled() {
        return blackListingEnabled;
    }

    public int getRetry() {
        return retry;
    }
}
