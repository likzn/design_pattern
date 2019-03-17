package com.likzn.design_pattern.dependenceinversion;

import lombok.Setter;

/**
 * @auther: Li jx
 * @date: 2019/3/17 12:48
 * @description:
 */
@Setter
public class People {

    private ICourse iCourse;

    public void studyCourse(){
        iCourse.studyCourse();
    }

}
