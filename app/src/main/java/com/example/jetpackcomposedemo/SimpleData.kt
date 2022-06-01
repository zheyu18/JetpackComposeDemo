package com.example.jetpackcomposedemo

/**
 * Email 3301360040@qq.com
 * Created by ZheYu on 2022/6/1.
 * Description:
 */
object SimpleData {

    fun getData(): MutableList<Message> {
        val dataList = mutableListOf<Message>()
        (0..50).toMutableList().forEach { index->
            dataList.add(Message("姓名$index", "对话内容对话内容对话内容对话内容对话内容对话内容对话内容对话内容$index"))
        }
        return dataList
    }
}