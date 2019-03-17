package com.likzn.design_pattern.principle.demeter;

/**
 * @auther: Li jx
 * @date: 2019/3/17 15:49
 * @description: 根据知识最少原则，Boss跟TeamLeader有依赖,跟Course无依赖，只跟朋友交流，减少陌生人交流
 */
public class Boss {
    public void checkCourseNumByTeamleader(TeamLeader teamLeader) {
        teamLeader.checkCourseNums();

    }
}
