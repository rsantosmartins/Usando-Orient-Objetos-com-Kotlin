package model

data class Training(val name: String){
    private var duration = 0
    private val subscribed = mutableListOf<User>()
    private val content = mutableListOf<EducationContent>()

    fun register(user: User){
        subscribed.add(user)
    }

    fun getSubscribed(): MutableList<User>{
        return this.subscribed
    }

    fun addContent(educationContent: EducationContent){
        content.add(educationContent)
        duration += educationContent.getDuration()
    }

    fun getDuration(): Int{
        return this.duration
    }
}
