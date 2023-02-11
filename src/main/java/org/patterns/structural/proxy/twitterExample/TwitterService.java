package org.patterns.structural.proxy.twitterExample;

public interface TwitterService {
    String getTimeline(String screenName);
    void postToTimeline(String screenName, String message);
}
