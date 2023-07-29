rootProject.name = "java-gradle"
include("src")
include("src:test")
findProject(":src:test")?.name = "test"
