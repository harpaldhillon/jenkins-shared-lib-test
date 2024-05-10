package com.example

import spock.lang.Specification

class MySharedLibraryTest extends Specification {
    def "test addition"() {
        given:
        def result = MySharedLibrary.add(2, 3)
        
        expect:
        result == 5
    }
}
