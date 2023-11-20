package pers.zy.asmlib

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author: zy
 * @date: 2023/11/20
 */
class TestPlugin : Plugin<Project> {
  override fun apply(target: Project) {
    println("testPlugin apply ${target.name}")
  }
}