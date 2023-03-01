package com.queue;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author xhy
 * @date 2022/7/26 22:45
 */
public class PriorityBlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        priorityBlockingQueue.add(new Student(6,"zhangsan"));
        priorityBlockingQueue.add(new Student(13,"zhangsan"));
        priorityBlockingQueue.add(new Student(8,"zhangsan"));
        priorityBlockingQueue.add(new Student(9,"zhangsan"));
        System.out.println("-----------------"+priorityBlockingQueue);
        System.out.println(priorityBlockingQueue.take());
        System.out.println(priorityBlockingQueue.take());
        System.out.println(priorityBlockingQueue.take());
        System.out.println(priorityBlockingQueue.take());


    }

    static class Student implements Comparable<Student>{
        private int age;
        private String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Student student) {
            return this.getAge()-student.getAge();
        }
    }
}
