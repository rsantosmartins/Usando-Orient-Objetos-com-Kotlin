package model

data class Step(val title: String){
    private val lessons = mutableListOf<Lesson>()
    private var duration: Int = 1

    fun addLesson(vararg lesson: Lesson){
        lessons.addAll(lesson)
    }

    fun getLessons(): MutableList<Lesson>{
        return lessons
    }

    fun getDuration(): Int{
        lessons.forEach{
            duration += it.duration
        }
        return this.duration
    }
}
