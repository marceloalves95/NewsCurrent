jacoco:
	./gradlew testDebugUnitTestCoverage

jacoco-ui-components:
	./gradlew :core:ui-components:testDebugUnitTestCoverage

lint:
	./gradlew detekt
