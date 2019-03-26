package com.dr.kotlinapplication.demo04

/**
 * 项目名称：KotlinApplication
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/3/26 5:07 PM
 * 修改人：yuliyan
 * 修改时间：2019/3/26 5:07 PM
 * 修改备注：
 * @version
 */
sealed class SupperCommand {
    object A :SupperCommand()
    object B :SupperCommand()
    object C :SupperCommand()
    object D :SupperCommand()
}
