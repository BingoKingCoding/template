package com.github.bingokingcoding.template.services

import com.intellij.openapi.project.Project
import com.github.bingokingcoding.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
