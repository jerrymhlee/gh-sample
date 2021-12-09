package com.github.jerrymhlee.ghsample.services

import com.intellij.openapi.project.Project
import com.github.jerrymhlee.ghsample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
