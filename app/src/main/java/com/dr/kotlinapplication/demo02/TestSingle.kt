package com.dr.kotlinapplication.demo02

/**
 * 项目名称：KotlinApplication
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/3/26 4:35 PM
 * 修改人：yuliyan
 * 修改时间：2019/3/26 4:35 PM
 * 修改备注：
 * @version
 */
class TestSingle {

    companion object {
        @JvmStatic
        fun main(arg: Array<String>) {
            Single.get().echo("shsshjsj")
        }
    }
}
