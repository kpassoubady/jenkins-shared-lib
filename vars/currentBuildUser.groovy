String call() {
    return currentBuildUser()
}

@NonCPS
String currentBuildUser() {
    return currentBuild.rawBuild.getCause(Cause.UserIdCause).userId ?: 'timer'
}
