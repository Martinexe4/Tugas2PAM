package com.example.app.ui.helper

import androidx.fragment.app.Fragment
import com.example.app.R
import com.example.app.ui.skill.Skill

object ConstraintUtil {
    fun getSkillData(fragment: Fragment):ArrayList<Skill>{
        val skillArrayList = ArrayList<Skill>()
        val skills = fragment.resources.getStringArray(R.array.string_skill_array)
        val images = fragment.resources.getIntArray(R.array.integer_skill_array)
        for (i in 0 .. skills.size) {
            skillArrayList.add(Skill(images[i], skills[i]))
        }

        return skillArrayList

    }
}