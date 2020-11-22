rootProject.name = "spring-boot-guide"

include("app/common-api")
include("app/internal-api")

rootProject.children.find { it.name == "app/common-api" }?.name = "app-common-api"
rootProject.children.find { it.name == "app/internal-api" }?.name = "app-internal-api"