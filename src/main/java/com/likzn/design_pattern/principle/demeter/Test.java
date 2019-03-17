package com.likzn.design_pattern.principle.demeter;

/**
 * @auther: Li jx
 * @date: 2019/3/17 15:49
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.checkCourseNumByTeamleader(teamLeader);

    }
}
