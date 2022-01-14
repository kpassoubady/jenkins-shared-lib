#!/usr/bin/env groovy

void info(String message) {
    echo "INFO: ${message}"
}

void warning(String message) {
    echo "WARNING: ${message}"
}

void error(String message) {
    echo "ERROR: ${message}"
}

void debug(String message) {
    echo "DEBUG: ${message}"
}
