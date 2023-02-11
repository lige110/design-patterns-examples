//package org.patterns.structural.proxy.twitterExample;
//
//import twitter4j.Twitter;
//import twitter4j.TwitterException;
//import twitter4j.v1.Query;
//import twitter4j.v1.QueryResult;
//import twitter4j.v1.Status;
//
//import java.util.List;
//
//public class TwitterServiceImpl implements TwitterService {
//
//    private static final String TWITTER_CONSUMER_KEY = "DYXuKbVfKXJJfmuNF3n6nvXoU";
//    private static final String TWITTER_SECRET_KEY = "96KsoEYHnUmmT80Dei5uzpmAmXPD4OlxEMjRKabDIc5XodJZew";
//    private static final String TWITTER_ACCESS_TOKEN = "1082624647261237248-9PQ99wjdo6CHeoKIwWNMNuSriwkiG2";
//    private static final String TWITTER_ACCESS_TOKEN_SECRET = "O7BK8xIcn9yee6d6MEBAeloMMaJNBlzQrcjKtETN7piFJ";
//
//    private static Twitter twitter = null;
//    private static TwitterServiceImpl service = null;
//
//    private TwitterServiceImpl() {
//    }
//
//    public static TwitterServiceImpl newInstance() {
//        if (service == null) {
//            twitter = Twitter.newBuilder()
//                    .prettyDebugEnabled(true)
//                    .oAuthConsumer(TWITTER_CONSUMER_KEY, TWITTER_SECRET_KEY)
//                    .oAuthAccessToken(TWITTER_ACCESS_TOKEN, TWITTER_ACCESS_TOKEN_SECRET)
//                    .build();
//            service = new TwitterServiceImpl();
//        }
//
//        return service;
//    }
//
//
//    @Override
//    public String getTimeline(String screenName) {
//
//
//        StringBuilder builder = new StringBuilder();
//        try {
//            Query query = Query.of(screenName);
//            QueryResult result;
//            do {
//                result = twitter.v1().search().search(query);
//                List<Status> tweets = result.getTweets();
//                for (Status tweet : tweets) {
//                    builder.append("@").append(tweet.getUser().getScreenName()).append(" - ").append(tweet.getText());
//                    builder.append("\n");
//                }
//            } while ((query = result.nextQuery()) != null);
//
//        } catch (TwitterException te) {
//            te.printStackTrace();
//            System.out.println("Failed to search tweets: " + te.getMessage());
//        }
//        return builder.toString();
//    }
//
//    @Override
//    public void postToTimeline(String screenName, String message) {
//        //we aren't going to allow this
//        System.out.println(message);
//    }
//}
