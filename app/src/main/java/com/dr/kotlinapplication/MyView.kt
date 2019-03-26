package com.dr.kotlinapplication

import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 * 项目名称：KotlinApplication
 * 类描述：构造函数声明
 * 创建人：yuliyan
 * 创建时间：2019/3/26 3:55 PM
 * 修改人：yuliyan
 * 修改时间：2019/3/26 3:55 PM
 * 修改备注：
 * @version
 */
class MyView : View {

    constructor(context: Context) : super(context)
    constructor(context: Context, attris: AttributeSet?) : this(context)
    constructor(context: Context, attris: AttributeSet?, defStyleAttr: Int? = 0) : this(context, null)
    constructor(context: Context, attris: AttributeSet?, defStyleAttr: Int? = 0, defStyleRes: Int? = 0) : this(
        context,
        attris,
        defStyleAttr
    )

    init {
        //init函数在构造函数执行之后执行
    }
}
