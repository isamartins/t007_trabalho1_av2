package br.unifor.ads.pomodroid.entity

data class TaskList(
        val id:Long? = null,
        val name:String,
        val description:String,
        val user: User
)