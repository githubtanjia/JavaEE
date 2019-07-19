package cn.domain;

/**
 * @Author: tanjia
 * @Date: 2019/7/18 17:49
 */
public class Account {
    private Integer id;
    private Integer uid;
    private String name;

    private User user;//一对一

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Account() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", name='" + name + '\'' +
                ", user=" + user +
                '}';
    }
}
