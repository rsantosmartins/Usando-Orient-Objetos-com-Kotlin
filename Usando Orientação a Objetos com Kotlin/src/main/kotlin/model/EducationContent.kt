package model

data class EducationContent(val title: String){
    private val steps = mutableListOf<Step>()
    private var duration: Int = 0

    fun addStep(step: Step){
        steps.add(step)
        duration += step.getDuration()
    }

    fun getSteps(): MutableList<Step> {
        return steps
    }

    fun getDuration(): Int{
        return this.duration
    }

}
