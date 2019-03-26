package com.dr.kotlinapplication.demo03

/**
 * 项目名称：KotlinApplication
 * 类描述：动态代理--被代理类 猫
 * 创建人：yuliyan
 * 创建时间：2019/3/26 4:52 PM
 * 修改人：yuliyan
 * 修改时间：2019/3/26 4:52 PM
 * 修改备注：
 * @version
 */
class Cat : Animal {
    override fun bark() {
        println("喵喵喵")
    }
}
