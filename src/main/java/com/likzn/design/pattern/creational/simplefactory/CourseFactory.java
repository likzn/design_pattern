package com.likzn.design.pattern.creational.simplefactory;

/**
 * @auther: Li jx
 * @date: 2019/3/17 16:31
 * @description:
 */
public class CourseFactory {
    //    public ICourse getCourse(String type) {
    //        if ("java".equalsIgnoreCase(type)) {
    //            return new JavaCourse();
    //        } else if ("python".equalsIgnoreCase(type)) {
    //            return new PythonCourse();
    //        }
    //        return null;
    //    }
/**
 * @Author Li jx
 * @Description 使用反射更加符合开闭原则
 * @Date 16:37 2019/3/17
 * @Param [clazz]
 * @return ICourse
 **/
    public ICourse getCourse(Class clazz) {
        ICourse iCourse = null;
        try {
            iCourse = (ICourse) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return iCourse;
    }
}
