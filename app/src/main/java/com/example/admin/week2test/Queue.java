package com.example.admin.week2test;

import java.util.Stack;
class test {
    static class Queue {

        //Create 2 stacks. the top of stack1 keeps track of the oldest element, top of stack2 newest element
        static Stack<String> stack1 = new Stack<String>();
        static Stack<String> stack2 = new Stack<String>();

        private static void enqueue(String x) {
            //put all elements in stack1 into stack2, ending with 2 stacks with opp. order
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            //put new item onto stack1
            stack1.push(x);

            //finish with putting everything back onto stack1
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        //Remove an object from the queue and return that object
        private static String deQueue() {
            //make sure stack isn't empty, if it is nothing can be removed, if it's not remove.
            if (!stack1.isEmpty()) {
                //return the object on the top of stack1 w/o removing it, save the value
                String str = stack1.peek();
                //remove the object from the stack
                stack1.pop();
                return str;
            }
            else{
                return "";
            }

        }
    }
}
