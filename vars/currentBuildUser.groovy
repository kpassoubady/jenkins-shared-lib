String call() {
    return currentBuildUser()
}

@NonCPS
String currentBuildUser() {
    userId = currentBuild.rawBuild.getCause(Cause.UserIdCause).userId ?: 'timer'
    return userId
}
