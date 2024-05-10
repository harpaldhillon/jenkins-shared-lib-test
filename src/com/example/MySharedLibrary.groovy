package com.example

def hello() {
    println 'Hello from shared library!'
}

def goodbye() {
    println 'Goodbye from shared library!'
}

def isSemanticVersioning(String version) {
    // Regular expression for semantic versioning (SemVer) format
    def semverRegex = ~/\d+\.\d+\.\d+(-\w+(\.\d+)?)?/
    return version ==~ semverRegex
}