package com.dr.kotlinapplication.demo01

/**
 * 项目名称：KotlinApplication
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/3/26 4:15 PM
 * 修改人：yuliyan
 * 修改时间：2019/3/26 4:15 PM
 * 修改备注：
 * @version
 */
class Demo {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(StringUtils.isEmpty("张三"))
        }
    }


}


class StringUtils {
    companion object {
        fun isEmpty(str: String?): Boolean {
            return str.isNullOrEmpty()
        }

    }
}
