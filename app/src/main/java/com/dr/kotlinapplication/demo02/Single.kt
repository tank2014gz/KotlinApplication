package com.dr.kotlinapplication.demo02

/**
 * 项目名称：KotlinApplication
 * 类描述：伴生对象实现---单例类
 * 创建人：yuliyan
 * 创建时间：2019/3/26 4:31 PM
 * 修改人：yuliyan
 * 修改时间：2019/3/26 4:31 PM
 * 修改备注：
 * @version
 */
class Single private constructor() {
    companion object {
        fun get(): Single {
            return Holder.instant
        }

        private object Holder {
            val instant = Single()
        }
    }


    fun echo(string: String){
        println("name=$string")
    }
}

