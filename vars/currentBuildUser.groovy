#!/usr/bin/env groovy

String call() {
    return currentBuildUser()
}

@NonCPS
String currentBuildUser() {
    userId = currentBuild.rawBuild.getCause(Cause.UserIdCause).userId
    userId = userId == null ? 'timer' : userId
    echo "userId: ${userId}"
    return userId
}
