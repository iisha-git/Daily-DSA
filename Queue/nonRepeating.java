/*
 * Problem : First non-repeating character in a stream
 * GFG     : https://www.geeksforgeeks.org/first-non-repeating-character-using-one-traversal-of-string/
 * LeetCode: https://leetcode.com/problems/first-unique-character-in-a-string/
 *
 * Approach:
 * Maintain a frequency map/array as characters arrive together with a Queue of
 * characters. Push every new character into the queue, then remove characters from
 * the front while their frequency is greater than 1. The front of the queue (if
 * any) is the first non-repeating character seen so far.
 *
 * (Implementation is left as an exercise in this file.)
 */
package Queue;

public class nonRepeating {
    
}
