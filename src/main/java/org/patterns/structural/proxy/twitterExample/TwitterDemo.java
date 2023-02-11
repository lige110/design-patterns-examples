package org.patterns.structural.proxy.twitterExample;

public class TwitterDemo {
    public static void run() {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

        String timeLine = service.getTimeline("whatever");
        System.out.println(timeLine);
    }
}
