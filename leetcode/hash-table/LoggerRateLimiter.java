// Design a logger system that receive stream of messages along with its timestamps, each message should be printed if and only if it is not printed in the last 10 seconds.

// Given a message and a timestamp (in seconds granularity), return true if the message should be printed in the given timestamp, otherwise returns false.

// It is possible that several messages arrive roughly at the same time.

// Example:

// Logger logger = new Logger();

// // logging string "foo" at timestamp 1
// logger.shouldPrintMessage(1, "foo"); returns true; 

// // logging string "bar" at timestamp 2
// logger.shouldPrintMessage(2,"bar"); returns true;

// // logging string "foo" at timestamp 3
// logger.shouldPrintMessage(3,"foo"); returns false;

// // logging string "bar" at timestamp 8
// logger.shouldPrintMessage(8,"bar"); returns false;

// // logging string "foo" at timestamp 10
// logger.shouldPrintMessage(10,"foo"); returns false;

// // logging string "foo" at timestamp 11
// logger.shouldPrintMessage(11,"foo"); returns true;

public class LoggerRateLimiter {
    HashMap<String, Integer> messages;

    /** Initialize your data structure here. */
    public Logger() {
       this.messages = new HashMap<String, Integer>(); 
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(messages.containsKey(message)) {
            if(timestamp - messages.get(message) >= 10) {
                messages.put(message, timestamp);
                return true;
            } else {
                return false;
            }
        } else {
            messages.put(message, timestamp);
            return true;
        }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
