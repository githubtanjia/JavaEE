package cn.tanjia.reflect.domain;

/**
 * @Author: tanjia
 * @Date: 2019/7/6 23:14
 */
public class Student {
    private String score;

    public Student() {
    }

    public Student(String score) {
        this.score = score;
    }

    public void t(){
        System.out.println("学生t...");
    }
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score='" + score + '\'' +
                '}';
    }
}
