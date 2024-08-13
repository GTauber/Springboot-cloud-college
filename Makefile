run-deps: ## Run dependencies
	cd docker/SPB-Cloud-compose && docker-compose -f docker-compose.yml up

migration: ## Execute DB migrations
	./gradlew -Dflyway.configFiles=flyway.conf flywayMigrate

clean-db: ## reset db
	./gradlew -Dflyway.configFiles=flyway.conf flywayClean