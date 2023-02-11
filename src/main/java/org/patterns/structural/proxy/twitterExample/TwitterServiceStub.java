package org.patterns.structural.proxy.twitterExample;

public class TwitterServiceStub implements TwitterService{
    @Override
    public String getTimeline(String screenName) {
        return "My neato time line";
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println(message + " is posted to mey time line.");
    }
}
