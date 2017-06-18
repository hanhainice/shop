package tk.mybatis.springboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "activity_user")
public class ActivityUser {
    /**
     * 1
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户头像
     */
    @Column(name = "user_img")
    private String userImg;

    /**
     * 用户昵称
     */
    @Column(name = "user_nick")
    private String userNick;

    /**
     * 推广人编号
     */
    @Column(name = "people_num")
    private String peopleNum;

    /**
     * 用户姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 学校名称
     */
    @Column(name = "school_name")
    private String schoolName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 用户类型 1 是微信 2.qq
     */
    @Column(name = "user_type")
    private String userType;

    /**
     * 项目类型 1.高考活动
     */
    @Column(name = "project_type")
    private String projectType;

    /**
     * 1 男  2 女
     */
    private String sex;

    /**
     * 城市名称
     */
    private String city;

    private String openid;


}