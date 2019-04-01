package com.likzn.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: Li jx
 * @date: 2019/3/28 20:06
 * @description:
 */
public class MangerFactory {
    private static Map<String, Employer> map = new HashMap<String, Employer>();

    public static Employer getManger(String department) {
        Manager employer = (Manager) map.get(department);
        if (null == employer) {
            employer = new Manager(department);
            map.put(department, employer);
            System.out.print("创建部门:" + department+" ");
            String reportContent =department+"开始作报告.....";
            employer.setReportContent(reportContent);
        }
        return employer;
    }

}
