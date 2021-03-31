rootProject.name = "spring-boot-guide"

include("common")

include("app/common-api")
include("app/internal-api")
include("infrastructure/postgres-infrastructure")
include("domain/domain-model")


rootProject.children.find { it.name == "app/common-api" }?.name = "app-common-api"
rootProject.children.find { it.name == "app/internal-api" }?.name = "app-internal-api"
rootProject.children.find { it.name == "infrastructure/postgres-infrastructure" }?.name = "postgres-infrastructure"
rootProject.children.find { it.name == "domain/domain-model" }?.name = "domain-model"
