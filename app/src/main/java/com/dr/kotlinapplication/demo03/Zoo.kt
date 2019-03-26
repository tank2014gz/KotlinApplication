package com.dr.kotlinapplication.demo03

/**
 * 项目名称：KotlinApplication
 * 类描述：动态代理--代理类
 * 创建人：yuliyan
 * 创建时间：2019/3/26 4:49 PM
 * 修改人：yuliyan
 * 修改时间：2019/3/26 4:49 PM
 * 修改备注：
 * @version
 */
class Zoo(animal: Animal) : Animal by animal {
}
